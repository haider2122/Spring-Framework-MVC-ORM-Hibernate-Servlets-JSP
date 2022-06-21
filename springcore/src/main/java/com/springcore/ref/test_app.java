package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_app {
public static void main(String [] args){
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
	
	Engineer e= (Engineer) context.getBean("Engineer1");
	
	System.out.println(e.getPj());

	
	
	
}

}
