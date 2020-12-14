package com.ds.searchsort;

public class InsertionSort {
	
	public static void sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j]>temp ) {
				arr[j+1]=arr[j];
				j = j-1;
			}
			arr[j+1]=temp;
		}
		
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
