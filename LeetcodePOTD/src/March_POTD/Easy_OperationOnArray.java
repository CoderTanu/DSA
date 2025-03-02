package March_POTD;


/**
 * Question
 * 2460. Apply Operations to an Array

 * 
 */



public class Easy_OperationOnArray {
	
	 public static int[] applyOperations(int[] nums) {
	        int n = nums.length;
	         int count =0;
	        for(int i=0; i<n; i++){
	             if(i<n-1 && nums[i] !=0 && nums[i] == nums[i+1]){
	                 nums[i] = nums[i] *2;
	                  nums[i+1] = 0;
	            }
	           if(nums[i] != 0){
	             if(i!=count){
	               int temp = nums[i];
	               nums[i] = nums[count];
	               nums[count] = temp;
	               }
	                count++;
	             }
	          
	        }

	        return nums;
	        
	    }

	public static void main(String[] args) {
	     int nums [] = {1,2,2,1,1,0};
		int [] ans = applyOperations(nums);
       for(int i=0 ;i<ans.length; i++) {
    	   System.out.print(nums[i] + " ");
       }
	}

}
