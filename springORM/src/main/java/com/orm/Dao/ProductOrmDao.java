package com.orm.Dao;



import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.Entity.ProductOrm;



public class ProductOrmDao {
	
	private HibernateTemplate hibernateTemplate;

@Transactional
public int insert(ProductOrm product){
	

	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	//this.hibernateTemplate.save(product);
	session.save(product);
	tx.commit();
	session.close();
	return 1;
	
}

/*public ProductOrmDao(Hibernate hibernateTemplate) {
	super();
	this.hibernateTemplate = hibernateTemplate;
}

public List<ProductOrm> fetchProduct(int pid){
	
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	String query="from ProductOrm where id=:val";
	Query q=session.createQuery(query);
	q.setParameter("val", pid);
	
	
	List<ProductOrm> p_list=q.list();
	
	
	return p_list;
	
	
}
@Transactional
public void delete(int pid){
	
	ProductOrm product=this.hibernateTemplate.get(ProductOrm.class, pid);
	
	this.hibernateTemplate.delete(product);
	
	
}
@Transactional
public void update(int pid){
	
	ProductOrm product=this.hibernateTemplate.get(ProductOrm.class, pid);
	
	this.hibernateTemplate.update(product);
	
	
}

*/


}
