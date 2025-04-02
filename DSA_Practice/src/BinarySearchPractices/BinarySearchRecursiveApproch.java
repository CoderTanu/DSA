package BinarySearchPractices;

public class BinarySearchRecursiveApproch {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7};
		int target =13;
		int v = search(num,0,6,target);
		System.out.println(v);
	}
	
	public static int search(int nums[], int low, int high, int target) {
		
		//base case
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		
			if(target == nums[mid]){
				return mid;
			}else if(target < nums[mid]) {
				return search(nums, low, mid-1, target);
			}else {
				return search(nums, mid+1, high, target);
			}
	}
}


