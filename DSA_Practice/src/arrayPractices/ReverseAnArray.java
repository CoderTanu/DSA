package arrayPractices;/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		//primitive type stream to Integer wrapper class
    	int [] arr = {1,23,3,4,5,6,7};
//		for(int i=arr.length-1; i>=0; i--) {
//			System.out.println(arr[i]);
//		}

		//1. use collection stream API
//        Integer[] arrStream = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        
//       List<Integer> list =  Arrays.asList(arrStream);
//       
//      System.out.println(); 
//      Collections.reverse(list);
//        
//    	System.out.println(list);
    	
    	
    	//2. 
    	int left =0;
    	int right=arr.length-1;
    	
    	while(left<right) {
    		int temp = arr[left];
    		arr[left] = arr[right];
    		arr[right] = temp;
    		
    		left++;
    		right--;
    	}
    	
    	for(int i:arr) {
    		System.out.println(i);
    	}
	}

}
