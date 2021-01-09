package com.ds.arrays;

import java.util.HashMap;
import java.util.Map;

//Given an array of size n and a number k, find all elements that appear more than n/k times

public class ApearMorethanNTimes {

	public static void main(String[] args) {
		int [] arr = {3, 1, 2, 2, 1, 2, 3, 3};
		int k = 4;
		fun(arr, k);

	}

	private static void fun(int[] arr, int k) {
		int x = arr.length/k;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
				map.put(arr[i],1);
		}
		for(Map.Entry<Integer, Integer>entry : map.entrySet()) {
			if(entry.getValue()>x) {
				System.out.println(entry.getKey());
			}
		}
		map.forEach((key ,v) -> System.out.println(key+" "+v));
	}

}
