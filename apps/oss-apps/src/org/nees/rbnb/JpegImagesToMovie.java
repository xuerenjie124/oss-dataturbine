/*
 * Created on May 10, 2004
 */
package org.nees.rbnb;

/*
 * Derived from...
 * 
 * @(#)JpegImagesToMovie.java	1.3 01/03/13
 *
 * Copyright (c) 1999-2001 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Sun grants you ("Licensee") a non-exclusive, royalty free, license to use,
 * modify and redistribute this software in source and binary code form,
 * provided that i) this copyright notice and license appear on all copies of
 * the software; and ii) Licensee does not utilize the software in a manner
 * which is disparaging to Sun.
 *
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING ANY
 * IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR
 * NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN AND ITS LICENSORS SHALL NOT BE
 * LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 * OR DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN OR ITS
 * LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT,
 * INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
 * CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF
 * OR INABILITY TO USE SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *
 * This software is not designed or intended for use in on-line control of
 * aircraft, air traffic, aircraft navigation or aircraft communications; or in
 * the design, construction, operation or maintenance of any nuclear
 * facility. Licensee represents and warrants that it will not use or
 * redistribute the Software for such purposes.
 */

import java.io.*;
import java.util.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.media.*;
import javax.media.control.*;
import javax.media.protocol.*;
import javax.media.protocol.DataSource;
import javax.media.datasink.*;
import javax.media.format.VideoFormat;
import javax.media.format.AudioFormat;
import javax.imageio.ImageIO;
import com.sun.image.codec.jpeg.*;

import com.sun.media.multiplexer.*;

/**
 * This program takes a list of JPEG image files and convert them into
 * a QuickTime movie.
 */
public class JpegImagesToMovie implements ControllerListener, DataSinkListener {
	
	public boolean doIt(float frameRate, byte[][] images, MediaLocator outML)
	{
		int width = 480;
		int height = 320;
		
		byte[] data = images[0];
		// get the width and height from the first image in the buffer		
		JPEGImageDecoder decoder = JPEGCodec.createJPEGDecoder(new ByteArrayInputStream(data));
	
		// decode JPEG image to raw image
		BufferedImage bi;
		try {
			bi = decoder.decodeAsBufferedImage();
			height = bi.getHeight();
			width = bi.getWidth();
		} catch (IOException e){
			System.err.println("Failed to decode input JPEG image,  for height and width.");
		}

		PullBufferDataSource pbds = 
			(PullBufferDataSource) new ImageDataSourceArray(width, height, frameRate, images);
		return makeMovieFromPullBufferDataSource(width, height, frameRate, pbds, outML);
	}

    public boolean doIt(int width, int height, float frameRate, Vector inFiles, MediaLocator outML)
    {
		PullBufferDataSource ids =
			(PullBufferDataSource) new ImageDataSourceFile(width, height, frameRate, inFiles);

		return makeMovieFromPullBufferDataSource(width, height, frameRate, ids, outML);
    }
 
    public boolean makeMovieFromPullBufferDataSource(
    	int width, int height, float frameRate, 
    	PullBufferDataSource ids, MediaLocator outML)
    {
	Processor p;

		try {
		    System.err.println("- create processor for the image datasource ...");
		    p = Manager.createProcessor(ids);
		} catch (Exception e) {
		    System.err.println("Yikes!  Cannot create a processor from the data source.");
		    return false;
		}
	
		p.addControllerListener(this);
	
		// Put the Processor into configured state so we can set
		// some processing options on the processor.
		p.configure();
		if (!waitForState(p, p.Configured)) {
		    System.err.println("Failed to configure the processor.");
		    return false;
		}
	
		// Set the output content descriptor to QuickTime. 
		p.setContentDescriptor(new ContentDescriptor(FileTypeDescriptor.QUICKTIME));
	
		// Query for the processor for supported formats.
		// Then set it on the processor.
		TrackControl tcs[] = p.getTrackControls();
		Format f[] = tcs[0].getSupportedFormats();
		if (f == null || f.length <= 0) {
		    System.err.println("The mux does not support the input format: " + tcs[0].getFormat());
		    return false;
		}
	
		System.out.println("Found count="+f.length);
	
		for ( int i=0; i<f.length;i++ ) System.out.println("Found "+f[i]);
	
		tcs[0].setFormat(f[0]);
	
		System.err.println("Setting the track format to: " + f[0]);
	
		// We are done with programming the processor.  Let's just
		// realize it.
		p.realize();
		if (!waitForState(p, p.Realized)) {
		    System.err.println("Failed to realize the processor.");
		    return false;
		}
	
		ContentDescriptor[] descriptors = p.getSupportedContentDescriptors();
		for (int n = 0; n < descriptors.length; n++) {
			System.out.println("Desc: " + descriptors[n].toString());
		}

      	DataSource output = p.getDataOutput();

        System.out.println("DataSource type: ");
        Class cls = output.getClass();
        while (cls != null) {
            System.out.println(cls.toString());
            cls = cls.getSuperclass();
        }

		// Now, we'll need to create a DataSink.
		DataSink dsink;
		if ((dsink = createDataSink(p, outML)) == null) {
		    System.err.println("Failed to create a DataSink for the given output MediaLocator: " + outML);
		    return false;
		}

		dsink.addDataSinkListener(this);
	
		fileDone = false;
	
		System.err.println("start processing...");
	
		// OK, we can now start the actual transcoding.
		try {
		    p.start();
		    dsink.start();
		} catch (Exception e) {
		    System.err.println("IO error during processing");
		    return false;
		}
	
		// Wait for EndOfStream event.
		waitForFileDone();
	
		// Cleanup.
		try {
		    dsink.close();
		} catch (Exception e) {}
		p.removeControllerListener(this);
	
		System.err.println("...done processing.");
	
		return true;
    }

