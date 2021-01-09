package com.ds.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Three Number Sum Problem (Find all triplets with the given sum)
public class AllTripletSum {

	public static void main(String[] args) {
		int[] arr = {1,1,2,5,3};
		int sum = 8;
		sum(arr,sum);
	}

	private static void sum(int[] arr,int sum) {
		for(int i = 0;i<arr.length;i++) {
			Set<Integer> set = new HashSet<Integer>();
			for(int j = i+1 ; j<arr.length; j++) {
				int complement = sum -(arr[i] + arr[j] );
				if(set.contains(complement)) {
					System.out.println(complement+" "+arr[i]+" "+arr[j]);
				}
				else {
					set.add(arr[j]);
				}
			}
		}
		
	}

}
