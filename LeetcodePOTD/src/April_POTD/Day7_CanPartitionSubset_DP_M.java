package April_POTD;

import java.util.Arrays;

/**
 * 416. Partition Equal Subset Sum
 * 
 */

public class Day7_CanPartitionSubset_DP_M {
	
	public static boolean subSetSumToTarget(int n, int nums[], int target, int[][] dp) {
	
		 if(target == 0) return true;
		 if(n == 0) return nums[0] == target;
		 if(dp[n][target] != -1) return dp[n][target]== 0 ? false :true;
		 
		 boolean notaken = subSetSumToTarget(n-1, nums, target, dp);
		 boolean taken = false;
		 if(nums[n]<=target) {
			 taken = subSetSumToTarget(n-1, nums, target-nums[n], dp);
		 }
		dp[n][target] = taken || notaken ? 1:0;
		return notaken || taken;
		 
		 
	}

	private static boolean canPartition(int[] nums) {
	
		int n = nums.length;
		int sum =0;
		for(int i=0; i<n; i++) {
			sum +=nums[i];
		}
		if(sum % 2 == 1) 
			return false;
		int  target = sum /2;
		int dp[][] = new int[n][target +1];
		for(int[] row : dp) {
			Arrays.fill(row, -1);
		}
		return subSetSumToTarget(n-1, nums, target, dp);
		
	}
	
	 private static boolean isSuffixPresent(long n, String s, int limit){
         String p = String.valueOf(n);
         System.out.println(p);
         char f = p.charAt(0);
   
         System.out.println(f);
         int digit = f -'0';
         System.out.println(digit);
         if(p.endsWith(s) && digit <= limit){
           return true;
         }
         return false;
     }

	public static void main(String[] args) {
//		int nums[] = {2,5,11,5};
//		System.out.println(canPartition(nums));
		
		System.out.println(isSuffixPresent(4124,"124",4));
	}

}
