package com.bootcamp.customerserviceplan.registration.dao;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bootcamp.customerserviceplan.registration.model.Customer;

/**
 * Adding the customer details into database
 * 
 * @author Jude Mariarajan
 *
 */
@Repository
public class CustomerDAO {

	

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * public void setSessionFactory(SessionFactory sessionFactory){
	 * this.sessionFactory = sessionFactory; }
	 */

	public int addCustomer(Customer customer) {

		Session session = this.sessionFactory.getCurrentSession();

		int customerId = 0;

		try {

			customerId = (int) session.save(customer);

			

		} catch (HibernateException he) {

			he.printStackTrace();

		}
		
		return customerId;
	}

}