package com.ds.arrays;

public class AllSubarrays {
	
	public static void allsubarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
				System.out.println("");
			}
		}
		
	}
		
		public static void allsubarrayrecursion(int[] arr,int start,int end) {
			if(end==arr.length) 
				return;
			else if(start>end)
				allsubarrayrecursion(arr,0,end+1);
			else {
				for(int i=start;i<end;i++) {
					System.out.print(arr[i]+" ");
				}
			System.out.println(arr[end]+" ");
			allsubarrayrecursion(arr,0,end+1);
			}	
	}

	public static void main(String args[]) {
		int[] arr= {1,2,3,4};
		allsubarray(arr);
		System.out.println("RECURSION");
		allsubarrayrecursion(arr,0,0);
	}

}
