package com.ds.linkedlist;


public class InsertDeletionLinkedList {
	  static Node head = null;
	  static Node current = null;
	  
	  
	  static class Node {
			
			Object data;
			Node next;
			
			public Node(Object data) {
				this.data=data;
			}
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
	
	  
	  public static void createList(int data) {
		 Node newNode = new Node(data);
		
		 if(head==null) {
				head = newNode;
			    current = head;
			}
			else {
				current.next = newNode;
			    current = current.next;
			}
			}
	

	public static void main(String[] args) {
		InsertDeletionLinkedList ll = new InsertDeletionLinkedList();
		createList(10);
		createList(20);
		createList(30);
		createList(40);
		createList(50);
		printList(head);
		insert(45,3);
		System.out.println();
		printList(head);
		deletefirst();
		System.out.println();
		printList(head);
		deletelast();
		System.out.println();
		printList(head);
	}

	private static void insert(int data, int loc) {
		 Node newNode = new Node(data);
		Node current = head;
		for(int i=1 ; i<loc-1; i++) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;	
	}


	private static void deletefirst() {
		Node current = head;
		head = current.next;
		current.next=null;
	}
	
	private static void deletelast() {
		Node current = head;
		Node prev = null;
		while(current.next!=null) {
			prev = current;
			current = current.next;
		}
		prev.next=null;
	}


}
