package com.bootcamp.customerserviceplan.registration.jms;

import javax.jms.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * This class is a message creator by the session 
 * @author Jude Mariarajan
 *
 */
@Component("messageSender")
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;

	public void sendMessage(final String message) {
		
		jmsTemplate.send(new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				
				return session.createTextMessage(message);
			}

		});

	}
}
