package com.ds.linkedlist;

public class SingleLinkedListNode {

	int data;
	SingleLinkedListNode next;

	public SingleLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}

	static SingleLinkedListNode head;
	static SingleLinkedListNode tail;

	public static void addCreation(int data) {
		SingleLinkedListNode newNode = new SingleLinkedListNode(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else
			tail.next = newNode;
		tail = newNode;
	}

	public static void insertion(int data, int loc) {
		SingleLinkedListNode newNode = new SingleLinkedListNode(data);
		SingleLinkedListNode curr = head;
		if (loc == 0) {// first
			newNode.next = head;
			head = newNode;
		} else if (loc == 10) { // last
			tail.next = newNode;
			tail = newNode;
		} else {
			for (int i = 0; i < loc; i++) {
				curr = curr.next;
			}
			newNode.next = curr.next;
			curr.next = newNode;
		}
	}

	public static void main(String args[]) {
		addCreation(12);
		addCreation(13);
		addCreation(14);
	}
}
