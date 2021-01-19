package com.ds.graph;

import java.util.LinkedList;

public class GraphWithList {
	
	int v;
	int e;
	static LinkedList<Integer>[] adj;
	
	GraphWithList(int nodes){
		this.v = nodes;
		this.adj = new LinkedList[nodes];
		for(int i = 0 ; i< nodes; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	private static void addEdge(int i, int j) {
		adj[i].add(i);
		adj[j].add(i);
	}

	public static void main(String[] args) {
		GraphWithList graph = new GraphWithList(4);
		addEdge(0,1);
		addEdge(1,2);
		addEdge(2,3);
		addEdge(3,0);

	}



}
