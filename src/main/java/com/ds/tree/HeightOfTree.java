package com.ds.tree;

public class HeightOfTree {
	
	static Node root;
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			left=right=null;
			
		}
	}
		
		public static int FindHeight(Node root) {
			if(root==null) {
				return 0;
			}
			else {
				int leftHeight = FindHeight(root.left);
				int rightHeight = FindHeight(root.right);;
			if(leftHeight>rightHeight)
				return leftHeight+1;
			else
				return rightHeight+1;
			}
	}

	public static void main(String[] args) {
		HeightOfTree tree = new HeightOfTree();
		tree.root = new Node(1);  
        tree.root.left = new Node(2);  
        tree.root.right = new Node(3);  
        tree.root.left.left = new Node(4);  
        tree.root.right.left = new Node(5);  
        tree.root.right.right = new Node(6);  
        tree.root.right.right.right= new Node(7);  
        tree.root.right.right.right.right = new Node(8);  

        System.out.println("Height of tree is "+ FindHeight(root));
	}
}
