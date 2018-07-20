package com.concretepage.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.concretepage.entity.Article;

public class HibernateConfiguration {/*

	static Session sessionObj;
	static SessionFactory sessionFactoryObj;


	// This Method Is Used To Create The Hibernate's SessionFactory Object
	private static Session getSession() {
		// Creating Configuration Instance & Passing Hibernate Configuration File
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 

		// Creating Hibernate SessionFactory Instance
		sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		
		return sessionFactoryObj.openSession();
	}
	
	public Article getRecod() {
		Session session = getSession();
		return (Article)session.get(Article.class, 2);
		
		
	}

	// Method 1: This Method Used To Create A New Student Record In The Database Table
	
*/}