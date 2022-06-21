package com.hibernate_topics;

import javax.persistence.Embeddable;

@Embeddable//Does not create new table, but embedds into existing table that call it.
public class Department {

	int deptid;
	String dname;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}
