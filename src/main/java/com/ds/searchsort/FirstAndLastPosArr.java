package com.ds.searchsort;

public class FirstAndLastPosArr {
	
	public static void findFirstAndLast(int[] arr , int element) {
		int startindex=-1;
		int lastindex=-1;
		boolean found = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				if(found == false) {
					startindex=i;
					lastindex=i;
					found=true;
				}
				else
					lastindex=i;
			}
		}
		System.out.println("StartIndex"+startindex+"Lastindex"+lastindex);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,5,6,5,8};
		findFirstAndLast(arr, 5);
	}

}
