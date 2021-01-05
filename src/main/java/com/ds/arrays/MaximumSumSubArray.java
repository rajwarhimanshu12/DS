package com.ds.arrays;


// Find the largest sum contigous subarray or kadane algo
//https://www.youtube.com/watch?v=YxuK6A3SvTs

public class MaximumSumSubArray {
	
	public static void maxSumBruteForce(int[] arr) {
		int maxsum=0;
		
		for(int i=0;i<arr.length;i++) {
				for(int j=i;j<arr.length;j++) {
					int sum=0;
					for(int k=0;k<=j;k++) {
						sum=sum+arr[k];
					}
						if(sum>=maxsum) {
							maxsum=sum;
				}
			}
		}
		System.out.println("Max Sum  "+ maxsum);
	}
	 public static void maxSumKadane(int[] arr) { //divide and conquer 	
		 int maxSumOverall = Integer.MIN_VALUE;
		 int sumEndingHere = 0;
		 int newStartIndex = 0;
		 int endIndex = 0;
		 int startIndex = 0;
		 
		 for(int i=0;i<arr.length;i++) {
			 sumEndingHere=sumEndingHere+arr[i];
			 if(sumEndingHere>maxSumOverall) {
				 maxSumOverall=sumEndingHere;  
				 startIndex = newStartIndex;
				 endIndex = i;
			 }
		     if(sumEndingHere<0) {
		    	 sumEndingHere=0;
		         newStartIndex = i + 1; 
		     }
		 }
	 System.out.println("Max Sum  "+ maxSumOverall);
	 System.out.println("Start Index  "+ startIndex);
	 System.out.println("End Index  "+ endIndex);
	 for(int i = startIndex; i<= endIndex; i++ ) {
		 System.out.print(arr[i]+ " ");
	 }
	 }
	 public static void main(String[] args) {
		int[] arr = {1,2,3,-2,5};
		maxSumBruteForce(arr);
		maxSumKadane(arr);
	}

}
