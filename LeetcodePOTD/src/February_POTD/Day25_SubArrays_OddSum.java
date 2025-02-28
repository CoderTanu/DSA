package February_POTD;

import java.util.HashMap;
import java.util.Map;

/**
 * Question
 * 1524. Number of Sub-arrays With Odd Sum

 * 
 */



public class Day25_SubArrays_OddSum {
	
	private static int numOfSubarrays(int[] nums) {
		 int prefix =0;
		 int evenC =1;
		 int oddC = 0;
		 int res = 0;
		 int mod = 1000000007;
		 for(int num: nums) {
			 prefix += num;
			 if(prefix%2 == 0) {
				    res+=oddC;
				    evenC++;
			 }else {
				  res+=evenC;
				  oddC++;
			 }
			 
			 res = res % mod;
		 }
		 return res;
		 
		
	}

	public static void main(String[] args) {
		int nums[] = {1,3,5};
		int ans = numOfSubarrays(nums);
		System.out.println(ans);

	}

}
