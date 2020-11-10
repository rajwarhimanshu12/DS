package com.ds.arrays;

public class Sort012WithoutSorting {
	
	public static void sortWithCount(int[] arr) {
		int zeroCount=0;
		int oneCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				zeroCount++;
			else if(arr[i]==1)
				oneCount++;
		}
		for(int i=0;i<zeroCount;i++)
			arr[i]=0;
		for(int i=zeroCount;i<zeroCount+oneCount;i++)
			arr[i]=1;
		for(int i=zeroCount+oneCount;i<arr.length;i++)
			arr[i]=2;
		
		for(int i: arr)
			System.out.print(i);
	}
	//1 0 2 0 1 1
	
	public static void sortInOneGo(int[] arr) {
		int start=0;
		int mid=0;
		int temp=0;
		int high=arr.length-1;
		while(mid<high) {
			if(arr[mid]==0) {
				temp=arr[mid];
				arr[start]=arr[mid];
				arr[start]=temp;
				start++;
				mid++;
			}	
			else if(arr[mid]==1) {
				mid++;
			}	
			else	{
				temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				mid++;
				high--;
			}
		}
		for(int i: arr)
			System.out.print(i);
	}

	public static void main(String[] args) {
		int[] arr = {1,1,0,2,0,2,0,0,2,1,2};
		sortWithCount(arr);
		System.out.println("");
		sortInOneGo(arr);
	}

}