    /**
     * Create the DataSink.
     */
    DataSink createDataSink(Processor p, MediaLocator outML) {

		DataSource ds;
	
		if ((ds = p.getDataOutput()) == null) {
		    System.err.println("Something is really wrong: the processor does not have an output DataSource");
		    return null;
		}
	
		DataSink dsink;
	
		try {
		    System.err.println("- create DataSink for: " + outML);
		    dsink = Manager.createDataSink(ds, outML);
		    dsink.open();
		} catch (Exception e) {
		    System.err.println("Cannot create the DataSink: " + e);
		    return null;
		}
	
		return dsink;
    }


    Object waitSync = new Object();
    boolean stateTransitionOK = true;

    /**
     * Block until the processor has transitioned to the given state.
     * Return false if the transition failed.
     */
    boolean waitForState(Processor p, int state) {
		synchronized (waitSync) {
		    try {
			while (p.getState() < state && stateTransitionOK)
			    waitSync.wait();
		    } catch (Exception e) {}
		}
		return stateTransitionOK;
    }

    /**
     * Controller Listener.
     */
    public void controllerUpdate(ControllerEvent evt) {
	
		if (evt instanceof ConfigureCompleteEvent ||
		    evt instanceof RealizeCompleteEvent ||
		    evt instanceof PrefetchCompleteEvent) {
		    synchronized (waitSync) {
			stateTransitionOK = true;
			waitSync.notifyAll();
		    }
		} else if (evt instanceof ResourceUnavailableEvent) {
		    synchronized (waitSync) {
			stateTransitionOK = false;
			waitSync.notifyAll();
		    }
		} else if (evt instanceof EndOfMediaEvent) {
		    evt.getSourceController().stop();
		    evt.getSourceController().close();
		}
    }


    Object waitFileSync = new Object();
    boolean fileDone = false;
    boolean fileSuccess = true;

    /**
     * Block until file writing is done. 
     */
    boolean waitForFileDone() {
		synchronized (waitFileSync) {
		    try {
			while (!fileDone)
			    waitFileSync.wait();
		    } catch (Exception e) {}
		}
		return fileSuccess;
    }


    /**
     * Event handler for the file writer.
     */
    public void dataSinkUpdate(DataSinkEvent evt) {
	
		if (evt instanceof EndOfStreamEvent) {
		    synchronized (waitFileSync) {
			fileDone = true;
			waitFileSync.notifyAll();
		    }
		} else if (evt instanceof DataSinkErrorEvent) {
		    synchronized (waitFileSync) {
			fileDone = true;
			fileSuccess = false;
			waitFileSync.notifyAll();
		    }
		}
    }


