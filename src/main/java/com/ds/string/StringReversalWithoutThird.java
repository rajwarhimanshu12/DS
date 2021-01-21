package com.ds.string;

public class StringReversalWithoutThird {
	
	public static void fun(String s) {
		int start=0;
		int end= s.length()-1;
		char[] c = s.toCharArray();
		while(start<end) {
			c[start] ^=c[end];
			c[end]   ^=c[start];
			c[start] ^=c[end];
			
			start++;
			end--;
		}
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		String s= "thisis";
		fun(s);

	}

}
