package com.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Here we'll be mapping question to an answer
		mapping one table to another using a foreign key*/
	
		Configuration cfg=new Configuration();
		
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
	
		//creating objects
		//OneToMany 
		
	/*	Question q1=new Question();
		Answer a1=new Answer();
		q1.setId(1001);
		q1.setQuestion("Who is Plato");
	
		a1.setId(322);
		a1.setAnswer("Greek Philosopher");
		
		q1.setAnswer(a1);
		
		a1.setQuestion(q1);*/
		
		//we are mapping OneToOne on both side, of question and answer
		//Hence we have to set one values on both sides
		
		
		
		//creating objects for OnetoMany
		/*
		Question q1=new Question();
		q1.setId(1001);
		q1.setQuestion("Who is Plato?");
		
		Answer a1=new Answer();
		a1.setId(201);
		a1.setAnswer("Greek Philosopher");
		a1.setQuestion(q1);
		
		
		Answer a2=new Answer();
		a2.setId(202);
		a2.setAnswer("Author of The Republic");
		a2.setQuestion(q1);
		
		ArrayList<Answer> answers_for_q1=new ArrayList<Answer>();
		answers_for_q1.add(a1);
		answers_for_q1.add(a2);
		
		q1.setAns(answers_for_q1);
		
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
	
		session.save(q1);
		session.save(a1);
		session.save(a2);
		
		
		tx.commit();
		
		session.close();*/
		
		Emp_mapping e1=new Emp_mapping();
		Emp_mapping e2=new Emp_mapping();
	
		Projects p1=new Projects();
		Projects p2=new Projects();
		
		e1.setEmpid(21);
		e1.setEname("Greg");
		
		e2.setEmpid(22);
		e2.setEname("Vince");
		
		
		p1.setPid(10);
		p1.setPname("GregMat");
		
		p2.setPid(20);
		p2.setPname("VinceGre");
		
		 
	List<Emp_mapping> emp_list=new ArrayList<Emp_mapping>();
	List<Projects> p_list=new ArrayList<Projects>();

	emp_list.add(e1);
	emp_list.add(e2);
	
	p_list.add(p1);
	p_list.add(p2);
	
	e1.setProjects(p_list);
	p2.setEmp(emp_list);
	
	e2.setProjects(p_list);
	p1.setEmp(emp_list);
	
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	session.save(e1);
	session.save(e2);
	session.save(p1);
	session.save(p2);
	tx.commit();
	session.close();
	
	}

}
