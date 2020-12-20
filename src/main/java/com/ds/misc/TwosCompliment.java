package com.ds.misc;

public class TwosCompliment {

	public static void main(String[] args) {
		findCompliment("0111");

	}

	private static void findCompliment(String s) {
		char[] ones = new char[s.length()];
		char[] two = new char[s.length() + 1];
		System.out.println(s);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				ones[i] = '1';
			} else {
				ones[i] = '0';
			}
		}
		for (char c : ones)
			System.out.print(c);

		int carry = 1;
		for (int i = s.length() - 1; i >= 0; i++) {
			if (ones[i] == '1' && carry == 1) {
				two[i] = '0';
			} else if (ones[i] == '0' && carry == 1) {
				two[i] = '1';
				carry = 0;
			} else
				two[i] = ones[i];
		}
		two[s.length()]='\0'; 
		for (char c : two)
			System.out.print(c);
	}
}
