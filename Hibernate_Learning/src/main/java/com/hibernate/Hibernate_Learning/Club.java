package com.hibernate.Hibernate_Learning;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="StudentClub")
public class Club {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="clubid")
	//Automatically setting primary key values
	int id;
	
	@Column(name="clubname")
	String name;
	@Column(length=20,name="clubloc")
	String loc;
	@Column(length=20,name="status")
	boolean active;
	
	@Transient//Doesn't register in the database
	double transient_object;
	
	
	@Column(name="active_since")
	@Temporal(TemporalType.DATE)
	Date d;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public double getTransient_object() {
		return transient_object;
	}


	public void setTransient_object(double transient_object) {
		this.transient_object = transient_object;
	}


	public Date getD() {
		return d;
	}


	public void setD(java.util.Date date) {
		this.d = date;
	} 

}
