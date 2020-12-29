package com.ds.arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArraySumZero {

	public static void zeroSumBruteForce(int[] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+"  ");
					sum=sum+arr[k];	
				}
				System.out.print("           "+sum);
				System.out.println("");
			}
		}
	}
	
	public static void zeroSumArrayUsingSet(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		boolean found;
		int sum=0;
		for(int element: arr) {
			set.add(sum);
			sum+=element;
			if(set.contains(sum)) {
				found = true;
				break;
			}
		}
	}
	
	
	public static void main(String args[]) {
		int[] arr= {3,4,-7,-6};
	//	zeroSumBruteForce(arr);
		zeroSumArrayUsingSet(arr);
	}

}
