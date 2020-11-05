package com.ds.arrays;

import java.util.Scanner;

public class ReverseArray {
	
	public static void revArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-1];
			arr[n-1]=temp;
			n--;
		}
		for(int i :arr)
			System.out.println(i);
	}
	
	public static void revString(String s) {
		char[] stringarr= s.toCharArray();
        int n = stringarr.length;
        for(int i=0;i<n/2;i++) {
			char temp=stringarr[i];
			stringarr[i]=stringarr[n-1];
			stringarr[n-1]=temp;
			n--;
		}
        for(char c: stringarr)
        System.out.print(c);
	}
	
	public static void recursionreverse(int[] arr,int start,int end) {
		//terminating call
		if(start>=end) 
			return;
		int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
		recursionreverse(arr,start+1,end-1);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		int [] arr;
		arr = new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter String");
		String s= sc.next();
		revArray(arr);
		revString(s);
		recursionreverse(arr,0,n-1);
	}
}
