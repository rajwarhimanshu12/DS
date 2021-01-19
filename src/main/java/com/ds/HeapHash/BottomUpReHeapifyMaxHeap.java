package com.ds.HeapHash;

public class BottomUpReHeapifyMaxHeap {
	
	private static int[] heap;
	private static int size;  //size of maxheap
	
	public BottomUpReHeapifyMaxHeap(int capacity) {
		heap = new int[capacity+1];
		size=0;
	}
	 public boolean isEmpty() {
		 return size == 0;
	 }
	 
	 public static int size() {
		 return size;
	 }
	 
	 public static void resize(int capacity) {
		 int[] temp = new int[capacity];
		 for(int i =0; i< heap.length ; i++) {
			 temp[i] = heap[i];
		 }
		 heap = temp; 
	 }
	 
	 public static void printHeap() {
		 for(int i=0;i<heap.length;i++) {
			 System.out.println(heap[i]);
		 }
	 }
	public static void insert(int value) {
		if(size == heap.length-1) {
			resize(2*heap.length);
		}
		size++;
		heap[size]=value;
		bottomupreheapify(size);
	}
	
	public static void bottomupreheapify(int k) {
		while(k>1&& heap[k]>heap[k/2]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2;
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
