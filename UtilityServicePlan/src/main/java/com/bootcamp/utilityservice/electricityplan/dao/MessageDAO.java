package com.bootcamp.utilityservice.electricityplan.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bootcamp.utilityservice.electricityplan.model.Customer;
import com.bootcamp.utilityservice.electricityplan.utility.HibernateUtil;

/**
 * This class will add the serviceId according to the customerId
 * 
 * @author Jude Mariarajan
 *
 */
public class MessageDAO {

	public void addCustomerServicePlan(int customerId, int serviceId) {

		Session session = HibernateUtil.getSession();
		
		Transaction tx = session.beginTransaction();
		
		try {
			Query query = session.createQuery("update Customer set serviceId = :serviceId" + " where id = :customerId");
			query.setParameter("serviceId", serviceId);
			query.setParameter("customerId", customerId);
			System.out.println(query);
			int row = query.executeUpdate();
			System.out.println(row);
			tx.commit();
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
		} finally {
			
			HibernateUtil.closeSession();
		}
		

	}
	


}
