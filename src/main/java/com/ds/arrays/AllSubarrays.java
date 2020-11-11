package com.ds.arrays;

public class AllSubarrays {
	
	public static void allsubarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
				System.out.println("");
			}
		}
		
	}
		
		public static void allsubarrayrecursion(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<i+1;j++) {
					System.out.println(arr[j]);
				}
			}
		
	}
	public static void main(String args[]) {
		int[] arr= {1,2,3,4};
		allsubarray(arr);
	}

}
