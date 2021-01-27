package com.ds.arrays;

public class SecondMinMax {

	public static void main(String[] args) {
		int[] arr = {1,4,5,6,2,8,9,3,7};
		min(arr);
		max(arr);

	}

	private static void max(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i =0 ;i <arr.length; i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second && arr[i]!=first) {
				second = arr[i];
			}
		}
		System.out.println(first +"      "+second);
		
	}

	private static void min(int[] arr) {
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i =0 ;i <arr.length; i++) {
			if(arr[i]<first) {
				second = first;
				first =  arr[i];
				
			}
			else if(arr[i]<second && arr[i]!=first) {
				  second = arr[i];
			}
		}
		
		System.out.println(first +"      "+second);
		
	}

}
