package com.bootcamp.customerserviceplan.registration.service;

import java.util.List;

import com.bootcamp.customerserviceplan.registration.service.soapclient.ElectricServicePlan;
import com.bootcamp.customerserviceplan.registration.service.soapclient.ElectricityServicePlan;
import com.bootcamp.customerserviceplan.registration.service.soapclient.ServicePlan;

/**
 * This class make a SOAP call from the UtilityServicePlan SOAP Service
 * @author Jude Mariarajan
 *
 */
public class SOAPServiceClient {
	
	public static List<ServicePlan> getServicePlan(){
		
		ElectricServicePlan servicePlan = new ElectricServicePlan();
		
		ElectricityServicePlan service = servicePlan.getElectricityServicePlanImplPort();
		
		List<ServicePlan> serviceList = service.getElectricityServicePlan();
		
		return serviceList;		
	}
	
	public int getServiceId(){
		
		int serviceId = SOAPServiceClient.getServicePlan().get(3).getServiceId();
		
		return serviceId;		
	}


}
