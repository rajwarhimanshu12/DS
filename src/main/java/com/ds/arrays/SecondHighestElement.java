package com.ds.arrays;

public class SecondHighestElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
        find(arr);
	}

	private static void find(int[] arr) {
		int max=0;
		int secondmax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) {
				secondmax = max; 
				max=arr[i];
			}
			else if(arr[i]>secondmax) {
				secondmax=arr[i];
			}
		}
		System.out.println(secondmax);
		
	}

}
