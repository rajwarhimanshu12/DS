package com.ds.HeapHash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArraySumK {
	
	public static void checkKSumArrayUsingSet(int[] arr,int sum) {
		Set<Integer> hs = new HashSet<Integer>();
		boolean found=false;
		int sumSoFar=0;
		for(int element: arr) {
			sumSoFar+=element;
			if(hs.contains(sumSoFar-sum)||element==sum||sumSoFar==sum) {
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

	public static int findSubarraySum(int[] arr, int n, int sum) {
	       HashMap<Integer,Integer> prevSum = new HashMap<Integer,Integer>();
		return sum;
	}
	
	public static void CountNumberSubarraySum(int[] arr, int sum) {
	    HashMap<Integer,Integer> prevSum = new HashMap<Integer,Integer>();
		int sumSoFar=0;
		int count = 0;
		for(int element : arr) {
			sumSoFar+=element;
			if(sumSoFar==sum) {
				count++;
			}
			if(prevSum.containsKey(sumSoFar-sum)) {
				count = count + prevSum.get(sumSoFar-sum);
			}
			Integer currentCount = prevSum.get(sumSoFar);
			if(currentCount==null) {
				prevSum.put(sumSoFar, 1);
			}
			else {
				prevSum.put(sumSoFar, currentCount + 1);
			}
		}
		System.out.println(count);
	}
		
	public static void main(String[] args) {
		int arr[] = { 9, 4, 20, 3, 10, 5 };
        int sum = 33;
        int n = arr.length;
        checkKSumArrayUsingSet(arr, sum);
        CountNumberSubarraySum(arr, sum);
	}

}
