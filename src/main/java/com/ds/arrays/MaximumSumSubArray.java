package com.ds.arrays;
// Find the largest sum contigous subarray
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
		 int maxSumOverall = 0;
		 int sumEndingHere = 0;
		 for(int i=0;i<arr.length;i++) {
			 sumEndingHere=sumEndingHere+arr[i];
			 if(sumEndingHere>maxSumOverall)
				 maxSumOverall=sumEndingHere; 
		     if(sumEndingHere<0)
		    	 sumEndingHere=0;
		 }
	 System.out.println("Max Sum  "+ maxSumOverall);
	 }
	 public static void main(String[] args) {
		int[] arr = {1,2,3,-2,5};
		maxSumBruteForce(arr);
		maxSumKadane(arr);
	}

}
