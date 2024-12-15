package arrayPractices;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
	  int [] arr = {1,1,5,6,2,2,0,1,1};
	  
	  Set<Integer> set = new HashSet<Integer>();
	  int count=0;
	  for(int i: arr) {
		  if(!set.add(arr[i])){
			  count++;
			  System.out.println("duplicate found"+ i);
		  }
	  }
	  
	System.out.println(count);
	
	
	}

}
