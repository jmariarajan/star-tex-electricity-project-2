package com.bootcamp.customerserviceplan.registration.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.customerserviceplan.registration.dao.CustomerDAO;
import com.bootcamp.customerserviceplan.registration.jms.MessageSender;
import com.bootcamp.customerserviceplan.registration.model.Customer;
import com.bootcamp.customerserviceplan.registration.service.soapclient.ServicePlan;

/**
 * This class will pass the customer details from controller to DAO
 * 
 * @author Bootcamp User 016
 *
 */
@Service
public class CustomerService {

	@Autowired
	MessageSender msgSender;

	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Transactional
	public void addCustomer(Customer customer) {
		this.customerDAO.addCustomer(customer);
		getServicePlans(customer);
	}

	public void sendMessage(Customer customer) {

		int serviceId = SOAPServiceClient.getServiceId();
		
		int customerId = customer.getId();

		String message = customerId + ":" + serviceId;

		System.out.println("Message : " + message);
		
		msgSender.sendMessage(message);

	}
	
	public static void getServicePlans(Customer customer){
		
		List<ServicePlan> planDetails = (List<ServicePlan>)SOAPServiceClient.getServicePlan();
		
		ServicePlan servicePlan = planDetails.get(2);
		
		com.bootcamp.customerserviceplan.registration.model.ServicePlan plan = new com.bootcamp.customerserviceplan.registration.model.ServicePlan();
		
		plan.setServiceId(servicePlan.getServiceId());
		plan.setServicePlan(servicePlan.getServicePlan());
		plan.setServiceCharge(servicePlan.getServiceCharge());
		plan.setServicePeriod(servicePlan.getServicePeriod());
		
		customer.setPlanDetail(plan);
		
		
	}
	
	/*public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		getServicePlans(customer);
		
	}
*/
}
