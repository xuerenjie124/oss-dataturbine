package dtesp;



/**
 * <pre>
 * Temporary class needed for processing data in time order
 * This represents time stamped data received from a channel with one fetch 
 * 
 */
public class ReceivedDataFromChannel
{
	public String					sink_channel_name;
	public String 					event_name;
	double[] data;						// data received from one fetch in a channel
	double[] data_time;					// time stamp associated with it
	int index=0;						// how many data has been sent?
	
	// have we sent all?
	boolean IsEmpty()
	{
		if (index>=data.length) return true;
		return false;
	}
	
//	public SinkChannelItem GetSink()		{return sink_channel;}
	double	GetLastTime()			{return data_time[data_time.length-1];}
	
	double 	GetData()       		{return data[index];}
	double 	GetTime()       		{return data_time[index];}
	void 	Next()        			{index++;}						// get next data
	void 	Clear()					{index=0; data=null; data_time=null;}
};    