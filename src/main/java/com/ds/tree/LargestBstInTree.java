package com.ds.tree;

import java.util.ArrayList;

import com.ds.tree.IsBinarySearchTree.Node;
import com.ds.tree.LargestBstInTree.Node.SubTree;

public class LargestBstInTree {
	
	static Node root;
	static ArrayList<Integer> al = new ArrayList<>();
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			left=right=null;
		}
		
		public static class SubTree{
			int min;
			int max;
			int size;
			boolean isBST;
			
			
			public SubTree(int min,int max,int size,boolean isBST) {
				this.min=min;
				this.max=max;
				this.size=size;
				this.isBST=isBST;
			}
		}
	}
	
	public static SubTree findLargestBST(Node root) {
		if(root==null) {
			return new SubTree(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
		}
		SubTree left = findLargestBST(root.left);
		SubTree right = findLargestBST(root.right);
		
		SubTree info = null;
		
		if(left.isBST&&right.isBST&&(root.data>left.max&&root.data<right.min)) {
			info = new SubTree(Math.min(root.data,Math.min(left.min,right.min)),Math.max(root.data,Math.max(left.max,right.max)),left.size+right.size+1,true);
		}
		else {
			info =  new SubTree(0,0,Math.max(left.size,right.size),false);
		}	
		return info;		
	}


	public static void main(String[] args) {
		LargestBstInTree tree = new LargestBstInTree();
		Node root = new Node(10);
		tree.root = root;
		tree.root.left = new Node(15);
        tree.root.right = new Node(8);
 
        tree.root.left.left = new Node(12);
        tree.root.left.right = new Node(20);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(9);
 
        tree.root.left.left.left = new Node(2);
        tree.root.left.left.right = new Node(14);
        tree.root.right.left.left = new Node(4);
        tree.root.right.left.right = new Node(7);
 
        tree.root.right.right.right = new Node(10);
        
        
        System.out.println("The size of the largest BST is " + findLargestBST(root).size);
	}

}
