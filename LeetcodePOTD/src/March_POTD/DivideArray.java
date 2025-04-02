package March_POTD;

import java.util.Arrays;

public class DivideArray {
	
	  public static boolean divideArray(int[] nums) {

	        int n = nums.length;
	        int pairCount = n / 2 ;
	        Arrays.sort(nums);
	        for(int i=0; i<n; i+=2){
	            if(nums[i]== nums[i+1]) {
	            	pairCount--;
	            }
	        }
	        if(pairCount==0) {
	        	return true;
	        }
        
	        return false;
	        
	    }

	public static void main(String[] args) {
		int nums[] = {3,2,3,2,2,2};
		System.out.println(divideArray(nums));
	}

}
