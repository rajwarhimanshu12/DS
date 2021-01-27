package com.ds.searchsort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class sample {

    static void sockMerchant(int n, int[] ar) {
        int count=0;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
       for(int i=0;i<n;i++){
           if(map.containsKey(ar[i])){
               map.put(ar[i],map.get(ar[i])+1);
           }
           else {
           map.put(ar[i],1);  
           }
       }
       
       System.out.println(map);
       
  //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
 //         if((int)(entry.getValue())%2==0){
   //           count = count + (entry.getValue()/2);
     //     }
       //}
      // return count;
    }


    public static void main(String[] args) throws IOException {
    	int arr[] = {10,20,20,10,10,30,50,10,20};
    	sockMerchant(9,arr);
    }
}
