package com.ds.searchsort;

public class SelectionSort {
	
	public static void sort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minindex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minindex]) {
					minindex = j;
				}
				int temp = arr[minindex];
				arr[minindex] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {9,8,6,5,4,3,2,1,13,14,7};
		sort(arr);
		for(int i =0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
