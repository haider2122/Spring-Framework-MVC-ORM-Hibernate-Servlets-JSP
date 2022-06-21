package com.springcore.stereotypes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("house")
@Scope("prototype")
public class House {

	@Value("Winterfell")
	String hname;
	@Value("106A")
	String hno;
	@Override
	public String toString() {
		return "House [hname=" + hname + ", hno=" + hno + "]";
	}
	
	
	
	
	
	
}
