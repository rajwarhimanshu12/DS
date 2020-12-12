package com.ds.linkedlist;

import com.ds.linkedlist.ReverseLinkedList.Node;

public class FindMiddleNodeSinglyLinkedList {

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
		if (head == null) {
			return;
		}
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static Node findMiddle(Node head) {
		Node singlehop=head;
		Node doublehop=head;
		if(head==null) {
			return null;
		}
		while(doublehop!=null&&doublehop.next!=null) {
			singlehop=singlehop.next;
			doublehop=doublehop.next.next;
		}
		return singlehop;
	}

	public static void main(String[] args) {
		FindMiddleNodeSinglyLinkedList list = new FindMiddleNodeSinglyLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		
		System.out.println(findMiddle(head).data);
	}

}
