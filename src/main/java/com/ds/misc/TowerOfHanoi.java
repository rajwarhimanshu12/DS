package com.ds.misc;

//Recursion Euler's tree

// t1 	t2	 t3
public class TowerOfHanoi {
	
	public static void toh(int n,int t1, int t2, int  t3) {
		if(n==0) {
			return;
		}
		toh(n-1,t1,t3,t2);
		System.out.println(n+" "+t1+"->"+t2);
		toh(n-1,t3,t2,t1);
	}

	public static void main(String[] args) {
		int n = 3;
	    int t1 = 10;
		int t2 = 11;
		int t3 = 12;
		toh(n,t1,t2,t3);
	}
}

