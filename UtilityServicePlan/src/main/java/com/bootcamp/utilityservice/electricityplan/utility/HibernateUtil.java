package com.bootcamp.utilityservice.electricityplan.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static Session hibernateSession;

	private static SessionFactory buildSessionFactory() {
		try {

			return new Configuration().configure().buildSessionFactory();

		} catch (Throwable exception) {

			System.err.println("Initial SessionFactory creation failed." + exception);

			throw new ExceptionInInitializerError(exception);
		}

	}

	public static Session getSession() {

		if (hibernateSession == null) {

			hibernateSession = sessionFactory.openSession();

		}

		return hibernateSession;
	}
	

	public static void closeSession() {

		if (hibernateSession != null) {

			hibernateSession.close();
			
			hibernateSession = null;

		}
	}
}