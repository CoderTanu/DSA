package Algorithms;

public class QuickSort {
	
	private static int partition(int nums[], int low, int high) {
		int i = low;
		int j = high;
		int pivot= nums[low];
		while(i<j) {
			while(nums[i]<=pivot && i<=high-1) {
				i++;
			}
			while(nums[j]>pivot && j >= low+1) {
				j--;
			}
			if(i<j) {
				 int temp = nums[i];
				 nums[i] = nums[j];
				 nums[j] = temp;
			}
		}
			 int temp = nums[low];
			 nums[low] = nums[j];
			 nums[j] = temp;
		   return j;
		
		
	}
	
	
	private static void quickSort(int nums[], int low, int high) {
		if(low>=high) return;
		int partitionIndex = partition(nums, low, high);
		quickSort(nums, low, partitionIndex-1);
		quickSort(nums, partitionIndex+1, high);
	}

	public static void main(String[] args) {
		int arr[] = {13,46,24,52,20,9};
		int low = 0;
		int high = arr.length-1;
		quickSort(arr, low , high);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
