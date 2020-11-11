package com.ds.string;

public class CountSay {
	
	/*1
	 1 1
	 2 1
	 1 2 1 1
	 1 1 1 2 2 1 1
	 */
	
	public static void countSayProblem(int n) {
		
		String result = "1";
		
		for(int i=0;i<n-1;i++) {
			char c = result.charAt(0);
			StringBuilder s = new StringBuilder();
			int count = 1;
			
			for(int j=1 ;j<result.length();j++) {
				if(c!=result.charAt(j)) {
					s.append(count);
					s.append(c);
					count=0;
					c= result.charAt(j);
				}
				else
					count++;
			}
			s.append(count);
			s.append(c);
			
			result = s.toString();
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		countSayProblem(3);
	}

}
