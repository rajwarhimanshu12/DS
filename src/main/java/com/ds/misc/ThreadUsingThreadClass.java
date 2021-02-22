package com.ds.misc;

class first extends Thread {
	
	public void run() {
		for(int i = 0;i< 5;i ++) {
			System.out.println("Thread 1 : "+ i+  "   "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
}

class second extends Thread{
	
	synchronized public void run() {
		for(int i = 0;i< 5;i ++) {
			System.out.println("Thread 2 : "+ i);
			try {
				Thread.sleep(1010);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
	
}

public class ThreadUsingThreadClass {
	
	public static void main(String args[]) throws InterruptedException {
		first obj1 = new first();
		first obj2 = new first();
		first obj3 = new first();
	//	second obj2 = new second();
		
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
