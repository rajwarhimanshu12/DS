package com.ds.misc;

import java.util.Arrays;

public class FirstNextGreaterSameDigit {
	
	public static void main(String args[]) {
		int number = 534976;
		nextGreater(number);
	}

	private static void nextGreater(int number) {
		char[] digits = String.valueOf(number).toCharArray();
		int i;
		for(i= digits.length-1;i>0 ; i--) {
			if(digits[i]>digits[i-1]) {
		       break;
			}	
		}
		if(i==0) {
			System.out.println("Not Possible");
		}
		else {
			char min = digits[i-1];
			int minIndex = i;
			for(int j=i;j<digits.length;j++) {
				if(digits[j]>min && digits[j]<digits[minIndex]) {
					minIndex = j;
				}
			}
			char temp = digits[minIndex];
			digits[minIndex] = digits[i-1];
			digits[i-1] = temp;			
		}
		Arrays.sort(digits,i,digits.length);
		System.out.println(digits);
	}

}
