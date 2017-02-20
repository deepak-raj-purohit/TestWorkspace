package com.app.test.basic.thread;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreeThreads {

        public static void main(String[] args) throws InterruptedException {
              
        	Object monitor = new Object();
        	AtomicInteger atomicInt = new AtomicInteger(0);
        	                
                Thread t1 = new Thread(new Task1(monitor,atomicInt),"One");
                Thread t2 = new Thread(new Task2(monitor,atomicInt),"Two");
                Thread t3 = new Thread(new Task3(monitor,atomicInt),"Three");
                
                t1.start();
                t2.start();
                t3.start();
                               

        }     

}


class Task1 implements Runnable{

	Object  monitor = null;
	AtomicInteger  atomicInt = null;
	public Task1(Object monitor,AtomicInteger atomicInt) {
        this.atomicInt = atomicInt;
        this.monitor = monitor;
    }
    
    @Override
    public void run() {
            // TODO Auto-generated method stub
    	String[] str = new String[]{"A","B","C"};
    	for(String s:str) {
            try {
            	synchronized (monitor) {

            		while(atomicInt.get()%3!=0) {
            			monitor.wait();
            		}
            		System.out.println(s);
            		atomicInt.incrementAndGet();
            		monitor.notifyAll();

            	} 
                    
            } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
    	}
    }
    
}

class Task2 implements Runnable{

	Object  monitor = null;
	AtomicInteger  atomicInt = null;
	public Task2(Object monitor,AtomicInteger atomicInt) {
        this.atomicInt = atomicInt;
        this.monitor = monitor;
    }
    
    @Override
    public void run() {
            // TODO Auto-generated method stub
    	String[] str = new String[]{"1","2","3"};
    	for(String s:str) {
    		try {
    			synchronized (monitor) {
    				
    				while(atomicInt.get()%3!=1) {
    					monitor.wait();
    				}
    				System.out.println(s);
    				atomicInt.incrementAndGet();
    				monitor.notifyAll();
    				
    			} 
    			
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    	}
            
    }
    
}

class Task3 implements Runnable{

	Object  monitor = null;
	AtomicInteger  atomicInt = null;
	public Task3(Object monitor,AtomicInteger atomicInt) {
        this.atomicInt = atomicInt;
        this.monitor = monitor;
    }
    
    @Override
    public void run() {
            // TODO Auto-generated method stub
    	String[] str = new String[]{"a","b","c"};
    	for(String s:str) {
            try {
            	synchronized (monitor) {

            		while(atomicInt.get()%3!=2) {
            			monitor.wait();
            		}
            		System.out.println(s);
            		atomicInt.incrementAndGet();
            		monitor.notifyAll();

            	} 
                    
            } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
    	}
            
    }
    
}






