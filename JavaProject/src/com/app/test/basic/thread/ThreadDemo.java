package com.app.test.basic.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		ImportThread a1 = new ImportThread();
		Thread t = new Thread(a1);
		t.start();
		
		for(int i = 0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("importStatus===="+a1.importStatus);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		
		a1.shutdownThread();
		
	}
	
	
}


class ImportThread implements Runnable {
	
	int  importStatus = 0;
	volatile boolean isActive = true;
	public void run() {
		
		while(isActive) {
			try {
				Thread.sleep(1000);
				importStatus++;
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
	public void shutdownThread () {
		isActive = false;
	}
	
	public int getCurrentStatus() {
		return importStatus;
	}
	
}