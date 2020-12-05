package com.ds.HeapHash;

import java.util.Arrays;

public class BinaryHeapClass {
	
	int heapSize;
	int[] heap;
	
	public BinaryHeapClass(int capacity) {
		heapSize=0;
		heap = new  int[capacity+1];
		Arrays.fill(heap,-1);
	}
	
	public boolean isEmpty() {
		return heapSize == 0;
	}
	
	public boolean isFull() {
		return heapSize == heap.length;
	}
	
	public void makeEmpty() {
		heapSize = 0;
	}
	
	public int parent(int index) {
		return (index-1)/2;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
