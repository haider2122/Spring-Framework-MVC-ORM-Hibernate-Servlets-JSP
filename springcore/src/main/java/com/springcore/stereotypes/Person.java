package com.springcore.stereotypes;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component("person")//Default value is class name in camel case
//Set default values in bracket
@Scope("singleton")
public class Person {
	
	@Value("Haider")//works without any getters or setters too
	private String name;

	private int age;
	@Value("#{mylist}")//importing standalone list values
	private List<String> countries;
	
	
	private House house;
	
	
	//Getting values using spEl
	
/*	@Value("T(House).hname")
	String housename;
	
	
	boolean isrich;*/
	
	
	
	//
	
	
	



	public int getAge() {
		return age;
	}

	@Value("22")
	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", countries=" + countries + ", house=" + house + "]";
	}

	public House getHouse() {
		return house;
	}
	@Autowired
	@Qualifier("house")
	public void setHouse(House house) {
		System.out.println("Setting house");
		this.house = house;
	}
	@Autowired
	public Person(House house) {
		super();
		System.out.println("Constructor house");
		this.house = house;
	}


	




	

}
