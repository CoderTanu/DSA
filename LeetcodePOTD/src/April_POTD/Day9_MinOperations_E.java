package April_POTD;

/**
 * 3375. Minimum Operations to Make Array Values Equal to K
 */
public class Day9_MinOperations_E {
	
	 public static int minOperations(int[] nums, int k) {
		 int arr[] =new int[101];
		 int count = 0;
		 for(int num : nums) {
			  if(num<k) {
				  return -1;
			  }
			  if(num !=k) {
				  arr[num] +=1;
				  if(arr[num] ==1) {
					  count++;
				  }
			  }
		 }
		 return count;
	 }

	public static void main(String[] args) {
		int nums[] = {2,1,2};
		int k =2;
		int ans = minOperations(nums, k);
		System.out.println(ans);

	}

}
