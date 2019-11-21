package com.training.testcase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class MySQLTest extends FunctionalTestCase{
	/*@Test
	public void retrieveFlightsAddsAppropriateHeader() throws Exception {
		MuleEvent event = runFlow("junitflow");
		String contentType = event.getMessage().getOutboundProperty("Content-Type");
		assertEquals("application/json", contentType);
	}*/
	
	   @Test
	    public void junitflowReturnsHelloMaven() throws Exception {
		// Creation of a MuleClient

		    
	        runFlowAndExpect("junitflow", "Hello Maven");
	    }
	
	   // run maven-config.xml when testing
    @Override
    protected String getConfigFile(){
      return "src/main/app/mysql-maven.xml";
    }


}
