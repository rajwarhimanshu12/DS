package com.ds.dynamic;

public class Fibonacci {
	
	public static int fibonacciRecursion(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1){
			return 1;
		}
		else
			return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
	}
	
	
	public static int fibonacciRecursionDynamic(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1){
			return 1;
		}
		else {
			return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
		}
	}
	
	public static void main(String args[]) {
		int n=6;
		for(int i=0;i<n;i++) {
		System.out.print(" "+fibonacciRecursion(i));
		}
	}
}
