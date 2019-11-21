package com.training.testcase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.tck.junit4.FunctionalTestCase;

public class MySQLTest extends FunctionalTestCase{
	@Test
	public void retrieveFlightsAddsAppropriateHeader() throws Exception {
		MuleEvent event = runFlow("mysql-mavenFlow");
		String contentType = event.getMessage().getOutboundProperty("Content-Type");
		assertEquals("application/json", contentType);
	}

}
