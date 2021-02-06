package com.ds.arrays;

public class FindMaxMinArrayElement {

	public static void findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max)
				max = arr[i];
		}
		System.out.println("Max is " + max);
	}

	public static void findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min)
				min = arr[i];
		}
		System.out.println("Min is " + min);
	}

	public static void find2ndMax(int arr[]) {
        int first = 0;
        int second = 0;
		for(int i = 0;i< arr.length;i++) {
        	if(arr[i]>first) {
        		second = first;
        		first = arr[i];	
        	}
        	else if(arr[i] > second && arr[i]!=first) {
        		second = arr[i];
        	}
        }
		System.out.println("FIRST"+ first);
		System.out.println("SECOND"+ second);
	}

	public void find2ndMin(int arr[]) {

	}

	public static void findkthMinMaxSorting(int[] arr, int pos) {
		mergeSort(arr);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

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

	public static void main(String args[]) {
		int arr[] = { 1, 3, 4, 16, 87, 1, 2, 5 };
		findMax(arr);
		findMin(arr);
		find2ndMax(arr);
		findkthMinMaxSorting(arr,5);
	}
}