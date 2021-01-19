package com.ds.misc;


import java.util.*;

class TestClass {

    public static void fun(int n) {
        int number = 2;
        int count = 0;
        boolean isPrime = false;
        while(count<n){
            for(int i = 2 ; i<= number/2 ; i++){
                if(number%i==0){
                    isPrime = false;
                    break;
            }
                else {
                    isPrime = true;
                    count++;
                }
            }
            if(isPrime){
            System.out.print(number+" ");
            }
        }
        number++;
    }

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}
