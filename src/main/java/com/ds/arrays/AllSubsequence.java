package com.ds.arrays;

public class AllSubsequence {
	
	 public static void sub(int arr[], int start, int end) {
		 if(end==arr.length) {
			return;
	     }
		 else if(start>end) {
			 sub(arr,0,end+1);
		 }
		 else {
			 for(int i =start;i<end; i++)
			 System.out.print(arr[i]);
			 
			 System.out.println(arr[end]);
			 sub(arr,start+1,end);		 
		 }
		 return;
	 }
	 
	 public static void main(String args[]) {
	 
		 int arr[] = {1,2,3};
		 sub(arr,0,0);
	 
	 }

}
