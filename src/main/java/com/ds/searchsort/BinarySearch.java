package com.ds.searchsort;

public class BinarySearch {
	
	public static void binarySearch(int [] arr,int value) {
		int highindex = arr.length-1;
		int lowindex = 0; 
		while(lowindex<=highindex) {
			int midindex = (lowindex+highindex)/2;
			if(value == arr[midindex]) {
				System.out.println("found ar index"+midindex);
			}
			if(value>arr[midindex]) {
				lowindex = midindex+1;
			}
			else {
				highindex = midindex-1;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		binarySearch(arr,6);
	}

}
