package com.oops;


import java.util.*;

 class Model {
	
	int id;
	int price;
	String color;
	
	Model(int id,int price,String color){
		this.id=id;
		this.price=price;
		this.color=color;
    }
	
}
 
class sortByid implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Model m1 = (Model)o1;
		Model m2 = (Model)o2;
		if	(m1.id>m2.id)
			return 1;
		else
			return -1;
	}
 }

public class CustomSorting {

    public static void main(String args[]) throws Exception {
    List<Model> list = new  ArrayList<Model>();  
    list.add(new Model(1,100,"Red"));
    list.add(new Model(2,6000,"Green"));
    list.add(new Model(4,150,"Yellow"));
    list.add(new Model(1,10,"Yellow"));
  
    Collections.sort(list,new sortByid());
    
    for(int i =0;i<list.size();i++) {
    	System.out.println(list.get(i).id+""+list.get(i).price+""+list.get(i).color);
    }
    }    
}
