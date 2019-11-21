package com.training.testcase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.tck.junit4.FunctionalTestCase;

public class MySQLTest extends FunctionalTestCase{
	/*@Test
	public void retrieveFlightsAddsAppropriateHeader() throws Exception {
		MuleEvent event = runFlow("junitflow");
		String contentType = event.getMessage().getOutboundProperty("Content-Type");
		assertEquals("application/json", contentType);
	}*/
	
	   @Test
	    public void mavenFlowReturnsHelloMaven() throws Exception {
	        runFlowAndExpect("junitflow", "Hello Maven");
	    }
	
	   // run maven-config.xml when testing
    @Override
    protected String getConfigFile(){
      return "mysql-maven.xml";
    }


}
