package com.ds.arrays;

//

public class BuySellStock {

	public static void buysellonce(int[] arr) {
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
	
	public static void buySellMaxAnyNumberOfTransactions(int[] arr) {
		int start = 0;
		int end = 0;
		int profit = 0;
		for(int i = 1 ;i < arr.length ; i++) {
			if(arr[i]>arr[i-1]) {
				end = i;
			}
			else {
				profit += arr[end]-arr[start]; 
				start = i;
				end = i ;
			}
		}
		profit += arr[end]-arr[start];
		System.out.println(profit);
	}

	public static void main(String args[]) {
		int[] arr = {100, 180, 260, 310,
                40, 535, 695};
		buysellonce(arr);
		buySellMaxAnyNumberOfTransactions(arr);
		
	}
}
