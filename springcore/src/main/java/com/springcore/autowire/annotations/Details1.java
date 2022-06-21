package com.springcore.autowire.annotations;

public class Details1 {
	String name;
	int Id;
	
	public Details1(String name, int id) {
		super();
		this.name = name;
		Id = id;
	}

	public Details1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Details [name=" + name + ", Id=" + Id + "]";
	}
	

}
