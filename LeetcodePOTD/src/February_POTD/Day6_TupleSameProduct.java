package February_POTD;

import java.util.HashMap;
import java.util.Map;

/**
 * Question
 * 1726. Tuple with Same Product

 * 
 */



public class Day6_TupleSameProduct {
	
	private static int tupleSameProduct(int[] nums) {
		 int n = nums.length;
		 int tupleCount = 0;
	      HashMap<Integer, Integer> productMap = new HashMap<Integer, Integer>();
	        for(int i=0; i<n; i++){
	            for(int j=i+1; j<n; j++){
	              int  res = nums[i] * nums[j];
	              productMap.put(res, productMap.getOrDefault(res,0)+1);
	            }
	        }
	        
	        int ans =0;
	        for(Map.Entry<Integer, Integer> entry : productMap.entrySet()){
	            int product = entry.getKey();
	            int count = entry.getValue();

	            if(count>=2){
	                int comb = (count *(count-1))/2;
	                   ans = ans + comb *8;
	            }
	        }

	        
	        return ans;
		
	}

	public static void main(String[] args) {
		int nums[] = {1,2,4,5,10};
		int ans = tupleSameProduct(nums);
		System.out.println(ans);

	}

}
