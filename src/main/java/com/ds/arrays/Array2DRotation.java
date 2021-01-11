package com.ds.arrays;

public class Array2DRotation {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] a : arr) {
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		System.out.println("===");
		rotate90(arr);
		System.out.println("===");
		rotateanti90(arr);
	}

	private static void rotate90(int[][] arr) {
		for(int j =0 ; j < arr.length ; j++) {
			for(int i = arr.length-1 ; i >=  0 ; i--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
	
	private static void rotateanti90(int[][] arr) {
		for(int j = arr.length-1; j >= 0 ; j--) {
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}	
	}

}
