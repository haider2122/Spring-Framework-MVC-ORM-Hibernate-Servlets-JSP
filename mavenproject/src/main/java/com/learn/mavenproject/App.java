package com.learn.mavenproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import First_Program.Employee;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("myxml.xml");
    	
    	Employee bean= (Employee)context.getBean("empBean");
    	
    	System.out.println("Name :"+ bean.getName()+"	EMp Id :"+bean.getEmpId()+"	Laptop Alloted: "+bean.getDevice().getModelno());
//    	System.out.printlnbean.getEmpId());
    	bean.setName("Mr. Haider");
    	Employee bean1= (Employee)context.getBean("empBean");
    	System.out.println("Name :"+ bean1.getName()+"	EMp Id :"+bean1.getEmpId()+"	Laptop Alloted: "+bean1.getDevice().getModelno());
    }
}
