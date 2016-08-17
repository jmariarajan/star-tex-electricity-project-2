package com.bootcamp.utilityservice.electricityplan.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MessageReceiver implements MessageListener {

	@Override
	public void onMessage(Message message){
		
		TextMessage txtMsg = (TextMessage) message;
		
		
		System.out.println(txtMsg);
		
		try {
			
			String scid = txtMsg.getText();
			
			System.out.println(scid);
			
			String [] messageArray = scid.split(":");
			
			int serviceId = Integer.parseInt(messageArray[1]);
			int customerId = Integer.parseInt(messageArray[0]);
			
			//System.out.println(serviceId + " " + customerId);
					
			MessageService msgService = new MessageService();
			
			msgService.setCustomerService(customerId, serviceId);
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
