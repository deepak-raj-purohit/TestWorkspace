import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.A;

public class Starter {

	public static void main(String[] args) {
		
		/*Object obj = new Object();
		
	    synchronized (obj) {
		    try{
		    	obj.wait();
		    } catch (Exception e) {
		    	e.printStackTrace();
			}
	    }*/
	    

		
		/*// TODO Auto-generated method stub
		//Resource r = new ClassPathResource("spring-config.xml");
		//BeanFactory b = new XmlBeanFactory(r);
		
		ApplicationContext b = new ClassPathXmlApplicationContext("spring-config.xml");
		
		/*A a = (A)b.getBean("a");
		System.out.println("getting value : "+a.getDependency());
		System.out.println("getting integer value : "+a.getNumber());
		
		A a1 = b.getBean("proxy", A.class);
		a1.print();
		
		ABC abc = new ABC();
		abc.print(null);
		
		A1 a11 = new B1();
		a11.print();*/
		
	}

}

class A1 {
	
	public static  void print(){
		System.out.println("222222222");
	}
	
}

class B1 extends A1 {
	public static void print(){
		System.out.println("111111111");
	}
}

class ABC {
	public void print(int a) {
		System.out.println("printing object  ");
	}
	
	public void print(Object s) {
		System.out.println("printing object  ");
	}
	
	public void print(String s) {
		System.out.println("printing sss");
	}
	
}
