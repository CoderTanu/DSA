package Numbers;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	public static void findFibo(int i, int j, int n) {

	}
	
	public static void main(String[] args) {
		
		int i=0;
		int j=1;
		int n=7;
		int sum =0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(i);
		list.add(j);
		
	for(int k=2; k<=n; k++) {
	
		sum = i+j;
		
		list.add(sum);
		int temp=i;
		i=j;
		j=sum;
		}
		
	System.out.println(sum + "" +  list );
		
	}

}
