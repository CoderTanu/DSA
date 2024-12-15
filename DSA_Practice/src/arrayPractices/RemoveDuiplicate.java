package arrayPractices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuiplicate {

	public static void main(String[] args) {
		  int [] arr = {1,1,5,6,2,2,0,1,1};
		  
//		  Set<Integer> set = new HashSet<Integer>();
//		  for(int i: arr) {
//			  if(!set.contains(arr[i])){
//				  set.add(arr[i]);
//			  }
//		  }
//		  
//		  //print set
//	System.out.println(set);
	
	//or
		  
		 // Set<Integer> set = new HashSet<Integer>();
		  Integer[] arrBoxed = Arrays.stream(arr).boxed().toArray(Integer[]::new); 
		  Set<Integer> set = new HashSet<>(Arrays.asList(arrBoxed));
		//  Integer[] uniqueArray = set.toArray(new Integer[0]);
		  System.out.println(set);
	
	}

}
