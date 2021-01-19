package com.ds.HeapHash;

public class MaxPQHeap {
	
	private int[] heap;
	private int size;  //size of maxheap

	MaxPQHeap(int Capacity){
		heap = new int[Capacity+1];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
