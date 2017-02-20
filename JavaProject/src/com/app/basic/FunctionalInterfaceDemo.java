package com.app.basic;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		I1Class c1 = new I1Class();
		c1.doanotherwork();
		C2 c2 = new C2(()-> {System.out.println("Call 1");System.out.println("Call 1");System.out.println("Call 1");System.out.println("Call 1");});
		c2.runLambda();
	}
}

@FunctionalInterface
interface I1 {
	void dowork();
	default void doanotherwork() {
		System.out.println("do another work");
	}
	
	boolean equals(Object o);
}

class I1Class implements I1{
	public void dowork() {
		System.out.println("Running this do work method");
	}
}

class C2 {
	
	I1 i;
	public C2(I1 i) {
		this.i = i;
	}
	
	public void runLambda() {
		i.dowork();
	}
}