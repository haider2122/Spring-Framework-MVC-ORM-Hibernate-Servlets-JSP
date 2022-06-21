package com.springcore.collections;
import java.util.*;
public class Emp {

	String name;
	private List<String> awards;
	private	Set<String> address;
	private	Map<String, String> yearly_app;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAwards() {
		return awards;
	}
	public void setAwards(List<String> awards) {
		this.awards = awards;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getYearly_app() {
		return yearly_app;
	}
	public void setYearly_app(Map<String, String> yearly_app) {
		this.yearly_app = yearly_app;
	}
	public Emp(String name, List<String> awards, Set<String> address, Map<String, String> yearly_app) {
		super();
		this.name = name;
		this.awards = awards;
		this.address = address;
		this.yearly_app = yearly_app;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
