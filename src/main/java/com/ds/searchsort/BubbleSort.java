package com.ds.searchsort;



public class BubbleSort {
	
	public static void sort(int[] arr ) {
		for(int j=0;j<arr.length-1;j++) {
			for(int i=0;i<arr.length-j-1;i++) {
				if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		for(int i: arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int arr[] = {2,1,4,5,3,8,7,6};
		for(int i: arr) {
			System.out.println(i);
		}
		sort(arr);
	}

}
