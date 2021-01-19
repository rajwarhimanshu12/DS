package com.ds.linkedlist;

import java.util.*;
class Node {
    Object data;
    Node next;
 
    Node(Object data){
        this.data = data;
        next = null;
    }
}


public class TestClass {

	Node head;
     public static void printLinkedList(Node head) {
		Node current = head;
		if(head==null) {
			return;
		}
		while(current!=null) {
			System.out.print(current.data+ " ");
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


    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node curr =null;
        Node head = null;

        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            if(curr==null){
               curr = new Node(data);
               head = curr;
            }
            else{
                curr.next= new Node(data);
                curr = curr.next;
            }
        }

        Node node = reverse(head);
		printLinkedList(node);
    }
}
