package BinarySearchPractices;
/**
 * smallest index such that nums[i]>=target
 */
public class LowerBound {
	
	private static int findLowerBoundOptimal(int nums[], int target, int n) {
		
		int low = 0;
		int high = n-1;
		int ans = n;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]>=target) {
				ans =mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return ans;
		
	}
//brute force	
private static int findLowerBound(int nums[], int target, int n) {

	for(int i=0; i<n; i++) {
		if(nums[i]>=target) {
			return  i;
		}
	}
	  
	return n ;
		
	}

	public static void main(String[] args) {
		int nums[]= {1,2,3,3,5,8,8,10,10,11};
		int target =1;
		int v = findLowerBoundOptimal(nums,target,nums.length);
		System.out.println(v);
		
		int v1 = findLowerBound(nums,target,nums.length);
		System.out.println("brute force approch " +v1);
		
		
		
	}

}
