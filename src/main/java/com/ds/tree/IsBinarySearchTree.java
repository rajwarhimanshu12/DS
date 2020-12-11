package com.ds.tree;

import java.util.ArrayList;

public class IsBinarySearchTree {
	
	static ArrayList<Integer> al = new ArrayList<>();

	public static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	static Node root;
	
	public static ArrayList<Integer> inOrderList(Node node) {
		if(node==null)
			return null;
		else {
			inOrderList(node.left) ;
			al.add(node.data);
			inOrderList(node.right);
		}
		return al;
	}
	
	public static void checkBst(Node node) {
		ArrayList<Integer> al = inOrderList(node);
		boolean check = true;
		for(int i=1;i<al.size();i++) {
			if(al.get(i-1)>al.get(i)) {
				check=false;
				break;
			}
		}
		if(check) {
			System.out.println("BST");
		}
		else
			System.out.println("NOT BST");
	}

	public static void main(String[] args) {
		IsBinarySearchTree tree = new IsBinarySearchTree();
		Node root = new Node(4);
		tree.root = root;
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
  
		
		checkBst(root);
		
	}

}
