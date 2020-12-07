package com.ds.greedy;

public class MinimumCoinNoteProblem {
	
	public static void minimum(int[] arr,int amount) {
		for(int i=arr.length-1;i>=0;i--) {
			int count=0;
			while(amount>=arr[i]) {
				amount=amount-arr[i];
				count++;
			}
		 if(count!=0)	
		 System.out.println(count+" notes/coins are required of "+arr[i]);
		 if(amount==0)
			 break;
		}
	}

	public static void main(String[] args) {
		int amount=750;
		int[] arr= {1,2,5,10,20,50,100,500,1000};
		minimum(arr, amount);
	}

}
