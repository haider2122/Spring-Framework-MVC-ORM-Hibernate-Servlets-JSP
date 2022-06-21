package com.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.mvc.model.Books;


@Component
public class BooksDao {

	
	

	public void CreateBooks(Books books){
		System.out.println("In CreateBooks");
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(books);
		tx.commit();
		session.close();
	}
	
	
	
	public List<Books> getBooks(){
		
	
		System.out.println("In CreateBooks");
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		String query="from Books";
		
		Query q=session.createQuery(query);
		
		List<Books> books=q.list();
		
	
		
		return books;
	}
	
	
	public void deleteBook(int bid){
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
	Transaction tx=session.beginTransaction();
		
		session.delete(session.get(Books.class, bid));;
		tx.commit();
		session.close();
		
	}
	
	public String getNotes(int bid){
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
	String notes=(session.get(Books.class, bid)).getBnotes();
		session.close();
		
		return notes;
	}
}
