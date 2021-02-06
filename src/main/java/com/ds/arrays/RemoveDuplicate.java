package com.ds.arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,3,4,4};
       //removextra(arr);
        remove(arr);
	}

	private static void remove(int[] arr) {
		Arrays.sort(arr);
		int j = 0; 
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		for(int i=0;i<=j;i++)
		System.out.println(arr[i]);
		
	}

	private static void removextra(int[] arr) {
		Arrays.sort(arr);
		int j = 0;
		int[] temp = new int[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		for(int i : temp)
		System.out.println(i);
	}

}
