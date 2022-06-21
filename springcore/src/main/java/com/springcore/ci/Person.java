package com.springcore.ci;

public class Person {
	private String pName;
	private int pId;
	private Course course;
	public Person(String pName,int pId, Course course) {
		super();
		this.pName = pName;
		this.pId=pId;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pId=" + pId + ", course=" + course+ "]";
	}


}
