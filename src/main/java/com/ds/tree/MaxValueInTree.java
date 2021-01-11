package com.ds.tree;

import com.ds.tree.InOrderTraversalTree.Node;

public class MaxValueInTree {

	static Node root= null; 
	
	 static class Node{
		 Node left;
		 Node right;
		 int data;
		 public Node(int data) {
			 this.data=data;
		 }
	}
	 
	 public static void inOrderTraversal(Node node) {
		 if(node==null) {
			 return;
		 }
		 inOrderTraversal(node.left);
		 System.out.println(node.data);
		 inOrderTraversal(node.right);
	 }
	 
	 public static Node insert(Node root, int data) {
		 if(root==null) {
			 root = new Node(data);
			 return root;
		 }
		 if(data>=root.data) {
			 root.right = insert(root.right,data);
		 }
		 else if(data<root.data) {
			 root.left = insert(root.left,data);
		 }
		 return root;
	 }
	 
	public static void main(String[] args) {
		
		root = insert(root,10);
        insert(root,50);
        insert(root,60);
        insert(root,40);
        insert(root,20);
        
        inOrderTraversal(root);
        
        int max = findMax(root);
        System.out.println("Maximum Value is   "+max);
        
	}

	private static int  findMax(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);		
		if(left>result) {
			result = left;
		}
		else if(right>result) {
			result = right;
		}
		
		return result;	
	}

}
