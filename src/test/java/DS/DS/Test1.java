package DS.DS;

//{1,2,0,1,2};
//{1,2,3,4,6};

public class Test1 {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,6};
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1;i<ar.length;i++) {
			for(int j = 0; j<=i-1; j++) {
				sum1+= ar[j];
			}
			for(int k = i+1; k<ar.length; k++) {
				sum2+= ar[k];
			}
			
			if(sum1 == sum2) {
				System.out.println("Equilibrium element"+ ar[i]);
			}
		}

	}

}
