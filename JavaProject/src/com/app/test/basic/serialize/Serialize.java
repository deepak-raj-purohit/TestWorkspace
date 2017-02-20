package com.app.test.basic.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	
	public static void main(String[] args) {

		//writeobject();
		
		readobject();
	}
	
	private static void readobject() {
		Employee emp = null;
		try {
			FileInputStream fin = new FileInputStream("/home/deepak/Desktop/bugathon/emp.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			emp = (Employee)in.readObject();
			System.out.println(emp);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void writeobject() {
		Employee emp = new Employee();
		emp.setAddress("");
		emp.setName("Deepak");
		emp.setSSN(123456789);
		emp.setNumber(4298);
		emp.setPhoneno(123456789);
		
		try {
			FileOutputStream fout = new FileOutputStream("/home/deepak/Desktop/bugathon/emp.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(emp);
			out.close();
			fout.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
