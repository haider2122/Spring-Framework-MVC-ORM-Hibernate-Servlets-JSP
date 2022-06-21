package com.springcore.autowire;

public class Details {
	String name;
	int Id;
	
	public Details(String name, int id) {
		super();
		this.name = name;
		Id = id;
	}

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Details [name=" + name + ", Id=" + Id + "]";
	}
	

}
