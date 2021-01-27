package com.ds.string;

public class SortSentenceWordLength {

	public static void main(String[] args) {
		String s = "GoodLuck we wish";
		fun(s);
	}

	private static void fun(String s) {
		String[] words = s.split(" ");
		int j = 0;
		for (int i = 0; i < words.length; i++) {
			for (j = 0; j < words.length - i - 1; j++)
			if (words[j].length() > words[j + 1].length()) {
				String temp = words[j];
				words[j] = words[j + 1];
				words[j + 1] = temp;

			}
		}
		for(String x : words)
			System.out.println(x+" ");

	}

}
