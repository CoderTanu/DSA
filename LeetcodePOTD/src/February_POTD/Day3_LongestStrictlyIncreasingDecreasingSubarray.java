package February_POTD;


/**
 *1752. Check if Array Is Sorted and Rotated
 * 
 * Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
 * There may be duplicates in the original array.
 * 
 */
public class Day3_LongestStrictlyIncreasingDecreasingSubarray {

	public static boolean specialArray(int s[]) {
		int n = s.length;
		if(n == 1) return true;
		for(int i=1; i<n; i++) {
			if((s[i] % 2) ==(s[i-1]%2)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int s[] = {2,1,4};
		System.out.println(specialArray(s));
	}

}
