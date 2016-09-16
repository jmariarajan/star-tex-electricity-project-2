package com.bootcamp.utilityservice.electricityplan.service.soapws;


import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bootcamp.utilityservice.electricityplan.dao.ServicePlanDAO;
import com.bootcamp.utilityservice.electricityplan.model.ServicePlan;

/**
 * This class implements the ElectricityServicePlan Interface
 * This class returns the service List by calling the getServicePlanDAO method from the ServicePlanDAO
 * @author Jude Mariarajan
 * @return serviceList
 *
 */
@WebService(endpointInterface = "com.bootcamp.utilityservice.electricityplan.service.soapws.ElectricityServicePlan",
serviceName="ElectricServicePlan")
public class ElectricityServicePlanImpl implements ElectricityServicePlan {

	
	public List<ServicePlan> getElectricityServicePlan(){

		ServicePlanDAO planDAO =  new ServicePlanDAO();
		
		List<ServicePlan> serviceList = new ArrayList<ServicePlan>();
		
		serviceList = planDAO.getServicePlanDAO();
		
		return serviceList;

	}



}
