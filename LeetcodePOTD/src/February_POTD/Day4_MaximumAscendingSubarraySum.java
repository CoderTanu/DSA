package February_POTD;

/**
 * Question
 * 1800. Maximum Ascending Subarray Sum 
 */



public class Day4_MaximumAscendingSubarraySum {
	
	private static int maxAscSubarraySum(int arr[]) {
		int n = arr.length;
		int index = 1;
		int sum = arr[0];
		int maxSum = arr[0];
		while(index<n) {
			//find subarray sum of ascending value.
			while(index<n && arr[index]> arr[index-1]) {
				sum +=arr[index];
				index++;
			}	
			maxSum = Math.max(sum, maxSum);
			//if arr is left than start the new sum from index
			if(index<n) {
				 sum = arr[index];
				 index++;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int arr []= {10,20,30, 5, 10,50};
		int ans = maxAscSubarraySum(arr);
		System.out.println(ans);

	}

}
