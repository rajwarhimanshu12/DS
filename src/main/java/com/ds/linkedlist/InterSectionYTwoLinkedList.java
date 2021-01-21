package com.ds.linkedlist;

public class InterSectionYTwoLinkedList {
	
	static Node head1, head2;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    public static void find(Node head1, Node head2) {
    	int countc1 =0;
    	int countc2 =0; 
    	Node currc1 = head1;
    	Node currc2 = head2;
    	while(currc1!=null) {
    		countc1++;
    		currc1 = currc1.next;
    	}
    	while(currc2!=null) {
    		countc2++;
    		currc2 = currc2.next;
    	}
    	int absdiff = Math.abs(countc1-countc2);
    	System.out.println(absdiff);

    		currc1=head1;
    		currc2=head2;
    	for(int i =0; i<absdiff; i++) {
    		currc1=currc1.next;
    	}
    	
    	while(currc1!=null&&currc2!=null) {
    		if(currc1.next==currc2.next) {
    			System.out.println(currc1.data);
    			break;
    		}
    		else {
    		currc1=currc1.next;
    		currc2=currc2.next;	
    		}
    	}
    }

	public static void main(String[] args) {
		InterSectionYTwoLinkedList list = new InterSectionYTwoLinkedList();
		list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);
 
        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);
        find(head1,head2);

	}

}
