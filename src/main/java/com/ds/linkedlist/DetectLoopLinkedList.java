package com.ds.linkedlist;

import com.ds.linkedlist.FindDuplicateInSingleLinkedList.Node;

public class DetectLoopLinkedList {
	
	static Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public static boolean detectloop(Node head) {
		Node singlehop= head;
		Node doublehop=head;
		if(head==null) {
			return false;
		}
		while(doublehop!=null&&doublehop.next!=null) {
			singlehop=singlehop.next;
			doublehop=doublehop.next.next;
			if(singlehop==doublehop) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		DetectLoopLinkedList list = new DetectLoopLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(1);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(3);
		list.head.next.next.next.next = new Node(3);
		
	//	list.head.next.next.next.next=list.head.next.next;
		System.out.println(detectloop(head));

	}

}
