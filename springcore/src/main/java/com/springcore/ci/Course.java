package com.springcore.ci;

public class Course {
	String cName;
	public Course(String cName){
		this.cName=cName;
	}
	@Override
	public String toString() {
		return "Course [cName=" + cName + "]";
	}

}
