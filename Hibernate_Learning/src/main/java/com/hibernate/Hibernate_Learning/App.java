package com.hibernate.Hibernate_Learning;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	System.out.println("Starting Program");
    	
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Student student=new Student();
    	//Getting Student obejct
   
    	student.setId(103);
    	student.setName("Rob");
    	student.setMarks("300");
   
   
    	//Getting Club obejct
    	
    	Club club =new Club();
    	
    	club.setName("GOT");
    	club.setLoc("Winterfell");
    	club.setActive(false);
    	club.setTransient_object(22.31);
    	club.setD(new Date());
    	//Save object process
    	
    	Session session= factory.openSession();
    	
    	
    	Transaction tx=session.beginTransaction();
    	System.out.println(student);
    	
    	session.save(student);
    	session.save(club);
    	
    	tx.commit();
    	session.close();
    
    
    }
}
