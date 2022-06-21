package com.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int bid;
	String bname;
	
	String bauthor;
	String bstatus;
	 
	String bnotes;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String getBstatus() {
		return bstatus;
	}

	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}

	public String getBnotes() {
		return bnotes;
	}

	public void setBnotes(String bnotes) {
		this.bnotes = bnotes;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", bstatus=" + bstatus + ", bnotes="
				+ bnotes + "]";
	}

}
