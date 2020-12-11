package com.ds.tree;

import com.ds.tree.PreOrderTraversalTree.Node;

public class InvertMirrorBinaryTree {
	
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
	 static Node temp;
	 
	 public static void reverse(Node root) {
		 if(root==null) {
			 return;
		 }
		 else {
			 reverse(root.left);
		     reverse(root.right);
		     
		     temp = root.left;
		     root.left = root.right;
		     root.right = temp;
		 }
		 
	 }
	 
	 public static void inOrderTraversal(Node node) {
		 if(node==null) {
			 return;
		 }
		 inOrderTraversal(node.left);
		 System.out.print(" "+node.data);
		 inOrderTraversal(node.right);
	 }

	public static void main(String[] args) {
		InvertMirrorBinaryTree tree = new InvertMirrorBinaryTree();
		Node root = new Node(1);
		tree.root = root;
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
       tree.root.left.right = new Node(5);
       
       System.out.println("Before");
       inOrderTraversal(root);
       reverse(root);
       System.out.println("\n After");
       inOrderTraversal(root);
	}

}
