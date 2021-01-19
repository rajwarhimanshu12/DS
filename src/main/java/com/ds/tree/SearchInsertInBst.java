package com.ds.tree;

import com.ds.tree.InOrderTraversalTree.Node;

public class SearchInsertInBst {

	public static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	static Node root;

	static Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data)
			root.left = insert(root.left, data);
		else if (data > root.data)
			root.right = insert(root.right, data);
		return root;
	}
	

	public Node search(Node root, int data) {
		if (root == null || root.data == data)
			return root;
		if (data<root.data)
			return search(root.left, data);
		return search(root.right, data);
	}

	public static void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}

	public static void main(String[] args) {
		SearchInsertInBst tree = new SearchInsertInBst();
	    root = insert(root, 50);
		insert(root, 30);
		insert(root, 20);
		insert(root, 40);
		insert(root, 70);
		insert(root, 60);
		insert(root, 80);

		inOrderTraversal(root);

	}

}
