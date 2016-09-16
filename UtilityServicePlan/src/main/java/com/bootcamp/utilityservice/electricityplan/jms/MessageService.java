package com.bootcamp.utilityservice.electricityplan.jms;

import javax.transaction.Transactional;

import com.bootcamp.utilityservice.electricityplan.dao.MessageDAO;

/**
 * This class will get the customerId and ServiceId from messageDAO 
 * @author Jude Mariarajan
 *
 */
public class MessageService {
	
	@Transactional
	public void setCustomerService(int customerId, int serviceId){
		
		MessageDAO messageDAO = new MessageDAO();
		
		messageDAO.addServiceId(customerId, serviceId);
		
		
	}
		
/*	public static void main(String[] args) {
		
		MessageService ms = new MessageService();
		
		ms.setCustomerService(2	, 10001);
		
		
	}*/

}
