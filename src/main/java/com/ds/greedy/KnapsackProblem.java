package com.ds.greedy;

import java.util.ArrayList;
import java.util.Collections;

public class KnapsackProblem {
	
	int id;
	int profit;
	int weight;
	
	public KnapsackProblem(int id,int profit,int weight) {
		this.id=id;
		this.profit=profit;
		this.weight=weight;
	}
	
	public static void fun(ArrayList<KnapsackProblem> arr, int capacity) {
		Collections.sort(arr,(a,b)->(b.profit/b.weight)-(a.profit/a.weight));
        int currentweight=0;
        double finalValue = 0.0;
		for(int i=0;i<arr.size();i++) {
			if(currentweight+ arr.get(i).weight<=capacity) {
				currentweight+= arr.get(i).weight;
				finalValue+=arr.get(i).profit;
			}
			else {
				int remain = capacity-currentweight;
				finalValue = finalValue + arr.get(i).profit*((double)remain/(double)arr.get(i).weight);
						break;
			}
		}
		System.out.println(finalValue);
	}

	public static void main(String[] args) {
		ArrayList<KnapsackProblem> arr = new ArrayList<KnapsackProblem>();
		arr.add(new KnapsackProblem(1,60,10));
		arr.add(new KnapsackProblem(2,100,20));
		arr.add(new KnapsackProblem(3,120,30));
		int capacity=50;
		fun(arr,capacity);
	}

}
