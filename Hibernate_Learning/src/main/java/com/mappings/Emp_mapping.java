package com.mappings;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="EmpMap")
public class Emp_mapping {
	@Id
	int empid;
	String ename;
	
	
	@ManyToMany
	@JoinTable(name="Emp_Projects",
	joinColumns ={@JoinColumn(name="eid")},
	inverseJoinColumns={@JoinColumn(name="pid")}
	)
	List <Projects> projects;
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public List<Projects> getProjects() {
		return projects;
	}


	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}



	
}
