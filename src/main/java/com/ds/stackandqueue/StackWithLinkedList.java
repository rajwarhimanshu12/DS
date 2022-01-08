package com.ds.stackandqueue;

public class StackWithLinkedList {
	
	static Node top=null;
	static int length=0;
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	
	public static void pushOperation(int data) { 
		Node temp = new Node(data);
		temp.next=top;
		top = temp;
		length++;
	}
	
	public static void popOperation(int data) {
		int popedElement = top.data;
		top=top.next;
		length--;
	}

	public static void main(String[] args) {
		StackWithLinkedList list = new StackWithLinkedList();
		
	}

	private static void StackWithLinkedList(int i) {
		// TODO Auto-generated method stub
		
	}


}
