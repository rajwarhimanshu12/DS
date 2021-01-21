package com.ds.misc;

import java.util.ArrayList;
import java.util.stream.Collectors;

interface Drawable{
	public String draw(String myname);
}

public class Java8Features {
	
	public static void foreachfun(ArrayList<Integer> list) {
		list.forEach(x ->  System.out.println(x));
		list.forEach(System.out::println);
	}
	
	Drawable d = (name)->{
		return "abc";
	};
	
	public static void streamfun(ArrayList<Integer> list) {
		ArrayList<Integer> newList = (ArrayList<Integer>) list.stream().filter(p-> p>2).map(p->p*2).collect(Collectors.toList());
		System.out.println(newList);
	}


	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		foreachfun(list);
		
		
	}

}
