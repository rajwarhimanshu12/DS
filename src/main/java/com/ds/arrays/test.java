package com.ds.arrays;

import java.util.HashMap;

public class test {

	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int sum= 12;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<arr.length ; i++) {
			int complement = sum - arr[i];
			if(map.containsKey(complement)) {
				System.out.println(map.get(complement)+"  "+i);
			}
				map.put(arr[i],i);
				
		}
	}
}
