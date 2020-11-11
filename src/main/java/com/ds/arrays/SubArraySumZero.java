package com.ds.arrays;

public class SubArraySumZero {

	public static void zeroSumBruteForce(int[] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					//System.out.print(arr[k]);
					sum=sum+arr[k];
					System.out.println(" "+sum);
				}
				System.out.println("");
			}
			
		}
	}
	
	
	public static void main(String args[]) {
		int[] arr= {3,4,-7,-6};
		zeroSumBruteForce(arr);
	}

}
