package com.ds.searchsort;

import java.util.HashMap;

public class FindPairSumDiffArray {
	
	
	public static void findSum(int[] arr,int sum) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(sum-arr[i])) {
				System.out.println(arr[hm.get(sum-arr[i])]+"  "+arr[i]);
			}
			hm.put(sum-arr[i], i);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 8, 5, 2, 5, 6, 7, 3, 9, 4};
		findSum(arr,9);
	}
}
