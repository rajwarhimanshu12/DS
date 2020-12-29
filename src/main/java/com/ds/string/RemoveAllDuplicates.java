package com.ds.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveAllDuplicates {

	public static void main(String[] args) {
		String s = "abaabcc";
		remove(s);
	}

	private static void remove(String s) {
		Set<Character> set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		
		for(int i = 0 ; i<s.length() ; i++) {
			Character c = s.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
			
		}
		
	  System.out.println(sf);
	}

}
