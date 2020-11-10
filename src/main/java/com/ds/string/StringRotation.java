package com.ds.string;

public class StringRotation {
	public static void checkRotation(String s1,String s2) {
		if((s1+s1).indexOf(s2)!=-1){
			System.out.println("Rotation");
		}
		else
			System.out.println("Not Rotation");
	}

	public static void main(String[] args) {
		String s1="ABCD";
		String s2="DABC";
		checkRotation(s1,s2);

	}

}
