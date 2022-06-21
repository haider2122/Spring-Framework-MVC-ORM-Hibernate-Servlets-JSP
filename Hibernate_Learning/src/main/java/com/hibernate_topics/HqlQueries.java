package com.hibernate_topics;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;//new version
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlQueries {
	
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	
	Transaction tx=session.beginTransaction();
	
	//Retrieve values
	String query="from Employee where dept.deptid=20";
	
	query="from Employee as e where e.sal>22000 and e.dept.deptid=:y";
	
	Query  q=session.createQuery(query);
	
	
	//q.setParameter("x", 22000);
	q.setParameter("y", 20);
	
	List<Employee> emp_list=q.list();
	
	for (Employee e : emp_list) {
		System.out.println(e.getEname()+": "+e.getDept().getDname());
	}
	
	//Delete values
	
	query="delete from Employee as e where e.ename='John'";
	
	Query qr= session.createQuery(query);
	
	
	int val=qr.executeUpdate();
	
	System.out.println("John has been removed from the table|| Result: "+val);
	
	//Update Values;
	
	
	qr=session.createQuery("update Employee as e set e.ename=:new_name where e.ename=:old_name");
	
	qr.setParameter("new_name", "Gregory");
	qr.setParameter("old_name", "Greg");
	
	int val2=qr.executeUpdate();
	
	
	//Similarly you can write more complex queries like join and others
	System.out.println("Greg's name has been updated || Result: "+val2);
	
	//Pagination
	
	//Setting a lower value and retrieving
	
	Query<Employee> q_mul_val= session.createQuery("from Employee");
	
	q_mul_val.setFirstResult(1);
	q_mul_val.setMaxResults(20);//Use a Limit Statement under the hood
	
	for (Employee e: q_mul_val.list()) {
		System.out.println(e.getEname()+" "+e.getDept().getDname());
	}

	
	tx.commit();
	session.close();
	
}

}
