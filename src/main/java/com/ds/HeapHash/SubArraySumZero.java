	package com.ds.HeapHash;

import java.util.ArrayList;
import java.util.HashMap;
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
	
	public static void checkzeroSumArrayUsingSet(int[] arr) {
		Set<Integer> hs = new HashSet<Integer>();
		boolean found=false;
		int sumSoFar=0;
		for(int element: arr) {
			sumSoFar+=element;
			if(hs.contains(sumSoFar)||element==0||sumSoFar==0) {
				found = true;
				break;
			}
			hs.add(sumSoFar);
		}
		
		if(found) {
			System.out.println("PRESENT");
		}
		else
			System.out.println("NOT PRESENT");
			
	}
	
	private static void findzeroSumArrayUsingSet(int[] arr) {
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		
	}
	
	
	public static void main(String args[]) {
		int[] arr= {6, 3, -1, -3, 4, -2, 2,
	             4, 6, -12, -7};
	//	zeroSumBruteForce(arr);
		checkzeroSumArrayUsingSet(arr);
		
		findzeroSumArrayUsingSet(arr);
	}

	

}
