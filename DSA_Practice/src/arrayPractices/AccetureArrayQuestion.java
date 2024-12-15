package arrayPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AccetureArrayQuestion {

	
	//1. find the reverse of an arr
	
	public static void findReverseOfAnArray(int arr[]) {
		
		/**
		 * process using stream and Collection
		 */
		/**Integer[] v =Arrays.stream(arr).boxed().toArray(Integer[]::new);
		List<Integer> list = Arrays.asList(v);
		Collections.reverse(list);
		System.out.println(list);
		**/
		
		
		/**
		 * follow two pointer approch
		 * 
		 * 
		 */
		
		int start =0; int end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
	//	System.out.println(Arrays.toString(arr));

		
	}
	
	
	public static void findReverseOfAnArray(int arr[], int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
	//	System.out.println(Arrays.toString(arr));

		
	}
	
	//2. find max and min of an array
	public static void findMaxAndMinfromArray(int arr[]) {
		
		
		/**
		 * sort and print first as min and last as max
		 * 
		 * Arrays.sort(arr);
		int max = arr[arr.length-1];
		int min =arr[0];
		
		System.out.println(max +  " " + min);
		 */
		
		
		/**
		 * 2nd approch  without sorting
		 */
		
		
//		 OptionalInt max =IntStream.of(arr).max();
//		   if(max.isPresent()) {
//			   System.out.println(max.getAsInt());
//		   }
//		   OptionalInt min =IntStream.of(arr).min();
//		   if(min.isPresent()) {
//			   System.out.println(min.getAsInt());
//		   }
//		   
		   /**
		    * 
		    */
		   
		int min =Integer.MAX_VALUE;int max =Integer.MIN_VALUE;
		
		for(int num: arr) {
			if(num>max) {
				max = num;
			}
			if(num<min) {
				min=num;
			}
		}
		   
//		 System.out.println(min);  
//		 System.out.println(max);  
//			
		
		
		
	}
	
	
	//3.Roatet element by K operration
	
	public static void rotateElementByKperation(int arr[], int n) {
		 n = n%arr.length;
		// System.out.println(n);
		
		findReverseOfAnArray(arr, 0 , arr.length-1);
		findReverseOfAnArray(arr, 0, n-1);
		findReverseOfAnArray(arr, n , arr.length-1);
	}
	
	
	//move zero to end
	
	public static void moveZeroToEnd(int arr[]) {
		 int countNonZero =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
				arr[countNonZero++] = arr[i];
				
			}
		}
		 while(countNonZero< arr.length) {
			 arr[countNonZero++] =0;
		 }	
		
	}
	
	

	public  static void duplicateFromSorted(int arr[]) {
		
		int index =1;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arr[index++] =arr[i];
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
	    int [] arr = {1,2,4,5,6,2,13,0,8,2,12,1,2,78};
	    int [] arr1= {1,1,2,2,3,4,4,5};
	    int[] arr2 = {0,1,0,3,12};
	    
	    
	    
	    
	    findReverseOfAnArray(arr);
	    findMaxAndMinfromArray(arr);
	    rotateElementByKperation(arr1, 1);
	    System.out.println(Arrays.toString(arr1));
	    
	    
	    
	     moveZeroToEnd(arr2);
	     System.out.println(Arrays.toString(arr2));
		 
	     
	     duplicateFromSorted(arr1);
	     System.out.println(Arrays.toString(arr1));
	    
	}



}
