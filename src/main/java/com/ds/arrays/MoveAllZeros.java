package com.ds.arrays;

public class MoveAllZeros {

	public static void move(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[i] != 0) {
				j++;
			}
		}

		for (int i : arr) {	
			System.out.print(" " + i);
		}

	}

	static void pushZerosToEnd(int arr[]) 
    { 
        int count = 0;  // Count of non-zero elements 
        int n = arr.length;
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; // here count is 
                                       // incremented 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) 
            arr[count++] = 0; 
        
        for(int i : arr) {
    		System.out.print(" "+i);
    		}
    }
	
	
	private static void binaryArrayMove0(int[] arr) {
		int j = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				j++;
				int temp = arr[j]; 
                arr[j] = arr[i]; 
                arr[i] = temp;
			}
		}
		for(int i: arr)
		System.out.print("  "+i);
		
	}

	public static void main(String[] args) {
		int arr[] = { 1, 9, 8, 4, 0, 2, 7, 0, 6, 0, 9 };
		int arr1[] = {0,0,0,1,0,0,1,1,1,0,0};
		move(arr);
		System.out.println("");
		//pushZerosToEnd(arr);
		System.out.println();
		binaryArrayMove0(arr1);
		System.out.println();
		binaryArrayMove0(arr);
	}

	

}
