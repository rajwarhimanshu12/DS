package com.ds.linkedlist;

import com.ds.linkedlist.FindMiddleNodeSinglyLinkedList.Node;

public class FindDuplicateInSingleLinkedList {
	

	static Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
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
	
	public static void duplicateRemove(Node head) {
		Node current = head;
		while(current!=null&current.next!=null) {
			if(current.data==current.next.data) {
				current.next = current.next.next;
			}
			else
				current=current.next;
		}   
	}
	public static void main(String[] args) {
		FindDuplicateInSingleLinkedList list = new FindDuplicateInSingleLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(1);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(3);
		list.head.next.next.next.next = new Node(3);
		
		printLinkedList(head);
		duplicateRemove(head);
		printLinkedList(head);
	}

}
