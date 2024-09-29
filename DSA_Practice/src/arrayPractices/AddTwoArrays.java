package arrayPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoArrays {

	public static void main(String[] args) {
		
		int arr1[]= {2, 3, 6, 7, 9};
		int arr2[]= {1, 4, 8, 10};
		
	//	1,2,3,4,6,7,8,9,10
		
//		  List<Integer> list = new ArrayList<>();
//	      
//	      for(int i=0; i<arr1.length; i++){
//	          list.add(arr1[i]);
//	      }
//	      
//	      for(int i=0; i<arr2.length; i++){
//	          list.add(arr2[i]);
//	      }
//	      System.out.println("list"+list);
//	      
//	      
//	      list.sort(null);
	      
	      
//	      for(long v =1; v<=list.size(); v++){
//	          if(v == k){
//	              return v;
//	          }
//	      }

		int a1 = arr1.length;
		int b1 =arr2.length;
		int v =0;
		
		int c1 = a1+b1;
		
		int c[] = new int[c1];
		//System.out.println(c.length);
	
        for (int i = 0; i < a1; i = i + 1) {
            c[i] = arr1[i];
            System.out.println("c1"+c[i]);
        }
        
        for (int i = 0; i < b1; i = i + 1) {
            c[a1+i] = arr2[i];
            System.out.println("c2"+c[i]);
        }
        Arrays.sort(c);
       
		for(int i=0; i<c.length; i++) {
			// System.out.println(i);
			 System.out.println(c[i]);
			if(i==5-1) {
			 
			 v= c[i];
			   
			}
		}
		
	long vV = (long)v;
		
	System.out.println(vV);
		
	}

}
