package com.ds.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacter {
	
	    public static void charcount(String s) {
	    HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	    int space=0;
	    for(int i=0;i<s.length();i++) {
	    	if(s.charAt(i)==' ') {
	    		space++;
	    	}
	    	else if(!map.containsKey(s.charAt(i))) {
	    		map.put(s.charAt(i),1);
	    	}
	    	else
	    		map.put(s.charAt(i),map.get(s.charAt(i))+1);
	    }
	    for(Map.Entry entry : map.entrySet())
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	        System.out.println("Space"+space);
}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		charcount(s);
	}

}
