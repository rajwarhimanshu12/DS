package com.ds.linkedlist;



public class MergeSortLinkedList {
	
	static Node head = null;
	static Node curr = null;
	static Node tail = null;
	
	class Node {
	    Object data;
	    Node next;
	 
	    Node(Object data){
	        this.data = data;
	        next = null;
	    }
	}
	
	public static void merge(MergeSortLinkedList lnode,MergeSortLinkedList rNode) {
		
	}
	
	public static MergeSortLinkedList sort(Node head,Node tail) {
		if(head==tail) {
			MergeSortLinkedList br = new MergeSortLinkedList();
			return null;
		}
		Node mid = mid(head);
		MergeSortLinkedList lNodes = sort(head,mid);
		MergeSortLinkedList rNodes = sort(mid.next,tail);
		merge(lNodes,rNodes);
		return null;
	}
	
	
	public static Node mid(Node head) {
		Node singlehop=head;
		Node doublehop=head;
		while(doublehop!=null && doublehop.next!=null) {
			singlehop = singlehop.next;
			doublehop =doublehop.next.next;
		}
		return singlehop;
	}
	
	
	public void Node(int data) {
		Node node = new Node(data);
		
		if(head==null) {
			head = node;
		    curr = head;
		}
		else {
			curr.next = node;
		    curr = curr.next;
		}
		
	}
	
	public void print(Node node) {
		while(node!=null) {
		System.out.print(node.data+"->");
		node=node.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		MergeSortLinkedList ll = new MergeSortLinkedList();
		ll.Node(10);
		ll.Node(20);
		ll.Node(30);
		ll.Node(50);
		ll.Node(40);
		
		ll.print(head);

	}

}
