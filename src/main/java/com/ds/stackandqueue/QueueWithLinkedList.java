	package com.ds.stackandqueue;

public class QueueWithLinkedList {
	
	public static class Node{
		int data;
		Node front;
		Node rear;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	static Node front=null;
	static Node rear=null;
	static int length = 0;
	
	public static boolean isEmpty() {
		return length == 0;
	}
	
	public static void enqueue(int data) {
		Node temp = new Node(data);
		if(isEmpty()) {
			front=temp;
		}
		else {
			rear.next=temp;
		}
		rear=temp;
		length++;
	}
	
	public static void dequeue() {
		front=front.next;
		length--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
