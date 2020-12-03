package com.ds.greedy;

public class ActivitySelectionProblem {
	
	public static void findactivity(int s[], int  f[], int n) {
   //sort by end time of not done already
	    int j=0;
	    System.out.println(s[0]+" "+f[0]);
		for(int i=1;i<n;i++) {
			if(s[i]>=f[j]) {
			    j++;
			    System.out.println(s[i]+" "+f[i]);
			}
		}  
	}

	public static void main(String[] args) {
		 int s[] = { 1, 3, 0, 5, 8, 5 }; 
	     int f[] = { 2, 4, 6, 7, 9, 9 }; 
	     findactivity(s,f,s.length);
	}

}
