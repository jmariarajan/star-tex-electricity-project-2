package com.bootcamp.customerserviceplan.registration.service;

import java.io.IOException;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import com.bootcamp.customerserviceplan.registration.model.Customer;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * This class make a REST call from the UtilityServicePlan REST Service
 * 
 * @author Jude Mariarajan
 *
 */
public class RestfulServiceClient {

	public static Customer getCustomerDetails(int cid) throws IOException {

		Customer customer = null;

		try {
			
			DefaultClientConfig defaultClientConfig = new DefaultClientConfig();
			defaultClientConfig.getClasses().add(JacksonJsonProvider.class);
			Client client = Client.create(defaultClientConfig);
			WebResource webResource = client.resource("http://localhost:8080/UtilityServicePlan/rest/Customer/" + cid);

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			 customer = response.getEntity(Customer.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}


}