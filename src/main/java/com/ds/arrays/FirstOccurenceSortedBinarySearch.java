package com.ds.arrays;

//find the first occurence of 1 in a sorted array
public class FirstOccurenceSortedBinarySearch {

	public static void main(String[] args) {
		int arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
		System.out.println(firstOccurence(arr));

	}

	private static int firstOccurence(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==1&&arr[mid-1]==0) {
				return mid;
			}
			else if(arr[mid]==1) {
				high = mid -1;
			}
			else {
				low = mid+1;	
			}		
		}
		return -1;
		
	}

}
