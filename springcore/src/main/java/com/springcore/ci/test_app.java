package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_app {
	public static void main(String [] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/config_ci.xml");
	
		Person p=(Person) context.getBean("person");
		System.out.println(p);
 
		Addnumbers add=(Addnumbers) context.getBean("add");
		add.final_val();
	}

}
