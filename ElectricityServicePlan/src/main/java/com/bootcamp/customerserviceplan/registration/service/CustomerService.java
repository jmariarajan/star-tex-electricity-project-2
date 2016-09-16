package com.bootcamp.customerserviceplan.registration.service;

import java.io.IOException;
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
 * Send the customerID and serviceId to the Second Application
 * @author Jude Mariarajan
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
	public int addCustomer(Customer customer) {
		
		int customerId = this.customerDAO.addCustomer(customer);
		
		return customerId;
		
	}

	/**
	 * Send the message to second application
	 * @param customer
	 */
	public void sendMessage(Customer customer) {

		int serviceId = new SOAPServiceClient().getServiceId();
		
		int customerId = customer.getId();

		String message = customerId + ":" + serviceId;

		msgSender.sendMessage(message);

	}

	
	public Customer getCustomerDetails(int customerId){
		
		Customer customer = null;
		
		try {
			
			customer = RestfulServiceClient.getCustomerDetails(customerId);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return customer;
		
	}
	

}
