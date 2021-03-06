package com.bootcamp.customerserviceplan.registration;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.customerserviceplan.registration.service.SOAPServiceClient;

public class SOAPServiceClientTest {

	SOAPServiceClient clientTest;

	@Before
	public void setUp() {
		clientTest = mock(SOAPServiceClient.class);
	}

	@Test
	public void getServiceIdTest() {

		when(clientTest.getServiceId()).thenReturn(40001);

		System.out.println(clientTest.getServiceId());
		
		assertEquals(clientTest.getServiceId(), 40001);
		
		

	}

}
