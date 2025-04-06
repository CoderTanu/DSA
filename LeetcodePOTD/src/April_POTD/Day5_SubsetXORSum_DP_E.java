package April_POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 1863. Sum of All Subset XOR Totals
 * 
 */

public class Day5_SubsetXORSum_DP_E {
	
	
	 private static int findXORTotal(int nums[], int index, int xor){
	        if(index == nums.length) return xor;
	        int pick = findXORTotal(nums, index+1, xor ^ nums[index]);
	        int nopick = findXORTotal(nums, index+1, xor);
	        return pick + nopick;
	    }
	    public static int subsetXORSum(int[] nums) {
	        return findXORTotal(nums,0,0);
	    }

	public static void main(String[] args) {
		int nums[] = {1,3};
		int ans = subsetXORSum(nums);
		System.out.println(ans);
	}

}
