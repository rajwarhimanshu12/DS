package com.ds.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GraphClass {
	
	private LinkedList<Integer> adj[];
	
	public GraphClass(int v) {
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public void bfs(int source,int destination) {
		boolean [] visited = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(source);
		parent[source]=-1;
		visited[source]= true;
		
		while(!q.isEmpty()) {
			 int curr =q.poll();
			 if(curr==destination) break;
			 
			 for(int neighbour : adj[curr]) {
				 if(!visited[neighbour]) {
					 visited[neighbour]= true;
					 q.add(neighbour);
				     parent[neighbour] = curr;	
				 }
			}
		}
		int curr= destination;
		int distance=0;
		while(parent[curr]!=-1) {
			System.out.println(curr);
			curr=parent[curr];
			distance++;
		}
	}
	
	
	public boolean dfsRecursion(int source, int destination,boolean visited[]) {
		if(source==destination)
			return true;
		
		for(int neighbour :  adj[source]) {
			if(!visited[neighbour]) {
				visited[neighbour]=true;
				boolean isConnected = dfsRecursion(neighbour,destination,visited);
				if(isConnected)
					return true;
				
			}
		}
		return false;
	}
	
	public void dfsStack(int source,int destination) {
		boolean [] visited = new boolean[adj.length];
		visited[source] = true;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(source);
		
		while(!stack.isEmpty()){
			int curr = stack.pop();
			System.out.println(curr);
			for(int neighbour: adj[curr]) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					stack.push(neighbour);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v=5;
		System.out.println("Enter edges");
		int e = sc.nextInt();
		GraphClass gp = new GraphClass(v);
		System.out.println("Enter edge Connection");   
		for(int i=0;i<e;i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			gp.addEdge(source,destination);
		}
	}

}
