package February_POTD;

import java.util.HashMap;

/**
 * 2364. Count Number of Bad Pairs
 * You are given a 0-indexed integer array nums. A pair of indices (i, j) is a bad pair if i < j and j - i != nums[j] - nums[i].
  Return the total number of bad pairs in nums.
 */
public class Day9_Medium_Array {
	
	
	
	public static long findBadPair(int nums[]) {
		int n = nums.length;
		long totalPair = n *(n-1)/2;
		long goodPair = 0;
		HashMap<Integer, Integer> map =  new HashMap<>();
		for(int i=0; i<n; i++) {
			int val = i - nums[i];
			int prev = map.getOrDefault(val, 0);
			goodPair += prev;
			map.put(val, map.getOrDefault(val, 0)+1);
		}
		
		return totalPair - goodPair;
		
	}
	
	
	

	public static void main(String[] args) {
		int nums[] = {4,1,3,3,3};
		long ans = findBadPair(nums);
		System.out.println(ans);
		
	}

}
