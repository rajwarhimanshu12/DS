package com.ds.searchsort;

public class MergeSort {

	static int arr[] = {2,3,1,5,4,6,7,9,8};
	  public static void sort(int arr[]){
	        int n = arr.length;
	        if(n<2){
	            return;
	        }
	        int mid = n/2;
	        int left[] = new int[mid];
	        int right[] = new int[n-mid];
	       
	        for(int i=0;i<mid;i++){
	           left[i]=arr[i]; 
	        }
	        for(int j = mid;j<n-mid;j++){
	          right[j]=arr[j];  
	        }
	        sort(left);
	        sort(right);
	        merge(left,right);
	    }
	    
	    public static void merge(int left[],int right[]){
	        int leftsize = left.length;
	        int rightsize = right.length;
	        int arr[] = new int[leftsize+rightsize];
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        while(i<leftsize&&j<rightsize){
	            if(left[i]<=right[i]){
	                arr[k]=left[i];
	                i++;
	                k++;
	            }
	            else{
	                arr[k]=right[j];
	                j++;
	                k++;
	            }
	            while(i<leftsize){
	                arr[k]=left[i];
	                i++;
	                k++;
	            }
	            }
	            while(j<rightsize){
	                arr[k]=right[j];
	                j++;
	                k++;
	            }
	        }
	        
		public static void main(String[] args) {
			sort(arr);
			for(int i: arr) {
				System.out.println(i);
			}
			
	}
}
