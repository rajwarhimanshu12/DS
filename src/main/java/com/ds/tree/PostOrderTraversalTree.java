package com.ds.tree;

import com.ds.tree.InOrderTraversalTree.Node;

public class PostOrderTraversalTree {
	
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
	 
	 public static void postOrderTraversal(Node node) {
		 if(node==null) {
			 return;
		 }
		 postOrderTraversal(node.left);
		 postOrderTraversal(node.right);
		 System.out.println(node.data);
	 }
	
	public static void main(String[] args) {
		PostOrderTraversalTree tree = new PostOrderTraversalTree();
		Node root = new Node(1);
		tree.root = root;
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);

        postOrderTraversal(root);
	}


}
