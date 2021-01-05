package com.ds.misc;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "THIS is to      test spaces.";
		removeSpaces(s);

	}

	private static void removeSpaces(String s) {
		char ch[] = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' '&& ch[i]!='\t') {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
	}

}
