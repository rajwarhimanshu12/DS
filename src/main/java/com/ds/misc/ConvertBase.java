package com.ds.misc;
import java.util.*;

public class ConvertBase {

	public static void main(String[] args) {
		String value = "11A";
		int base=16;
		convert(value,base);
	}

	private static void convert(String value,int base) {
		int val=0;
		int number=0;
		 int j=0;
		for(int i=value.length()-1;i>=0;i--) {
			if(value.charAt(i)>'0'&& value.charAt(i)<'9' ) {
				val = (int)value.charAt(i);
			}
			else {
				val = value.charAt(i)-'A'+10;
			}
			 int Power = (int) Math.pow(base,j);
			 number  = number + (val*Power);
			 System.out.println("j is"+j+"         "+base+"              "+Power+"               "+number);
			 j++;
			 
		}
		System.out.println(number);
	}

}
