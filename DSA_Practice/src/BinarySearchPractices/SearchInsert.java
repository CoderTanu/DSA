package BinarySearchPractices;

public class SearchInsert {

	private static int searchInsertOptimal(int nums[], int target, int n) {
         int low =0;
         int high = n-1;
         int ans = n;
         while(low<=high) {
        	 int mid = (low+high)/2;
        	 if(nums[mid]>=target) {
        		 ans = mid;
        		 high = mid-1;
        	 }else {
        		 low= mid+1;
        	 }
         }
		return ans;
		
		
	}

	private static int searchInsert(int nums[], int target, int n) {
          for(int i=0; i<n; i++) {
        	  if(nums[i]>=target) {
        		  return i;
        	  }
          }
          return n;
	}

	public static void main(String[] args) {
		int nums[]= {1,2,4,7};
		int target =6;
		int v = searchInsertOptimal(nums,target,nums.length);
		System.out.println(v);

		int v1 = searchInsert(nums,target,nums.length);
		System.out.println("brute force approch " +v1);
	}

}
