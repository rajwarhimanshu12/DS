package com.ds.arrays;

public class BuySellStockOnce {

	public static void buysell(int[] arr) {
		int maxProfit=0;
		int profit=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
				profit=arr[j]-arr[i];
					if(profit>maxProfit) {
						maxProfit=profit;
					}
				}
			}
		}
		if(profit==0)
			System.out.println("No Profit");
		else	
			System.out.println("Max Profit "+maxProfit);
	}

	public static void main(String args[]) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		buysell(arr);
	}
}
