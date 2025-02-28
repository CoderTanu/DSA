package February_POTD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 1910. Remove All Occurrences of a Substring
 * Find the leftmost occurrence of the substring part and remove it from s.
 * Return s after removing all occurrences of part.
 */
public class Day12_Medium_Array {
	
	
	public  static int findDigitSum(int n){
        int sum =0;
         while(n>0){
            int r = n % 10;
             sum +=r;
             n  /= 10;
         }
         return sum;
    }

    public static int  findMaxValue(int max, List<Integer> list){
        int n = list.size();
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        
        
        for(int i= 0; i<n; i++){  
          if(list.get(i) > max1){
        	  max2  =  max1;
        	  max1 = list.get(i); 
          }else if(list.get(i) > max2 ) {
        	  max2 = list.get(i);
          }
        }

        return max1 + max2;
     
    }

    
	public static int maximumSum(int[] nums) {
		 int n = nums.length;
	        int max = -1;
	        Map<Integer, List<Integer>> map = new HashMap<>();

	        for(int i=0; i<n; i++){
	            int digitSum =  findDigitSum(nums[i]);
	             map.putIfAbsent(digitSum, new ArrayList<>());
	             map.get(digitSum).add(nums[i]);
	        }

	        for(Entry<Integer, List<Integer>> mapVal : map.entrySet()){
	            if(mapVal.getValue().size() == 1) continue;
	            else if(mapVal.getValue().size() >= 2)
	             max = findMaxValue(max, mapVal.getValue());       
	        }  
	        return max;
	}
	

	public static void main(String[] args) {
	    int nums[] = {18,43,36,13,7};
		int ans = maximumSum(nums);
		System.out.println(ans);
		
	}

}
