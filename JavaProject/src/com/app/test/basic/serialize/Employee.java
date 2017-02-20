package com.app.test.basic.serialize;

import java.io.Serializable;

public class Employee implements Serializable {

	
	private static final long serialVersionUID = 1999L;
			
	private String name;
	public String address;
	private transient int SSN;
   	private int number;
   	private Integer phoneno;
   	
   	
   	
	
   	public String emailid;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", emailid="
				+ emailid + ", SSN=" + SSN + ", number=" + number
				+ ", phoneno=" + phoneno + "]";
	}
	
	public void setPhoneno(Integer phoneno) {
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	
	
	
	
	

	
}
