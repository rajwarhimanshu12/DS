package com.ds.misc;

public class Trie {
	
	private static TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public static class TrieNode{
		private TrieNode[] children;
		private boolean isWord;
		
		public TrieNode() {
			this.children = new TrieNode[26];
			this.isWord = false;
			
		}
	}
	
	public static void insert(String word) {
		if(word == null || word.isEmpty()) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		word= word.toLowerCase();
		
		TrieNode current = root;
		for(int i=0;i< word.length();i++) {
			char c = word.charAt(i);
			int index = c - 'a';
		}
	}
	
	public static boolean search(String word) {
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
