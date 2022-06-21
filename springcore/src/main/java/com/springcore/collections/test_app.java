package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/config_collections.xml");
	
		Emp e= (Emp) context.getBean("Emp1");
		System.out.println(e.getName());
		System.out.println(e.getAwards().toString());
		System.out.println(e.getAddress().toString());
		System.out.println(e.getYearly_app().toString());
	
	}

}
