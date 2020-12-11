package com.ds.dynamic;

public class BuySellStockTransactionK {

	public static void buySell(int[] arr, int k) {
		int[][] dp = new int[k+1][arr.length];
		
		for(int t = 1; t<=k ;t++ ) {
			for(int d =1 ;d< arr.length;d++) {
				int max = dp[t][d-1];
				
				for(int pd=0;pd<d;pd++) {
					int ptilltm1 =dp[t-1][pd];
					int th = arr[d]-arr[pd];
					if(ptilltm1+th>max)
						max=ptilltm1+th;
				}
				dp[t][d] = max;
			}
		}
		System.out.println(dp[k][arr.length-1]);
	}
	
	public static void main(String[] args) {
		int[] prices= {};
		int days=0;
        buySell(prices,days);
	}

}
