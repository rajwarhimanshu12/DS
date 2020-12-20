package com.ds.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MaxTrainStoppage {
	
	int arrivaltime;
	int departtime;
	int platform;
	
	public MaxTrainStoppage(int arrivaltime, int departtime, int platform) {
		this.arrivaltime=arrivaltime;
		this.departtime=departtime;
		this.platform=platform;
	}
	
	public static void findMaxTrain(ArrayList<MaxTrainStoppage> arr) {
		HashMap<Integer,MaxTrainStoppage> hm= new  HashMap<Integer, MaxTrainStoppage>();
		
		for(int i=0;i<arr.size();i++) {
			hm.put(arr.get(i).platform,arr.get(i));
		}
		hm.forEach((k,v)->System.out.println(k+" "+v));
	}

	public static void main(String[] args) {
		ArrayList<MaxTrainStoppage> arr = new ArrayList<MaxTrainStoppage>();
        arr.add(new MaxTrainStoppage(1000,1030,1));
        arr.add(new MaxTrainStoppage(1010,1030,1));
        arr.add(new MaxTrainStoppage(1000,1020,2));
        arr.add(new MaxTrainStoppage(1030,1230,2));
        arr.add(new MaxTrainStoppage(1200,1230,3));
        arr.add(new MaxTrainStoppage(900,1005,1));
        findMaxTrain(arr);
	}

}
