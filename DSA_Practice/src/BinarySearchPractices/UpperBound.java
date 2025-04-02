package BinarySearchPractices;
/**
 * smallest index such that nums[i]>target
 */
public class UpperBound {
	
	private static int findUpperBoundOptimal(int nums[], int target, int n) {
		
		int low = 0;
		int high = n-1;
		int ans = n;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]>target) {
				ans =mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return ans;
		
	}
//brute force	
private static int findUpperBound(int nums[], int target, int n) {

	for(int i=0; i<n; i++) {
		if(nums[i]>target) {
			return  i;
		}
	}
	  
	return n ;
		
	}

	public static void main(String[] args) {
		int nums[]= {2,3,6,7,8,8,11,11,11,12};
		int target =6;
		int v = findUpperBoundOptimal(nums,target,nums.length);
		System.out.println(v);
		
		int v1 = findUpperBound(nums,target,nums.length);
		System.out.println("brute force approach " +v1);
		
		
		
	}

}
