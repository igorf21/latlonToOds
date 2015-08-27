package bsm.prototype.database.latlon;




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataProcessor {
	
	private static final Logger LOG = LoggerFactory.getLogger(DataProcessor.class);

	public String setBodyToPayload(Exchange exchange) throws Exception {
		
		Map<String, Object> record = exchange.getIn().getBody(Map.class);
		
		exchange.setProperty("MsgType", record.get("Object"));
		exchange.setProperty("RecordID", record.get("ID"));
		//exchange.setProperty("RecordID", record.get("Payload"));
		String xmlPyload = (String)record.get("Payload");
		
		return xmlPyload;
	}
	
	

	
}
