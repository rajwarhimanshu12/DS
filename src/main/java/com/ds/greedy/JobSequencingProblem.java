package com.ds.greedy;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingProblem {
	
	char id;
	int deadline;
	int profit;
	
	public JobSequencingProblem(char id,int deadline, int profit) {
		this.id = id;
		this.deadline=deadline;
		this.profit=profit;
	}
	
	public static void printjobScheduling(ArrayList<JobSequencingProblem> arr) {
		Collections.sort(arr,(a,b)-> b.profit-a.profit);
		char[] job = new char[arr.size()];
		boolean[] result = new boolean[arr.size()];
		for(int i=0;i<arr.size();i++) {
			for(int j=arr.get(i).deadline-1;j>=0;j--) {
				if(!result[j]) {
					result[j]=true;
					job[j]=arr.get(i).id;
					break;
				}
			}
		}
		for(char c : job) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		ArrayList<JobSequencingProblem> arr = new ArrayList<JobSequencingProblem>();
			arr.add(new JobSequencingProblem('a', 2, 100)); 
	        arr.add(new JobSequencingProblem('b', 1, 19)); 
	        arr.add(new JobSequencingProblem('c', 2, 27)); 
	        arr.add(new JobSequencingProblem('d', 1, 25)); 
	        arr.add(new JobSequencingProblem('e', 3, 15)); 
	        printjobScheduling(arr);
	}

}
