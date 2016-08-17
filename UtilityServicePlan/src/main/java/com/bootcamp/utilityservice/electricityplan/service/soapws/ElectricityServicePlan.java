package com.bootcamp.utilityservice.electricityplan.service.soapws;

import com.bootcamp.utilityservice.electricityplan.model.ServicePlan;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * This is the ElectricityServicePlan Interface that will have the get customer method
 * @author Jude Mariarajan
 *
 */
@WebService
public interface ElectricityServicePlan {
	
	@WebMethod
	public List<ServicePlan> getElectricityServicePlan();

}
