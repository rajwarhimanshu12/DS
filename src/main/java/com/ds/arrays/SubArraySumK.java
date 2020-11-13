package com.ds.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SubArraySumK {
	
	public static void sumK(int[] arr,int k) {
		Set<Integer> set = new HashSet<Integer>();
		boolean found=false;
		int sum=0;
		int i=0;
		int index=0;
		for(i=0;i<arr.length;i++) {
			set.add(sum);
			sum+=arr[i];
			if(set.contains(sum-k)) {
				found = true;
				index = new ArrayList<Integer>(set).indexOf(sum-k);
				System.out.println("index"+index);
				break;
			}
		}
		if(found) {
			System.out.println("i "+i);
			System.out.println("FOUND");
		    for(int j=index;j<=i;j++) {
		    	System.out.println(arr[i]);
		    }
		}
		else
			System.out.println(" NOTFOUND");
	}

	public static void main(String[] args) {
		int[] arr= {5,0,5,10,3,2,-15,4};
        sumK(arr,18);
	}

}
