package org.local_mode;

import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Tuple;

public class SenquenceBolt extends BaseBasicBolt{
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void execute(Tuple input, BasicOutputCollector collector) {
        // TODO Auto-generated method stub
         String word = (String) input.getValue(0);  
         String out = "I'm " + word +  "!";  
         System.out.println("out=" + out);
    }
    
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        // TODO Auto-generated method stub
    }
}