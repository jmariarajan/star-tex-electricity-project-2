package com.bootcamp.utilityservice.electricityplan.service.restfulws;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
/*import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;*/
import javax.ws.rs.core.MediaType;

import com.bootcamp.utilityservice.electricityplan.dao.CustomerDAO;
import com.bootcamp.utilityservice.electricityplan.model.Customer;

/**
 * This class will provide the RESTful Webservices
 * @author Jude Mariarajan
 */
@Path("/Customer")
public class ElectricityPlanRESTfulService {

	@GET
	@Path("/{hey}")
	@Produces(MediaType.APPLICATION_JSON)
	@HeaderParam(value = "content-type = application/octet-stream")
	public Customer getCustomer(@PathParam("hey") int customerId) {

		CustomerDAO dao = new CustomerDAO();

		Customer customer = dao.getCustomerDetails(customerId);
		
		return customer;	

	}

}
