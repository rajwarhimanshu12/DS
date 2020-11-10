package com.ds.string;

import java.util.Scanner;

public class Reverse {
	
	public static void rev(String s) {
		String reverse="";
		//char[] charstring = s.toCharArray(); 
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse + s.charAt(i);
		}
		if(reverse.equals(s))
			System.out.println("PALINDORME");
		else
			System.out.println(" NOT A PALINDORME");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.next();
        rev(s);
	}

}
