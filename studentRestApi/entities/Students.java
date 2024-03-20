package com.studentRestApi.studentRestApi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	private int id;
	private String fname;
	private String lname;
	private long phoneNum;
	private String emailId;
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Students(int id, String fname, String lname, long phoneNum, String emailId) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phoneNum = phoneNum;
		this.emailId = emailId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public long getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Students [id=" + id + ", fname=" + fname + ", lname=" + lname + ", phoneNum=" + phoneNum + ", emailId="
				+ emailId + "]";
	}
	
	
}
