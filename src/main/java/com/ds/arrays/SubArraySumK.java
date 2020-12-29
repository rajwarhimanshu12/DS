package com.ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {

	public static void sumK(int[] arr, int k) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(k - arr[i])) {
				map.put(arr[i], i);
			} else {
				result[0] = map.get(k - arr[i]);
				result[1] = i;
			}
		}
		for (int index : result)
			System.out.println(index);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 11, 5, 10, 7, 8 ,6};
		sumK(arr, 16);
	}

}
