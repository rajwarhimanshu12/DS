package com.ds.arrays;

public class TrappingRainWaterProblem {

	public static void main(String[] args) {
		int[] arr = {2,0,2};
		
        trapWater(arr);
	}

	private static void trapWater(int[] arr) {
		int trappedWater = 0;
		int leftArr[] = new int[arr.length];
		int rightArr[] = new int[arr.length];
		leftArr[0]=arr[0];
		rightArr[arr.length-1] = arr[arr.length-1];
		for(int i = 1;i<arr.length;i++) {
				leftArr[i]= Math.max(arr[i], leftArr[i-1]);
		}
        for(int j = arr.length-2;j>=0;j--) {
				rightArr[j]=Math.max(arr[j], leftArr[j+1]);
		}
        for(int i = 0;i <arr.length ; i++) {
        	trappedWater+= Math.min(leftArr[i], rightArr[i])-arr[i];
        }
		System.out.println(trappedWater);
	}

}
