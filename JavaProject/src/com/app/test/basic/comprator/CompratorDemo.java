package com.app.test.basic.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompratorDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		HDTV hdtv1 = new HDTV();
		hdtv1.setSize(10);
		hdtv1.setAge(3);
		al.add(hdtv1);
		
		hdtv1 = new HDTV();
		hdtv1.setSize(11);
		hdtv1.setAge(2);
		al.add(hdtv1);
		
		hdtv1 = new HDTV();
		hdtv1.setSize(9);
		hdtv1.setAge(10);
		al.add(hdtv1);
		
		hdtv1 = new HDTV();
		hdtv1.setSize(15);
		hdtv1.setAge(1);
		al.add(hdtv1);
		
		//Collections.sort(al,new AgeComprator());
		
		Comparator c = Collections.reverseOrder(new AgeComprator());
		Collections.sort(al,c);
		
		for(Object tv : al) {
			System.out.println(((HDTV)tv).getSize() + "====="+((HDTV)tv).getAge());
		}
		
	}
	
	
	
}

class HDTV implements Comparable {

	private Integer size;
	private Integer age;
	
	
	
	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Integer getSize() {
		return size;
	}



	public void setSize(Integer size) {
		this.size = size;
	}



	@Override
	public int compareTo(Object o) {
		HDTV tv = (HDTV)o;		
		return this.getSize() - tv.getSize();
	}
	
}


class SizeComprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((HDTV)o1).getSize() - ((HDTV)o2).getSize();
	}
	
}

class AgeComprator implements Comparator {
	
	@Override
	public int compare(Object o1,Object o2) {
		return ((HDTV)o1).getAge() - ((HDTV)o2).getAge();
	}
}