package arrayPractices;

import java.util.Arrays;

public class SecondLargestElement {
	
	
	
	//optimal  approch  single
	//TC: O(n)
	//sc:O(1)
	 public static int secondLargestByOptimal(int a[])
	 {
		 int max =Integer.MIN_VALUE;
		 int secondMax=Integer.MIN_VALUE;
			for(int i=0; i<a.length; i++) {
				if(a[i]>max) {
					secondMax=max;
					max=a[i];
				}else if(a[i]>secondMax) {
					secondMax=a[i];
				}
			}
		
			return secondMax;
	 }
	 
	 
	//better  approch double pass
			//TC: O(n)
			//sc:O(1)
		 public static int secondLargestByBetter(int a[])
		 {
			 int max =Integer.MIN_VALUE;
			 int secondMax=Integer.MIN_VALUE;
			 
				 int i=0;
				for(i=0; i<a.length; i++) {
					max=Math.max(max, a[i]);
				}
				for(i=0; i<a.length; i++) {
					
					if(a[i]>secondMax && a[i]!=max) {
						secondMax=a[i];
					}
				}
			
				return secondMax;
		 }
		
	
	//brute force approch
		//TC: O(n*nlogn)
		//sc:O(1)
	public static int secondLargestByBrute(int a[]) {
		Arrays.sort(a);
		return a[a.length-2];
	}

	public static void main(String[] args) {
	  int a[]= {102,15,1,3,70,83};
//	  int p=secondLargestByBrute(a);
//	     System.out.println(p);
//     int q= secondLargestByBetter(a);
//   System.out.println(q);
	  
	  int r= secondLargestByOptimal(a);
	   System.out.println(r);
	}

}
