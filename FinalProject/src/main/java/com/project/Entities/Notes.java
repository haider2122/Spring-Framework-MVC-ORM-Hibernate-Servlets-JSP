package com.project.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Notes")
public class Notes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int nid;
	
	
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	String nheader;
	String nnote;
	String nstatus;

	public String getNheader() {
		return nheader;
	}
	public void setNheader(String nheader) {
		this.nheader = nheader;
	}
	public String getNnote() {
		return nnote;
	}
	public void setNnote(String nnote) {
		this.nnote = nnote;
	}
	public String getNstatus() {
		return nstatus;
	}
	public void setNstatus(String nstatus) {
		this.nstatus = nstatus;
	}
	@Override
	public String toString() {
		return "Notes [nid=" + nid + ", nheader=" + nheader + ", nnote=" + nnote + ", nstatus=" + nstatus + "]";
	}


	
}
