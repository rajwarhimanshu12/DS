package com.ds.linkedlist;

import com.ds.linkedlist.FindDuplicateInSingleLinkedList.Node;

public class DetectAndRemoveLoopLinkedList {
	
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
	
	public static void removeloop(Node head) {
		Node singlehop= head;
		Node doublehop=head;
		if(head==null) {
			return ;
		}
		while(singlehop!=null&&doublehop!=null&&doublehop.next!=null) {
			singlehop=singlehop.next;
			doublehop=doublehop.next.next;
			if(singlehop==doublehop) {
				break;
			}
		}
		Node start = head;
		while(start.next!=singlehop.next) {
			start=start.next;
			singlehop=singlehop.next;
		}
		singlehop.next=null;	
	}
	
	 public static void printList(Node head) {
		 Node current = head;
		 while(current!=null) {
			 System.out.print(current.data);
			 System.out.print("->");
			 current = current.next;
		 }
		 System.out.print("null");
	 }

	public static void main(String[] args) {
		DetectAndRemoveLoopLinkedList list = new DetectAndRemoveLoopLinkedList();
		list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
 
        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
		System.out.println(detectloop(head));
		removeloop(head);
		printList(head);

	}

}
