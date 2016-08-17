package com.bootcamp.utilityservice.electricityplan.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import com.bootcamp.utilityservice.electricityplan.model.Customer;
import com.bootcamp.utilityservice.electricityplan.utility.HibernateUtil;
/**
 * This class will get the customerId from the Customer Table
 * @author Jude Mariarajan
 *
 */
public class CustomerDAO {
	
	public Customer getCustomerDetails(int customerId) {

		Customer customer = new Customer();

		Session session = HibernateUtil.getSessionFactory().openSession();


		try {

			Query query = session.createQuery("from Customer where customerId = :customerId");
			
			query.setParameter("customerId", customerId);
			
			customer = (Customer)query.uniqueResult();

		} catch (HibernateException e) {

			e.printStackTrace();
			
			return null;

		} finally {
			
			session.close();
		}

		return customer;

	}


}
