package April_POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 368. Largest Divisible Subset
 * 
 */

public class Day6_LargestDivisibleSubset_DP_M {
	
	
	 public static  List<Integer> largestDivisibleSubset(int[] nums) {
		 int n = nums.length;
		 Arrays.sort(nums);
		 List<Integer> ans = new ArrayList<>();
		 int lis = 1;
		 int dp[] = new int[n];
		 Arrays.fill(dp, 1);
		 
		 
		 //find longest common subsequnce
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<i; j++) {
				 if(nums[i]%nums[j] == 0 && 1+dp[j]>dp[i]) {
					 dp[i] = 1+dp[j];
					 if(lis<dp[i]) {
						 lis =dp[i];
					 }
				 }
			 }
		 }
		 
		 //iterate backward and add value in list to return
		 int prev = -1;
		 for(int i=n-1; i>=0; i--) {
			 if(dp[i]== lis && (prev == -1 || prev %nums[i]== 0)) {
				 ans.add(nums[i]);
				 lis--;
				 prev = nums[i];
			 }
			 
		 }
		 
		 
		 
		 System.out.println(ans);
		 return ans;	 
	 }

	public static void main(String[] args) {
		int nums[] = {1,2,4,8};
		largestDivisibleSubset(nums);
	}

}
