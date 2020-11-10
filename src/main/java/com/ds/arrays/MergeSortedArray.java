package com.ds.arrays;

public class MergeSortedArray {

	public static void merge(int[] arr1, int[] arr2) {
		int k = 0;
		int i = 0;
		int j = 0;
		int arr[] = new int[arr1.length + arr2.length];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
				k++;
			}
			else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
		for (int m : arr)
			System.out.println(m);
	}

	public static void main(String args[]) {
		int[] arr1 = { 1, 3, 5, 6, 8 };
		int[] arr2 = { 2, 7, 8, 9, 10 };

		merge(arr1, arr2);
	}
}
