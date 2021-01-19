package com.ds.searchsort;

public class sample {
	
	public static void mergeSort(int arr[], int length) {
		if(arr.length<2) {
			return;
		}
		int leftSize = length/2;
		int rightSize =	length-leftSize;	
		int left[] = new int[leftSize];
		int right[] = new int[rightSize];
		for(int i = 0; i< leftSize ; i++) {
			left[i] = arr[i];
		}
		for(int i = leftSize; i< arr.length; i++) {
			right[i-leftSize] = arr[i];
		}
		mergeSort(left,leftSize);
		mergeSort(right,rightSize);
		mergeArray(left,right,arr);
	}
	
	public static void mergeArray(int left[] , int right[], int arr[]) {
		int leftSize = left.length;
		int rightSize =	right.length;
		int i = 0,j = 0,k = 0;
		while(i < leftSize && j < rightSize) {
		if(left[i]<=right[j]) {
			arr[k] = left[i];
			i++;
			k++;
		}
		else {
			arr[k] = right[j];
			j++;
			k++;
		}
		}
		while(i<leftSize) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<rightSize) {
			arr[k]=right[j];
	    	j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int arr[] = {2,9,1,4,5,7,3};
		mergeSort(arr,arr.length);
		for(int i: arr) {
			System.out.println(i);
		}
		
	}

}
