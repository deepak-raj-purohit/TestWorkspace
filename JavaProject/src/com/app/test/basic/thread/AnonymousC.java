package com.app.test.basic.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AnonymousC {

	public static void main(String[] a) {
		
		AtomicInteger count = new AtomicInteger(0);
		Object monitor = new String();
		String[] strArr1 = new String[]{"1","2","3","4","5","6","7","8","9","10"};
		String[] strArr2 = new String[]{"A","B","C","D","E","F","G","H","I","J"};
		
		new Thread(new MyRunnable1(strArr1,monitor,count)).start();
		new Thread(new MyRunnable2(strArr2,monitor,count)).start();
		
	}
	
}
class MyRunnable1  implements Runnable {
	String[] arr;
	Object monitor;
	AtomicInteger count;
	public MyRunnable1(String[] arr,Object monitor,AtomicInteger count) {
		this.arr = arr;
		this.monitor = monitor;
		this.count = count;
	}
	
	public void run() {
		
		for(String s:arr) {
			synchronized(monitor) {
				try {
					while(count.get()%2!=0) {
						monitor.wait();
					}
					System.out.print(s);
					count.getAndIncrement();
	                monitor.notifyAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
		
	}
	
}


class MyRunnable2  implements Runnable {
	String[] arr;
	Object monitor;
	AtomicInteger count;
	public MyRunnable2(String[] arr,Object monitor,AtomicInteger count) {
		this.arr = arr;
		this.monitor = monitor;
		this.count = count;
	}
	
	public void run() {
		
		for(String s:arr) {
			synchronized(monitor) {
				try {
					while(count.get()%2==0) {
						monitor.wait();
					}
					System.out.print(s+" ");
					count.getAndIncrement();
	                monitor.notifyAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
		
	}
	
}