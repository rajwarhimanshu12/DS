package com.ds.string;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSub {
	
	public static void printallSubString(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
	
	public static void printAllSubSequenceRecursion(String input,String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		printAllSubSequenceRecursion(input.substring(1),output + input.charAt(0));
		printAllSubSequenceRecursion(input.substring(1),output);
	}
	

	public static void main(String[] args) {
		String s = "abc";
		printallSubString(s);
		System.out.println("SUBSEQUENCE");
		printAllSubSequenceRecursion(s,"");
	}

}
