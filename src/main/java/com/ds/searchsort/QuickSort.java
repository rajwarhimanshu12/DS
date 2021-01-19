package com.ds.searchsort;

public class QuickSort {
	
	
	public void sort(int arr[],int start,int end) {
		if(start<end) {
		int pivotIndex = partition(arr,start,end);
		sort(arr,start,pivotIndex-1);
		sort(arr,pivotIndex+1,end);
		}
	}
	
	public static int partition(int arr[],int start,int end) {
		int pivot = arr[end];
		int partitionIndex = start;
		for(int i = start;i<end-1;i++) {
			if(arr[i]<arr[partitionIndex]) {
				int temp = arr[partitionIndex];
				arr[partitionIndex] = arr[i];
				arr[i]= temp;
				partitionIndex++;
			}
		}
		int temp = pivot;
		pivot = arr[partitionIndex];
		arr[partitionIndex]=temp;
		return partitionIndex; 
	}
	
	  static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i]+" "); 
	        System.out.println(); 
	    } 

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,1,2,6,8};
		QuickSort q= new QuickSort();
		q.sort(arr,0,7);
		printArray(arr);
	
	}

}
