package com.ds.string;

public class ReverseWords {
	
	public static void reverse(String s) {
		int i = s.length()-1;
		int j = 0;
		String ans = "";
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ') {
				i--;
			}
			j = i;
			  while(i>=0 && s.charAt(i)!=' ') {
				  i--;
			  }
			  if(ans.isEmpty())
			  ans = ans.concat(s.substring(i+1,j+1));
			  else
			  ans = ans.concat(" "+s.substring(i+1,j+1));
		}
		
		System.out.println(ans);
	}

	public static void main(String[] args) {
		String s = "This is my world";
		reverse(s);

	}

}