    public static void main(String args[]) {
	
		if (args.length == 0)
		    prUsage();
	
		// Parse the arguments.
		int i = 0;
		int width = -1, height = -1;
		float frameRate = (float)1.0;
		Vector inputFiles = new Vector();
		String outputURL = null;
	
		while (i < args.length) {
	
		    if (args[i].equals("-w")) {
			i++;
			if (i >= args.length)
			    prUsage();
			width = new Integer(args[i]).intValue();
		    } else if (args[i].equals("-h")) {
			i++;
			if (i >= args.length)
			    prUsage();
			height = new Integer(args[i]).intValue();
		    } else if (args[i].equals("-f")) {
			i++;
			if (i >= args.length)
			    prUsage();
			    
			frameRate = Float.parseFloat(args[i]);
		    } else if (args[i].equals("-o")) {
			i++;
			if (i >= args.length)
			    prUsage();
			outputURL = args[i];
		    } else {
			inputFiles.addElement(args[i]);
		    }
		    i++;
		}
	
		if (outputURL == null || inputFiles.size() == 0)
		    prUsage();
	
		// Check for output file extension.
		if (!outputURL.endsWith(".mov") && !outputURL.endsWith(".MOV")) {
		    System.err.println("The output file extension should end with a .mov extension");
		    prUsage();
		}
	
		if (width < 0 || height < 0) {
		    System.err.println("Please specify the correct image size.");
		    prUsage();
		}
	
		// Check the frame rate.
		if (frameRate < (float)1.0)
		    frameRate = (float)1.0;
	
		// Generate the output media locators.
		MediaLocator oml;
	
		if ((oml = createMediaLocator(outputURL)) == null) {
		    System.err.println("Cannot build media locator from: " + outputURL);
		    System.exit(0);
		}
	
		JpegImagesToMovie imageToMovie = new JpegImagesToMovie();
		imageToMovie.doIt(width, height, frameRate, inputFiles, oml);
	
		System.exit(0);
	    }
	
	    static void prUsage() {
		System.err.println("Usage: java JpegImagesToMovie -w <width> -h <height> -f <frame rate> -o <output URL> <input JPEG file 1> <input JPEG file 2> ...");
		System.exit(-1);
    }

    /**
     * Create a media locator from the given string.
     */
    static MediaLocator createMediaLocator(String url) {
	
		MediaLocator ml;
	
		if (url.indexOf(":") > 0 && (ml = new MediaLocator(url)) != null)
		    return ml;
	
		if (url.startsWith(File.separator)) {
		    if ((ml = new MediaLocator("file:" + url)) != null)
			return ml;
		} else {
		    String file = "file:" + System.getProperty("user.dir") + File.separator + url;
		    if ((ml = new MediaLocator(file)) != null)
			return ml;
		}
	
		return null;
    }


    ///////////////////////////////////////////////
    //
    // Inner classes.
    ///////////////////////////////////////////////

	/**
	 * A DataSource to read from a list of JPEG image files and
	 * turn that into a stream of JMF buffers.
	 * The DataSource is not seekable or positionable.
	 */
	class ImageDataSourceArray extends PullBufferDataSource
	{

		ImageDataSourceArrayStream streams[];

		ImageDataSourceArray(int width, int height, float frameRate, byte[][] images) {
			streams = new ImageDataSourceArrayStream[1];
			streams[0] = new ImageDataSourceArrayStream(width, height, frameRate, images);
		}

		public void setLocator(MediaLocator source) {
		}

		public MediaLocator getLocator() {
			return null;
		}

		/**
		 * Content type is of RAW since we are sending buffers of video
		 * frames without a container format.
		 */
		public String getContentType() {
			return ContentDescriptor.RAW;
		}

		public void connect() {
		}

		public void disconnect() {
		}

		public void start() {
		}

		public void stop() {
		}

		/**
		 * Return the ImageSourceStreams.
		 */
		public PullBufferStream[] getStreams() {
			return streams;
		}

		/**
		 * We could have derived the duration from the number of
		 * frames and frame rate.  But for the purpose of this program,
		 * it's not necessary.
		 */
		public Time getDuration() {
			return DURATION_UNKNOWN;
		}

		public Object[] getControls() {
			return new Object[0];
		}

		public Object getControl(String type) {
			return null;
		}
	}
	
	class ImageDataSourceArrayStream implements PullBufferStream
	{

		byte[][] images;
		int width, height;
		VideoFormat format;

		int nextImage = 0;	// index of the next image to be read.
		boolean ended = false;

		public ImageDataSourceArrayStream(int width, int height, float frameRate, byte[][] images) {
			this.width = width;
			this.height = height;
			this.images = images;

			format = new VideoFormat(VideoFormat.JPEG,
					new Dimension(width, height),
					Format.NOT_SPECIFIED,
					Format.byteArray,
					frameRate);
		}

