package com.ds.arrays;

public class ZeroOneTwoSort {

	public static void move(int arr[]) {
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp = arr[mid];
			    arr[mid] = arr[low];
			    arr[low] = temp;
				low++;
			    mid++;
			}
			if (arr[mid]==1) {
		         mid++;	
			}
			if (arr[mid]==2) {
				int temp = arr[mid];
			    arr[mid] = arr[high];
			    arr[high] = temp;
			    high--;
			}
		}
		
		for(int i: arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,0,0,2,2,1,1,2};
		move(arr);
	}

}
