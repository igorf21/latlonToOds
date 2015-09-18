package bsm.prototype.database.latlon;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReceiveLMUMsgXmlTest extends CamelBlueprintTestSupport {

	 @Override
	    protected String getBlueprintDescriptor() {
	          
	        return "OSGI-INF/blueprint/receive_LMU_Msg.xml";
	    }


	// Templates to send to input endpoints
	@Produce(uri = "activemq:queue:LatLonLMUUDevice")
	protected ProducerTemplate inputEndpoint;

 @Before
 public void before() throws Exception {
	

		context.getRouteDefinitions().get(0).adviceWith(context, new AdviceWithRouteBuilder() {
			@Override
			public void configure() throws Exception {
				replaceFromWith("direct:in");
				
				interceptSendToEndpoint("sqlTgt:.*")
          .skipSendToOriginalEndpoint().to("mock:sqlTgt:insertLMU");

			}
		});
		  
		context.start();
}
	@Test
	public void testSTURoute() throws Exception {
				
			  
		// Prepare Test Data
		
		List<Object> params = new ArrayList<Object>();
		
		Map<String, Object> recordNoAlarm = new HashMap<String, Object>();		   		  
		recordNoAlarm.put("MESSAGE_TYPE_ID", new String("1"));
		recordNoAlarm.put("MESSAGE_ID", new String("1"));
		recordNoAlarm.put("LMU_ID", new String("2222"));
		params.add(recordNoAlarm);
		
		Map<String, Object> recordAlarm1 = new HashMap<String, Object>();		   		  
		recordAlarm1.put("MESSAGE_TYPE_ID", new String("4"));
		recordAlarm1.put("MESSAGE_ID", new String("1"));
		recordAlarm1.put("LMU_ID", new String("3333"));
		params.add(recordAlarm1);
		
		Map<String, Object> recordAlarm2 = new HashMap<String, Object>();		   		  
		recordAlarm2.put("MESSAGE_TYPE_ID", new String("5"));
		recordAlarm2.put("MESSAGE_ID", new String("1"));
		recordAlarm2.put("LMU_ID", new String("4444"));
		params.add(recordAlarm2);

		context.start();

		// Define some expectations
		getMockEndpoint("mock:sqlTgt:insertLMU").expectedMessageCount(6);
		


		// Send test message to input endpoint
		inputEndpoint.sendBody("direct:in",recordNoAlarm);
		inputEndpoint.sendBody("direct:in",recordAlarm1);
		inputEndpoint.sendBody("direct:in",recordAlarm2);
		

		// Validate our expectations
		assertMockEndpointsSatisfied();
	}

}

