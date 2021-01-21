package com.ds.tree;

import java.util.HashMap;
import java.util.Map;

import com.ds.tree.PostOrderTraversalTree.Node;

public class RightViewTree {
	static public class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			left=right=null;
		}
	}
	 
	 static Node root;
	 
	 private static void rightView(Node root,int level, Map<Integer,Integer> map) {
			if(root==null) {
				return;
			}
			map.put(level, root.data);
			rightView(root.left,level+1,map);
			rightView(root.right,level+1,map);
		} 

		private static void rightView(Node root) {
			Map<Integer, Integer> map = new HashMap<>();
			rightView(root,1,map);
			
			for(int i = 1; i<=map.size();i++) {
				System.out.print(map.get(i)+" ");
			}
		} 
		
	 

	public static void main(String[] args) {
		 
		 Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.right = new Node(4);
	        root.right.left = new Node(5);
	        root.right.right = new Node(6);
	        root.right.left.left = new Node(7);
	        root.right.left.right = new Node(8);
	          
	        rightView(root); 
	 
	        }
}
