package com.ds.linkedlist;

public class NthNodeFromEnd {
	
	
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
	
		nthfromend(2);

	}

	private static void nthfromend(int i) {
		Node mainptr = head;
		Node refptr =  head;
		int count = 1;
		while(count<=i) {
			refptr = refptr.next;
			count++;
		}
		while(refptr!=null) {
			refptr = refptr.next;
			mainptr = mainptr.next;
		}
		System.out.println(i +"th from last is "+mainptr.data);
	
	}

}