		/**
		 * We should never need to block assuming data are read from files.
		 */
		public boolean willReadBlock() {
			return false;
		}

		/**
		 * This is called from the Processor to read a frame worth
		 * of video data.
		 */
		public void read(Buffer buf) throws IOException {

			// Check if we've finished all the frames.
			if (nextImage >= images.length) {
			// We are done.  Set EndOfMedia.
			System.err.println("Array: Done processing all images.");
			buf.setEOM(true);
			buf.setOffset(0);
			buf.setLength(0);
			ended = true;
			return;
			}

			byte[] data = images[nextImage];
			nextImage++;

			buf.setOffset(0);
			buf.setLength(data.length);
			buf.setFormat(format);
			buf.setFlags(buf.getFlags() | buf.FLAG_KEY_FRAME);
			buf.setData(data);

//	   Check the height and width of the read image to make sure that it is what 
//	   is expected - if not resize and update buffer

	JPEGImageDecoder decoder = JPEGCodec.createJPEGDecoder(new ByteArrayInputStream(data));

//	   decode JPEG image to raw image
	BufferedImage bi;
	try {
		bi = decoder.decodeAsBufferedImage();
		System.out.println("h="+bi.getHeight()+" w="+bi.getWidth());
		if ( height != bi.getHeight() || width != bi.getWidth() ) {
			System.out.println("Resizing... to "+width+" x "+height);
	
			Image newimg = bi.getScaledInstance(width, height, 0);

			System.out.println("Converting back to buffered image...");

			BufferedImage dest = null;
			dest = new BufferedImage(width, height, dest.TYPE_INT_RGB);
			dest.getGraphics().drawImage((Image) newimg, 0, 0, null);

			System.out.println("resized height="+dest.getHeight()+" w="+dest.getWidth());

					// encode scaled image as JPEG image                            
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
					try {
				System.out.println("Encoding resized image");
							encoder.encode(dest);
				System.out.println("Setting image as buffer");
							// get JPEG image data as byte array
				byte[] newdata = out.toByteArray();
				buf.setData(newdata);
	System.out.println("Length="+newdata.length);
					buf.setLength(newdata.length);
			} catch (IOException e) {
				System.err.println("Failed to encode output JPEG image, skipping.");
			}
		} // End if must resize

	} catch (IOException e){
	System.err.println("Failed to decode input JPEG image, skipping.");
//	   Leave buffer data in place
	}

		}

		/**
		 * Return the format of each video frame.  That will be JPEG.
		 */
		public Format getFormat() {
			return format;
		}

		public ContentDescriptor getContentDescriptor() {
			return new ContentDescriptor(ContentDescriptor.RAW);
		}

		public long getContentLength() {
			return 0;
		}

		public boolean endOfStream() {
			return ended;
		}

		public Object[] getControls() {
			return new Object[0];
		}

		public Object getControl(String type) {
			return null;
		}
		}

	
	    /**
	     * A DataSource to read from a list of JPEG image files and
	     * turn that into a stream of JMF buffers.
	     * The DataSource is not seekable or positionable.
	     */
	    class ImageDataSourceFile extends PullBufferDataSource {
	
		ImageSourceStream streams[];
	
		ImageDataSourceFile(int width, int height, float frameRate, Vector images) {
		    streams = new ImageSourceStream[1];
		    streams[0] = new ImageSourceStream(width, height, frameRate, images);
		}
	
		public void setLocator(MediaLocator source) {
		}
	
		public MediaLocator getLocator() {
		    return null;
		}
	
		/**
		 * Content type is of RAW since we are sending buffers of video
		 * frames without a container format.
		 */
		public String getContentType() {
		    return ContentDescriptor.RAW;
		}
	
		public void connect() {
		}
	
		public void disconnect() {
		}
	
		public void start() {
		}
	
		public void stop() {
		}
	
		/**
		 * Return the ImageSourceStreams.
		 */
		public PullBufferStream[] getStreams() {
		    return streams;
		}
	
		/**
		 * We could have derived the duration from the number of
		 * frames and frame rate.  But for the purpose of this program,
		 * it's not necessary.
		 */
		public Time getDuration() {
		    return DURATION_UNKNOWN;
		}
	
		public Object[] getControls() {
		    return new Object[0];
		}
	
		public Object getControl(String type) {
		    return null;
		}
	    }
	
	    /**
	     * The source stream to go along with ImageDataSource.
	     */
	    class ImageSourceStream implements PullBufferStream {
	
