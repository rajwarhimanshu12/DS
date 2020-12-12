package com.ds.linkedlist;

public class ReverseLinkedList {
	
	static Node head;
	
	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	public static void printLinkedList(Node head) {
		Node current = head;
		if(head==null) {
			return;
		}
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public static Node reverse(Node head) {
		Node current = head;
		Node prev = null;
		Node next = null;
		if(head==null) {
			return null;
		}
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(1);
		list.head.next=new Node(2);
		list.head.next.next=new Node(3);
		list.head.next.next.next=new Node(4);
		list.head.next.next.next.next=new Node(5);
		
		//printLinkedList(head);
		Node node = list.reverse(head);
		printLinkedList(node);
	}

}
