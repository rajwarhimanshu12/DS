package DS.DS;
//{1,2,3,4}
//{10,40,20,30};
//maximum toys to buy with given sum  = 70 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class mycomp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Test4 obj1 = (Test4)o1;
		Test4 obj2 = (Test4)o2;
			return ((Integer)obj1.cost).compareTo((Integer)obj2.cost);
		}
	}



public class Test4  {
	
		Integer toy;
		Integer cost; 
		
		Test4(Integer toy, Integer cost){
			toy = this.toy;
			cost = this.cost;
		}


	
	public static void main(String[] args) {
		//int[] toy = {1,2,3,4};
		//int[] cost = {10,40,20,30};  //10-1, 20-3, 30-4, 40-2
		int totalcount = 0;
		int sum = 0;
		int money= 70;
		//Arrays.sort(cost);
		
		List<Test4> obj = new ArrayList<Test4>(); 
		obj.add(new Test4(1,10));
		obj.add(new Test4(2,40));
		obj.add(new Test4(3,20));
		obj.add(new Test4(4,30));
	
		
		
		Collections.sort(obj, new mycomp());
		
		for(int i =0; i<obj.size(); i++) {
			if(sum+obj.get(i).cost<=money) {
				sum = sum + obj.get(i).cost;
				System.out.println(obj.get(i).cost+   +obj.get(i).toy);
				totalcount++;
			}
		}
		
		System.out.println("");
	}
}
