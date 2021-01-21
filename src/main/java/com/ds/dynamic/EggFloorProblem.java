package com.ds.dynamic;

public class EggFloorProblem {
	
	public static int eggDrop(int n,int k) {
	int	dp[][] = new int[n+1][k+1];
	for(int i=1;i<=n;i++) {
		for(int j=1; j <=k ;j++) {
			if(i==1) {
				dp[i][j]=j;
			}
			else if(j==1) {
				dp[i][j]=1;
			}
			else {
				int min = Integer.MAX_VALUE;
				for(int mj = j-1, pj=0 ;mj>=0; mj--,pj++ ) {
					 min = Math.min(Math.max(dp[i-1][pj],dp[i][mj]),min);
				}
				dp[i][j]=min+1;
			}	
		}
	}
	return dp[n][k];
	}

	public static void main(String[] args) {
		System.out.println(eggDrop(2,7));
		

	}

}
