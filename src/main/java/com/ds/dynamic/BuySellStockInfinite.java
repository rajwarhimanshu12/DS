package com.ds.dynamic;

public class BuySellStockInfinite {
	
	public static void profit(int[] prices) {
		int bday=0;
		int sday=0;
		int profit=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]>prices[i-1]) {
				sday++;
			}
			else {
				profit=prices[sday]-prices[bday];
			    bday=sday=i; 
			}
		}
		profit=prices[sday]-prices[bday];
		System.out.println(profit);
	}

	public static void main(String[] args) {
		int[] prices= {3,1,2,3};
		profit(prices);
	}
}
