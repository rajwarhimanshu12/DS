package com.oops;


class Parent {
	Parent(){
		System.out.println("Parent No arg");
	}
	
    Parent(String ars){
    	System.out.println("Parent WITH arg");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child No arg");
	}
	
    Child(String ars){
    	super("");
    	System.out.println("Child WITH arg");
	}
}

public class InheritanceConstructor {
	public static void main(String args[]) {
	Child c = new Child("abc");
	}

}
