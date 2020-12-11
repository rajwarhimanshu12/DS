package com.ds.dynamic;

public class BuySellStockOneTran {
	
	public static void oneTransaction(int[] prices) {
		int lsf=Integer.MAX_VALUE;
		int op = 0;
		int pist = 0;		
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<lsf) {
				lsf=prices[i];
			}
		pist = prices[i] -lsf;
		if(pist>op) {
			op=pist;
		}
		}
		System.out.println(op);
	}

	public static void main(String[] args) {
		int[] prices = {3,1,2,3};
		oneTransaction(prices);
	}

}
