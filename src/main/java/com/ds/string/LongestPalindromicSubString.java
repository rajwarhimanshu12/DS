 package com.ds.string;

public class LongestPalindromicSubString {
	
	public static void fun(String s) {
		String sub="";
		String rev="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				sub=s.substring(i,j);		
				for(int k=sub.length()-1;k>=0;k--) {
					rev = rev + sub.charAt(k);
				}
				if(rev.equals(sub)) {
						System.out.println("PALINDROME "+sub);
				}
				rev="";
			}
		}
	}
	
	public static void countDynamicFun(String s) {
		int count=0;
		boolean dp[][] = new boolean[s.length()][s.length()];
		for(int g=0;g<s.length();g++) {
			for(int i=0,j=g;j<s.length();i++,j++) {
				if(g==0) {
					dp[i][j]=true;
				}
				else if(g==1) {
					if(s.charAt(i)==s.charAt(j))
						dp[i][j]=true;
					else
						dp[i][j]= false;
				}
				else
					if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1] == true) {
						dp[i][j]=true;
					}
					else
						dp[i][j]=false;
				
				if(dp[i][j])
					count++;
			}
		}
		System.out.println(count);
	}
	
	public static void longestDynamicfun(String s) {
		int length=0;
		int startindex=0;
		int endindex=0;
		int start = 0;
		int end = 0;
		boolean dp[][] = new boolean[s.length()][s.length()];
		for(int g=0;g<s.length();g++) {
			for(int i=0,j=g;j<s.length();i++,j++) {
				if(g==0) {
					dp[i][j]=true;
				}
				else if(g==1) {
					if(s.charAt(i)==s.charAt(j))
						dp[i][j]=true;
					else
						dp[i][j]= false;
				}
				else {
					if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1] == true) {
						dp[i][j]=true;
					}
					else
						dp[i][j]=false;
				}
				if(dp[i][j]) {
				length=g+1;
				start = i;
				end = j;
				}
			}
		}
		System.out.println(s.substring(start,end+1));
		
	}
	
	public static void main(String[] args) {
		String s= "abccedgeegdqwe";
		//	fun(s);
		//countDynamicFun("abccbc");
		longestDynamicfun("xxabccccbac");
	}

}
