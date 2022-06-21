package com.mappings;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
	@Id
	int pid;
	String pname;
	
	//The belwo will end up creating 4 tables and 2 Relation tables
	@ManyToMany//(mappedBy="projects")//Map to get rid of extra Relation Table
	@JoinTable(name="Projects_Emp",
	joinColumns ={@JoinColumn(name="eid")},
	inverseJoinColumns={@JoinColumn(name="pid")}
	)

	List<Emp_mapping>  emp;
	
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Emp_mapping> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp_mapping> emp) {
		this.emp = emp;
	}


}
