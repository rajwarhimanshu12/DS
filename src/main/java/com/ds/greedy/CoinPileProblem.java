package com.ds.greedy;

public class CoinPileProblem {
	
	public static void minimumCoinPile(int[] arr, int k) {
		int min=arr[0];
		int minIndex=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			    minIndex=i;
			}
		}
		System.out.println("Minimum is "+ min +" at index "+ minIndex);	
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-min>k) {
				count = count + arr[i]-min-k;
			}
		}
		
		System.out.println("Number of changes "+count);
	}
	
	public static void main(String args[]) {
		int num=3;
		int[] arr = {5,1, 5, 1, 2, 5, 1};
		minimumCoinPile(arr,num);
	}

}
