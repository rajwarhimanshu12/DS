package com.ds.arrays;

public class MoveNegativeElements {
	
	public static void moveElement(int[] arr) {
		int start=0;
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				temp=arr[i];
				arr[i]=arr[start];
				arr[start]=temp;
				start++;
			}
		}
		for(int i: arr)
			System.out.println(i);
	}

	public static void main(String args[]) {
		int[] arr = {1,2,3,-5,6,8,-9,-11};
		moveElement(arr);
	}

}
