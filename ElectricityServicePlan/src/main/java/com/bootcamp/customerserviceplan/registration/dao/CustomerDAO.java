package com.bootcamp.customerserviceplan.registration.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bootcamp.customerserviceplan.registration.model.Customer;
/**
 * Adding the customer details into database
 * @author Bootcamp User 016
 *
 */
@Repository
public class CustomerDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerDAO.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	/*public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}*/

	public void addCustomer(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(customer);
		logger.info("Customer Details saved successfully, Customer Details = " + customer);
		
	}

	

	
}