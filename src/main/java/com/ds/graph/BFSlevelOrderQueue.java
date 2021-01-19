package com.ds.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSlevelOrderQueue {
	
	static int v;
	static int e;
	static LinkedList<Integer>[] adj ;
	
	BFSlevelOrderQueue(int nodes){
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
	
	public static void bfs(int startNode) {
		boolean[] visited = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		visited[startNode]= true;
		q.offer(startNode);
		while(!q.isEmpty()) {
			int v  = q.poll();
			System.out.println(v);
			for(int vertex : adj[v]) {
				if(visited[vertex]==false) {
					visited[vertex]=true;
					q.offer(vertex);
				}	
			}
		}
	}

	public static void main(String[] args) {
		BFSlevelOrderQueue graph = new BFSlevelOrderQueue(5);
		addEdge(0,1);
		addEdge(0,3);
		addEdge(1,2);
		addEdge(3,2);
		addEdge(2,4);
		
		bfs(0);
	}

}
