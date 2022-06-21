package com.orm.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductOrm")
public class ProductOrm {

	
	@Id
	int pid;
	
	String pname;

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

	@Override
	public String toString() {
		return "ProductOrm [pid=" + pid + ", pname=" + pname + "]";
	}



	
}
