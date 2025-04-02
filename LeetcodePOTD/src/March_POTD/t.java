package March_POTD;

public class t {
	
	 public static int maximumCount(int[] nums) {
	        int n = nums.length;
	        int pos = 0;
	        int neg = 0;
	        int ans = 0;
	        for(int i=0; i<n; i++){
	            String ne = String.valueOf(nums[i]);
	            if(ne.contains("-")) {
	            	neg++;
	            }else if(nums[i] == 0) {
	            	
	            }else {
	            	pos++;
	            }
	        }
	      return  ans = Math.max(neg, pos);  
	    }

	public static void main(String[] args) {
		int nums[] =  {5,20,66,1314};
		int ans = maximumCount(nums);
		System.out.println(ans);

	}

}
