package com.bootcamp.utilityservice.electricityplan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.bootcamp.utilityservice.electricityplan.model.ServicePlan;
import com.bootcamp.utilityservice.electricityplan.utility.HibernateUtil;

public class ServicePlanDAO {

	/**
	 * This class will get the Service Plans from the database
	 * Save all the service plans as a list
	 * @return listOfPlans
	 */
	@SuppressWarnings("unchecked")
	public List<ServicePlan> getServicePlanDAO() {

		List<ServicePlan> listOfPlans = new ArrayList<ServicePlan>();

		Session session = HibernateUtil.getSession();

		try {

			listOfPlans = session.createQuery("from ServicePlan").list();

			System.out.println("list dao class");

		} catch (HibernateException e) {

			e.printStackTrace();

			return null;

		} finally {

			HibernateUtil.closeSession();
		}

		if (listOfPlans.isEmpty()) {

			return null;

		} else {

			return listOfPlans;
		}

	}

	
}
