package BinarySearchPractices;

public class BinarySearchIterativeApproch {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7};
		int v = search(num,6);
		System.out.println(v);
	}
	
	public static int search(int num[], int target) {
		
		int low=0;
		int high = num.length-1;
		while(low<= high) {
			int mid = (low+high)/2;
			if(target == num[mid]){
				return mid;
			}else if(target < num[mid]) {
				high=mid-1;
			}else if(target > num[mid]) {
				low= mid+1;
			}
		}
		return -1;
	}
}


