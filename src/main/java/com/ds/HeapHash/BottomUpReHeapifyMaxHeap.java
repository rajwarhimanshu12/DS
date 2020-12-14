package com.ds.HeapHash;

public class BottomUpReHeapifyMaxHeap {
	
	private static int[] heap;
	private static int n;
	
	public BottomUpReHeapifyMaxHeap(int capacity) {
		heap = new int[capacity+1];
		n=0;
	}
	 public boolean isEmpty() {
		 return n == 0;
	 }
	 
	 public static int size() {
		 return n;
	 }
	 
	 public static void resize(int capacity) {
		 int[] temp = new int[capacity*2];
		 for(int i=0;i<heap.length;i++) {
			 temp[i]=heap[i];
		 }
		 heap = temp;
	 }
	 
	 public static void printHeap() {
		 for(int i=0;i<heap.length;i++) {
			 System.out.println(heap[i]);
		 }
	 }
	public static void insert(int value) {
		if(n == heap.length) {
			resize(2*heap.length);
		}
		n++;
		heap[n]=value;
		swim(n);
	}
	
	public static void swim(int k) {
		while(k>1&&heap[k/2]<heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2]= temp;
			k=k/2;
		}
	}
	
	public static void main(String args[]){
		
		insert(4);
		insert(5);
		insert(2);
		insert(6);
		insert(1);
		insert(3);
		System.out.println(size());
		
		printHeap();
	}

}
