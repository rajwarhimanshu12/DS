package com.ds.misc;

public class PrintPrimeNumbers {

	public static void printnprime(int n) {
		int count = 0;
		int number = 2;
		boolean isPrime = true;
		while (count < n) {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				} 
				else {
					isPrime = true;
				}	
			}
			if (isPrime) {
				System.out.println(number);
				count++;
			}
			
			number++;
		}

	}

	public static void checkPrime(int num) {
		boolean isPrime = true;
		if (num == 0 || num == 1)
			isPrime = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

	public static void main(String[] args) {
		printnprime(5);
		checkPrime(4);

	}

}
