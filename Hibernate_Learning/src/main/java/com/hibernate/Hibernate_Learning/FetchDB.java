package com.hibernate.Hibernate_Learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;

public class FetchDB {
	
	public static void main(String[] args) {
		//Two methods to get value is get and load
	/*	
		get						load
		
Return Null Value				Return exception 

Saves in session cache			uses lazy intitializer, hit DB when value needed
Hits DB once		


*/
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session =factory.openSession();
		
		Student st1= (Student)session.get(Student.class, 103);//Null if no values
	//	Student st2= (Student)session.load(Student.class, 101);//Exception if no value
		
		//Load doesn't call hit DB until necessary
		System.out.println(st1.toString());
		//System.out.println(st2.toString());
	}

}
