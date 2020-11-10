package com.ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionIntersectionArray {
	
	public static void UnionUsingCollection(int[] arr1,int[] arr2) {
	 List<Integer> l1 = new ArrayList<Integer>();
	 for(int i : arr1)
		 l1.add(i);
	 List<Integer> l2 = new ArrayList<Integer>();
	 for(int i : arr2)
		 l2.add(i);
	 l1.addAll(l2);
	 System.out.println("Union"+l1);
	}
	
	public static void UnionSorted(int[] arr1,int[] arr2) {
		int i=0;
		int j=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				System.out.println(arr1[i]);
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				System.out.println(arr2[j]);
				j++;
			}
			else {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
		}
		while(i<arr1.length) {
			System.out.println(arr1[i]);
			i++;
		}
		while(j<arr2.length) {
			System.out.println(arr2[j]);
			j++;
		}
	}

	
	public static void IntersectionSorted(int[] arr1,int[] arr2) {
		int i=0;
		int j=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7};
		int arr2[]= {4,5,6,7,8,9,10};	
		UnionUsingCollection(arr1,arr2);
		
		UnionSorted(arr1,arr2);
		
		IntersectionSorted(arr1,arr2);
	}

}
