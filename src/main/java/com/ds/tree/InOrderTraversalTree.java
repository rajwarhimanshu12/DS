package com.ds.tree;

import java.util.Stack;

public class InOrderTraversalTree {
	 
	 static public class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			left=right=null;
		}
	}
	 
	 Node root;
	 
	 public static void inOrderTraversal(Node node) {
		 if(node==null) {
			 return;
		 }
		 inOrderTraversal(node.left);
		 System.out.println(node.data);
		 inOrderTraversal(node.right);
	 }
	 
	 public static void inOrderTraversalWithoutRecursion(Node root) {
		 if(root==null) {
			 return;
		 }
		 Stack<Node> s = new Stack<Node>();
		  Node curr = root;
		  
		  while(curr!=null||s.size()>0) {
			  while(curr!=null) {
			  s.push(curr);
			  curr= curr.left;
			  }
		   curr= s.pop();
		   System.out.println(curr.data);
		   
		   curr=curr.right;
		  }
	 }
	
	public static void main(String[] args) {
		InOrderTraversalTree tree = new InOrderTraversalTree();
		Node root = new Node(1);
		tree.root = root;
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);

        inOrderTraversal(root);
        inOrderTraversalWithoutRecursion(root);
	}

}
