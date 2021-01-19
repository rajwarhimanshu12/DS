package com.ds.graph;

public class GraphWithMatrix {
	   static int v;
	   static int e;
       static int [][]  adjMatrix;
       
       public GraphWithMatrix(int nodes) {
    	   this.v = nodes;
    	   this.adjMatrix = new int[nodes][nodes];
       }
       
       public static void addedge(int u, int v) {
    	   adjMatrix[u][v] = 1 ;
    	   adjMatrix[v][u] = 1 ;
    	   e++;
       }
       
	
	public static void main(String[] args) {
		GraphWithMatrix graph = new GraphWithMatrix(4);
        addedge(0,1);
        addedge(2,3);
        addedge(3,0);
        
	}

}
