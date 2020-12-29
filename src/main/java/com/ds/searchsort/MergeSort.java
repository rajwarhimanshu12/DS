package com.ds.searchsort;

public class MergeSort {

	public static void mergeSort(int arr[]) {
		int arrsize = arr.length;
		if(arrsize<2) {
			return;
		}
		int mid = arrsize / 2;
		int leftsize = mid;
		int rightsize = arrsize - mid;
		int[] leftArray = new int[leftsize];
		int[] rightArray = new int[rightsize];
		for (int i = 0; i < leftsize; i++) {
			leftArray[i] = arr[i];
		}
		for (int i = mid; i < arrsize; i++) {
			rightArray[i-mid] = arr[i];
		}
        mergeSort(leftArray);
        mergeSort(rightArray);
        mergeArray(arr,leftArray,rightArray);
	}

	public static void mergeArray(int[] arr, int[] leftArray, int[] rightArray) {
		int i = 0;
		int j = 0;
		int k = 0;
		int leftLength = leftArray.length;
		int rightLength = rightArray.length;
		while(i < leftLength && j < rightLength) {
			if(leftArray[i]<=rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			}
			else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while(i<leftLength) {
			arr[k] = leftArray[i];
			i++;k++;
		}
		while(j<rightLength) {
			arr[k] = rightArray[j];
			j++;k++;
		}
	}
	        
		public static void main(String[] args) {
			int arr[] = {1,2,6,3,8,9,7};
			mergeSort(arr);
			for(int i: arr) {
				System.out.println(i);
			}
			
	}
}
