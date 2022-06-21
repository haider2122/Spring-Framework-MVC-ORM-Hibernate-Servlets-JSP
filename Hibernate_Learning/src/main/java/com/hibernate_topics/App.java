package com.hibernate_topics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		//Creating Objects
/*		Employee e1=new Employee();
		Department d1=new Department();
		d1.setDeptid(10);
		d1.setDname("Accouting");
		//Embedding department into employee
		
		e1.setEmpid(1102);
		e1.setEname("John");
		e1.setSal(10000);
		e1.setDept(d1);
		*/
		
		/*Employee e1=new Employee();
		Department d1=new Department();
		d1.setDeptid(20);
		d1.setDname("Sales");
		//Embedding department into employee
		
		e1.setEmpid(1103);
		e1.setEname("Greg");
		e1.setSal(20000);
		e1.setDept(d1);
	*/
		
		/*Employee e1=new Employee();
		Department d1=new Department();
		d1.setDeptid(30);
		d1.setDname("IT");
		//Embedding department into employee
		
		e1.setEmpid(1104);
		e1.setEname("Haider");
		e1.setSal(25000);
		e1.setDept(d1);*/
		
		Employee e1=new Employee();
		Department d1=new Department();
		d1.setDeptid(20);
		d1.setDname("Sales");
		//Embedding department into employee
		
		e1.setEmpid(1105);
		e1.setEname("Rahul");
		e1.setSal(25000);
		e1.setDept(d1);
		Session session =factory.openSession();
		
		Transaction tx=session.beginTransaction();
	
		session.save(e1);
		tx.commit();
		
		session.close();
	}

}
