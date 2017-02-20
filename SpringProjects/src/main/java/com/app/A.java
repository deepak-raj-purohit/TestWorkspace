package com.app;

public class A {

	String dependency;
	int number;
	
	public A() {
		
	}

	public A(String dependency,int number) {
		this.dependency = dependency;
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDependency() {
		return dependency;
	}

	public void setDependency(String dependency) {
		this.dependency = dependency;
	}
	
	public void print() {
		System.out.println("Running main advice");
	}
	
}
