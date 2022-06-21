package com.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp1 {
	@Autowired //directly
	@Qualifier("tempdetails1")
	private Details1 details;

	public Details1 getDetails() {
		return details;
	}
	
	 //setters
//	@Autowired //directly
//	@Qualifier("tempdetails2")
	public void setDetails(Details1 details) {
		System.out.println("Inside Setter Methods");
		this.details = details;
	}
		
	//Choose the right been to autowire using qualifiers
	
	//@Autowired //directly
//	@Qualifier("tempdetails2")//constrcutors
	public Emp1(Details1 details) {
		
		super();
		this.details = details;
		System.out.println("Inside Constructor");
	}

	
	public Emp1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Emp [details=" + details + "]";
	}

	
	

}
