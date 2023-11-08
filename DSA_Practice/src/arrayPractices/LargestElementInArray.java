package arrayPractices;

import java.util.Arrays;
import java.util.Collections;

public class LargestElementInArray {
	
	//brute force approch
	//TC: O(n*nlogn)
	//sc:O(n)
	public static int largestElement(int a[]){
		Arrays.sort(a);
	    return a[a.length-1];
	
		}
	
	
	
	//optimal Approch
	//TC:O(n);
	//sc:O(1)
	public static int largestElementByOptmalWay(int a[]){
		int max =a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
	
		return max;
		}
	

	public static void main(String[] args) {
	
		int a[]= {21,5,120,3,0};
	  
//		int v= largestElement(a);
//		System.out.println(v);
		
		int w= largestElementByOptmalWay(a);
		System.out.println(w);
		
		
	}

}
