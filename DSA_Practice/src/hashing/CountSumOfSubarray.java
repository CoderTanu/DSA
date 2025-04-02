package hashing;

import java.util.HashMap;
import java.util.Map;

class CountSumOfSubarray {
	
	private static int sybArraySum(int nums [], int k) {
		
		int prefix = 0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);
		
		int count = 0;
		int n = nums.length;
		
		for(int i=0; i<n; i++) {
			prefix = prefix + nums[i];
			int rem = prefix-k;
			count +=map.getOrDefault(rem, 0);
			map.put(prefix,map.getOrDefault(prefix, 0)+1);
			
		}
		
		
		
		return count;
	}

	public static void main(String[] args) {
		int nums [] = {1,2,3,-3,1,1,1,4,2,-1,-3};
		int k = 3;
		int ans = sybArraySum(nums,k);
		System.out.println(ans);

	}

}
