package com.ds.misc;

public class NumberPalindrome {
	
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int remainder = num%10;
			rev = remainder + rev*10;
			num = num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int i = reverse(1003);
		System.out.println(i);
	}

}
