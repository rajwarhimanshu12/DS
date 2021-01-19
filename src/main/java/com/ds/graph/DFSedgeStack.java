package com.ds.graph;

import java.util.LinkedList;
import java.util.Stack;

public class DFSedgeStack {
	
	static int v;
	static int e;
	static LinkedList<Integer>[] adj ;
	
	DFSedgeStack(int nodes){
		this.v = nodes;
		this.adj = new LinkedList[nodes];
		for(int i = 0; i< nodes ; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public static void addEdge(int i , int j) {
		adj[i].add(j);
		adj[j].add(i);	
		e++;
	}
	

	private static void dfs(int startNode) {
		boolean[] visited = new boolean[v];
		Stack<Integer> stack = new Stack<>();
		stack.push(startNode);
		while(!stack.isEmpty()){
			int u = stack.pop();
			if(!visited[u]) {
				visited[u] = true;
				System.out.println(u);
				for(int vertex : adj[u]) {
					if(!visited[vertex]) {
						stack.push(vertex);
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		DFSedgeStack graph = new DFSedgeStack(5);
		addEdge(0,1);
		addEdge(0,3);
		addEdge(1,2);
		addEdge(3,2);
		addEdge(2,4);
		
		dfs(0);
	}
}
