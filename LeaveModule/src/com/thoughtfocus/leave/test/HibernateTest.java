package com.thoughtfocus.leave.test;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateTest {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public static void main(String args[]){
		//Session s=sessionFactory.getCurrentSession();
	}

}
