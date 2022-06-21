package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private Details details;

	public Details getDetails() {
		return details;
	}
	
	
	public void setDetails(Details details) {
		System.out.println("Inside Setter Methods");
		this.details = details;
	}

	public Emp(Details details) {
		
		super();
		this.details = details;
		System.out.println("Inside Constructor");
	}

	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Emp [details=" + details + "]";
	}

	
	

}
