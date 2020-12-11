package com.ds.tree;

import com.ds.tree.InOrderTraversalTree.Node;

public class PreOrderTraversalTree {
	
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
	 
	 public static void preOrderTraversal(Node node) {
		 if(node==null) {
			 return;
		 }
		 System.out.println(node.data);
		 preOrderTraversal(node.left);
		 preOrderTraversal(node.right);
	 }
	
	public static void main(String[] args) {
		PreOrderTraversalTree tree = new PreOrderTraversalTree();
		Node root = new Node(1);
		tree.root = root;
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);

        preOrderTraversal(root);
	}


}
