package com.ds.arrays;

//Search an element in nxn sorted matrix

public class SearchnxnSortedArray {
	
	public static void findElement(int arr[][],int length,int value) {
		int i=0;
		int j=length-1;		
			while(i<length&&j>=0) {
				if(arr[i][j]==value) {
					System.out.println("\n Found at"+i+j);	
				}
				if(value<arr[i][j]) {
					j--;
				}
				else
					i++;
			}
			
	}
	

	public static void main(String[] args) {
		int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,51}};
		  for(int[] a: arr) {
			  System.out.println("");
			  for(int element: a) {
				  System.out.print(" "+element);
			  }
		  }

		  findElement(arr,4,32);
		  
	}

}
