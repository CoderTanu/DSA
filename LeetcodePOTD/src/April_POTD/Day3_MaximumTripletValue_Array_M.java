package April_POTD;


/**
 * 2874. Maximum Value of an Ordered Triplet II
 * 
 */

public class Day3_MaximumTripletValue_Array_M {
	
	 public static long maximumTripletValue(int[] nums) {
	        int n = nums.length;
	        int[] rightMax = new int[n];
	         int maxVal = nums[n - 1]; 
	        for (int i = n - 2; i > 0; --i) {
	            rightMax[i] = maxVal;
	            maxVal = Math.max(maxVal, nums[i]);
	        }
	        long maxTriplet = 0;
	        maxVal = nums[0];
	        for (int i = 1; i < n - 1; ++i) {
	            maxTriplet = Math.max(maxTriplet, (long)(maxVal - nums[i]) * rightMax[i]);
	            maxVal = Math.max(maxVal, nums[i]);
	        }
	        return maxTriplet;
	    }

	public static void main(String[] args) {
		int nums[]= {12,6,1,2,7};
		long ans = maximumTripletValue(nums);
		System.out.println(ans);

	}

}
