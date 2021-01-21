package com.ds.misc;

public class CheckFibonacci {
	
	public static void check(int num) {
		int firstnum = 0;
		int secondnum = 1;
		int sum =0;
		boolean is = false;
		while(sum<num) {
			sum = firstnum +secondnum;
			if(sum == num) {
				is= true;
			}
			firstnum= secondnum;
			secondnum=sum;
		}
		if(is)
			System.out.println("fibo");
		else
			System.out.println("Not fibo");
	}
	
	private static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1 ;
		}
		return fib(n-1)+fib(n-2);
	}
	
	

	public static void main(String[] args) {
		check(9);

		for (int i = 0; i < 10; i++) { 
			  
            System.out.print(fib(i) + " "); 
        } 
	}

}
