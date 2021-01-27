package com.ds.misc;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparableComparator implements Comparator {
	
	
	@Override
	public int compare(Object o1, Object o2) {
		return ((Integer) o1).compareTo((Integer)o2);
	}

	public static void main(String[] args) {
		Set t = new TreeSet(new ComparableComparator());
		t.add(2);
		t.add(3);
		t.add(1);
		t.add(17);
		t.add(8);
		
		System.out.println(t);
	}

	

}
