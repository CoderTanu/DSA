package April_POTD;


/**
 * 2873. Maximum Value of an Ordered Triplet I
 */
public class Day2_MaximumTripletValue_Array_E {
	
	 public static long maximumTripletValue(int[] nums) {
	        long max = 0;
	        
	        int n = nums.length;
	        for(int i=0; i<n-2; i++){
	            for(int j=i+1; j<n-1; j++){
	                for(int k=j+1;k<n; k++){
	                  max = Math.max((nums[i]-nums[j])* nums[k], max);
	                   
	                }
	                
	            }
	        }
	        return max;
	    }

	public static void main(String[] args) {
		int nums[]= {12,6,1,2,7};
		long ans = maximumTripletValue(nums);
		System.out.println(ans);

	}

}
