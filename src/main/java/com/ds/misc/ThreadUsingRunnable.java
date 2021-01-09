package com.ds.misc;

class firstclass implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i< 5;i ++) {
			System.out.println("Thread 1 : "+ i);
			try {
				Thread.sleep(1010);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class secondclass implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i< 5;i ++) {
			System.out.println("Thread 2 : "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ThreadUsingRunnable {
	
	public static void main(String[] args) {
		firstclass f = new firstclass();
		secondclass s = new secondclass();
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(s);
		t1.start();
		t2.start();
		

	}

}
