package com.bootcamp.utilityservice.electricityplan.dao;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import com.bootcamp.utilityservice.electricityplan.model.Customer;
import com.bootcamp.utilityservice.electricityplan.utility.HibernateUtil;

/**
 * This class will get the customerId from the Customer Table
 * 
 * @author Jude Mariarajan
 *
 */
public class CustomerDAO {

	private static final Logger logger = Logger.getLogger(CustomerDAO.class);

	public Customer getCustomerDetails(int customerId) {

		Customer customer = new Customer();

		Session session = HibernateUtil.getSession();

		try {

			Query query = session.createQuery("from Customer where customerId = :customerId");

			query.setParameter("customerId", customerId);

			customer = (Customer) query.uniqueResult();

			logger.info("Customer Details = " + customer);

		} catch (HibernateException e) {

			e.printStackTrace();

			return null;

		} finally {

			HibernateUtil.closeSession();
		}

		return customer;

	}

}
