package com.ds.slidingwindow;

import java.util.Scanner;

public class MaxSumSubArraySizek {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int subsize = sc.nextInt();
        int maxsum = Integer.MIN_VALUE;  
		int sum = 0;
		int end = 0;
		int start = 0;
		while (end <size) {
           sum = sum + arr[end];
           if(end-start+1<subsize) {
        	   end++;
           }
           else if(end-start+1==subsize) {
        	   maxsum = ((maxsum>sum)?maxsum:sum);
        	   sum = sum - arr[start];
        	   start++;	 
               end++;
        	   }
		}
		System.out.println("ANSWER"+ maxsum);
	}

}
