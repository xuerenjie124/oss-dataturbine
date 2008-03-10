/*
 * ArchiveImageInterface.java
 * Created February, 2006
 * 
 * This work is supported in part by the George E. Brown, Jr. Network
 * for Earthquake Engineering Simulation (NEES) Program of the National
 * Science Foundation under Award Numbers CMS-0117853 and CMS-0402490.
 * 
 * Source information...
 *   $LastChangedRevision: 153 $
 *   $LastChangedDate: 2007-09-24 13:10:37 -0700 (Mon, 24 Sep 2007) $
 *   $HeadURL: file:///Users/hubbard/code/cleos-svn/cleos-rbnb-apps-dev/archive/src/org/nees/archive/inter/ArchiveImageSequenceInterface.java $
 *   $LastChangedBy: ljmiller $
 * 
 */
package org.nees.archive.inter;

import java.io.InputStream;

/**
 * Defines a cover for images from the repository - may use lazy evaluation.
 * 
 * @author Terry E Weymouth
 * @version $LastChangedRevision: 153 $ (Source Revision number)
 */
public interface ArchiveImageSequenceInterface extends ArchiveItemInterface {

    /** @return the stream that delivers the content of the image */
    public InputStream getImageInputStream();

    /** @see ArchiveItemInterface#CompareTo(Object)*/
    public int compareTo(ArchiveImageSequenceInterface test);

}
