package April_POTD;


/**
 * 3396. Minimum Number of Operations to Make Elements in Array Distinct
 * Remove 3 elements from the beginning of the array. If the array has fewer than 3 
 * elements, remove all remaining elements.
 */

public class Day8_MinimumOperations_E {
	
	
	   public static int minimumOperations(int[] nums) {
		   int n = nums.length;
		   int lastIndex = 0;
		   int arr[] = new int[101];
		   for(int i = n-1; i>=0 ;i--) {
			   arr[nums[i]]++;
			   if(arr[nums[i]]>1) {
				   lastIndex = i+1;
				   break;
			   }
		   }
		   if(lastIndex%3 == 0) {
			   return lastIndex/3;
		   }
		   return lastIndex/3 +1;
	   }

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,2,3,3,5,7};
		int ans = minimumOperations(nums);
		System.out.println(ans);

	}

}
