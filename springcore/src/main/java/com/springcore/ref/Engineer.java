package com.springcore.ref;

public class Engineer {
	private String name;
	private Projects pj;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Engineer [name=" + name + ", pj=" + pj + "]";
	}
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engineer(String name, Projects pj) {
		super();
		this.name = name;
		this.pj = pj;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Projects getPj() {
		return pj;
	}
	public void setPj(Projects pj) {
		this.pj = pj;
	}
	
}