		Vector images;
		int width, height;
		VideoFormat format;
	
		int nextImage = 0;	// index of the next image to be read.
		boolean ended = false;
	
		public ImageSourceStream(int width, int height, float frameRate, Vector images) {
		    this.width = width;
		    this.height = height;
		    this.images = images;
	
		    format = new VideoFormat(VideoFormat.JPEG,
					new Dimension(width, height),
					Format.NOT_SPECIFIED,
					Format.byteArray,
					frameRate);
		}
	
		/**
		 * We should never need to block assuming data are read from files.
		 */
		public boolean willReadBlock() {
		    return false;
		}
	
		/**
		 * This is called from the Processor to read a frame worth
		 * of video data.
		 */
	 	public void read(Buffer buf) throws IOException {
	
		    // Check if we've finished all the frames.
		    if (nextImage >= images.size()) {
			// We are done.  Set EndOfMedia.
			System.err.println("Done reading all images.");
			buf.setEOM(true);
			buf.setOffset(0);
			buf.setLength(0);
			ended = true;
			return;
		    }
	
		    String imageFile = (String)images.elementAt(nextImage);
		    nextImage++;
	
		    System.err.println("  - reading image file: " + imageFile);
	
		    // Open a random access file for the next image. 
		    RandomAccessFile raFile;
		    raFile = new RandomAccessFile(imageFile, "r");
	
		    byte data[] = null;
	
		    // Check the input buffer type & size.
	
		    // if (buf.getData() instanceof byte[])
			// data = (byte[])buf.getData();
	
		    // Check to see the given buffer is big enough for the frame.
		    if (data == null || data.length < raFile.length()) {
			data = new byte[(int)raFile.length()];
		    }
	
		    // Read the entire JPEG image from the file.
		    raFile.readFully(data, 0, (int)raFile.length());
	
		    System.err.println("    read " + raFile.length() + " bytes.");
	
		    buf.setOffset(0);
		    buf.setLength((int)raFile.length());
		    buf.setFormat(format);
		    buf.setFlags(buf.getFlags() | buf.FLAG_KEY_FRAME);
		    buf.setData(data);
	
	// Check the height and width of the read image to make sure that it is what 
	// is expected - if not resize and update buffer
	
	JPEGImageDecoder decoder = JPEGCodec.createJPEGDecoder(new ByteArrayInputStream(data));
	
	// decode JPEG image to raw image
	BufferedImage bi;
	try {
		bi = decoder.decodeAsBufferedImage();
		System.out.println("h="+bi.getHeight()+" w="+bi.getWidth());
		if ( height != bi.getHeight() || width != bi.getWidth() ) {
			System.out.println("Resizing... to "+width+" x "+height);
		
			Image newimg = bi.getScaledInstance(width, height, 0);
	
			System.out.println("Converting back to buffered image...");
	
			BufferedImage dest = null;
			dest = new BufferedImage(width, height, dest.TYPE_INT_RGB);
			dest.getGraphics().drawImage((Image) newimg, 0, 0, null);
	
			System.out.println("resized height="+dest.getHeight()+" w="+dest.getWidth());
	
	                // encode scaled image as JPEG image                            
	                ByteArrayOutputStream out = new ByteArrayOutputStream();
	                JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
	                try {
				System.out.println("Encoding resized image");
	                        encoder.encode(dest);
				System.out.println("Setting image as buffer");
	                        // get JPEG image data as byte array
				byte[] newdata = out.toByteArray();
				buf.setData(newdata);
	System.out.println("Length="+newdata.length);
		    		buf.setLength(newdata.length);
			} catch (IOException e) {
				System.err.println("Failed to encode output JPEG image, skipping.");
			}
		} // End if must resize
	
	} catch (IOException e){
	System.err.println("Failed to decode input JPEG image, skipping.");
	// Leave buffer data in place
	}
	
		    // Close the random access file.
		    raFile.close();
		}
	
		/**
		 * Return the format of each video frame.  That will be JPEG.
		 */
		public Format getFormat() {
		    return format;
		}
	
		public ContentDescriptor getContentDescriptor() {
		    return new ContentDescriptor(ContentDescriptor.RAW);
		}
	
		public long getContentLength() {
		    return 0;
		}
	
		public boolean endOfStream() {
		    return ended;
		}
	
		public Object[] getControls() {
		    return new Object[0];
		}
	
		public Object getControl(String type) {
		    return null;
		}
	} // 

}
