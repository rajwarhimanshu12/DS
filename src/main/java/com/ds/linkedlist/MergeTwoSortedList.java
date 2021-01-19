package com.ds.linkedlist;

import com.ds.linkedlist.NthNodeFromEnd.Node;

public class MergeTwoSortedList {
	
	 static Node head = null;
	  static Node current = null;
	  
	  
	  static class Node {
			
			int data;
			Node next;
			
			public Node(int data) {
				this.data=data;
			}
		}
	  
		public static void print(Node node) {
			while(node!=null) {
			System.out.print(node.data+"->");
			node=node.next;
			}
			System.out.print("null");
		}
		
		private static Node sortTwoRecursive(Node head1, Node head2) {
			if(head1==null) {
				return head2;
			}
			if(head2==null) {
				return head1;
			}
			if(head1.data < head2.data) {
				head1.next = sortTwoRecursive(head1.next,head2);
				return head1;	
			}
			else {
				head2.next = sortTwoRecursive(head1,head2.next);
				return head2;
			}
		}

	public static void main(String[] args) {
		Node head1= new Node(10);
		head1.next= new Node(20);
		head1.next.next= new Node(30);
		Node head2= new Node(5);
		head2.next= new Node(15);
		head2.next.next= new Node(25);
		
		print(sortTwoRecursive(head1, head2));
		

	}



}
