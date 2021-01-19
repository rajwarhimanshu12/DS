package com.ds.linkedlist;



public class MergeSortLinkedList {
	
	static Node head = null;
	static Node curr = null;
	
	class Node {
	    int data;
	    Node next;
	 
	    Node(int data){
	        this.data = data;
	        next = null;
	    }
	}
	
	public static Node merge(Node lNode,Node rNode) {
		if(lNode==null) {
			return rNode;
		}
		if(rNode==null) {
			return lNode;
		}
		if(lNode.data< rNode.data) {
			lNode.next = merge(lNode.next,rNode);
			return lNode;
		}
		else
			rNode.next = merge(lNode,rNode.next);
		return rNode;
	}
	
	public static Node mergesort(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node mid = mid(head);
		Node midNext = mid.next;
		mid.next = null;
		Node left = mergesort(head);
		Node right = mergesort(midNext);
		Node sortedHead = merge(left,right);
		return sortedHead;
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
	
	public static void print(Node node) {
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
		
		print(mergesort(head));
		
		

	}

}
