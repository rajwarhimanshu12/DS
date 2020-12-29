package com.ds.arrays;

//find all pairs on integer array whose sum is equal to given number

//

public class PairElementArraySumK {
	
	public static void sumK(int arr[],int sum) {
		mergeSort(arr);
		for(int i: arr) {
				System.out.println(i);
			}
			int l=0;
		int r=arr.length-1;
		while(l<r) {
			if(arr[l]+arr[r]>sum) {
				r--;
			}
			else if (arr[l]+arr[r]<sum) {
				l++;
			}
			else {
				System.out.println(arr[l]+"    "+arr[r]);
				l++;  //r--;
			}
		}
		
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
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int sum= 12;
		
		sumK(arr,sum);
	}
	
	
	

}
