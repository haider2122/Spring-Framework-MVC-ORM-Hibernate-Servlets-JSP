package com.project.Dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.project.Entities.Notes;
@Component("Dao")
@Scope("singleton")
public class NotesDao {




	
	public void CreateNotes(Notes note) {
		System.out.println("In CreateNotes Dao");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(note);
		tx.commit();
		
		session.close();
	}
	
	
	public List<Notes> getNotes() {
		System.out.println("In CreateNotes Dao");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		String query="from Notes";
		Query q=session.createQuery(query);
		
		
		List<Notes> notes=q.list();

		
		session.close();
		
		return notes;
	}
	
	
	public void deleteNote(int nid){
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.delete(session.get(Notes.class, nid));
		tx.commit();
		session.close();
	}
	
}
