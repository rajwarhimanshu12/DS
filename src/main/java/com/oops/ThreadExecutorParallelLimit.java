package com.oops;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Name:"+ Thread.currentThread().getName());	
		int count = 0;
		System.out.print("This is task "+ count++);
	}
	
}

public class ThreadExecutorParallelLimit {

	static ExecutorService service = Executors.newFixedThreadPool(8);
	
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		for(int i =0 ;i < 100 ; i++) {
			service.execute(new Task());
		}
	}

}
