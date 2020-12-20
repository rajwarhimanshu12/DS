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

	public static void main(String[] args) {
		check(9);

	}

}
