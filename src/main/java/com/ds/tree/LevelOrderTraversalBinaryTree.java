	package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.tree.InOrderTraversalTree.Node;

public class LevelOrderTraversalBinaryTree {

	static public class Node {
		int data;
		static Node left;
		static Node right;

		public Node(int data) {
			this.data = data;
		}
	}
	
	Node root;

	public static void printLevelOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.println(current.data);
            
            if(current.left!=null) {
            	q.add(current.left);
            }
            if(current.right!=null) {
            	q.add(current.right);
            }
		}
	}

	public static void main(String[] args) {
		LevelOrderTraversalBinaryTree tree = new LevelOrderTraversalBinaryTree();
		Node root = new Node(1);
		tree.root = root;
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);

        printLevelOrderTraversal(root);
	}

}
