package Algorithms;

import java.util.ArrayList;

public class MergeSort {
	
	private static void merge(int nums[], int mid, int low, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		  int left = low;
		  int right = mid+1;  
		  while(left<=mid && right<=high) {
			  if(nums[left]<=nums[right]) {
				  temp.add(nums[left]);
				  left++;
			  }else {
				  temp.add(nums[right]);
				  right++; 
			  }
		  } 
		  while(left<=mid) {
			  temp.add(nums[left]);
			  left++;
		  }
		  
		  while(right<=high) {
			  temp.add(nums[right]);
			  right++; 
		  }
		  
		  for(int i=low; i<=high; i++) {
			  nums[i] = temp.get(i-low);
		  }	
	}
	
	
	private static void mergeSort(int nums[], int low, int high) {
		//base case
	    if(low>= high) return;
		 int mid = (low+high)/2;
		 mergeSort(nums, low ,mid);
		 mergeSort(nums, mid+1, high);
		 merge(nums,  mid, low, high);
	}

	public static void main(String[] args) {
		int arr[] = {13,46,24,52,20,9};
		int low = 0;
		int high = arr.length-1;
		mergeSort(arr, low , high);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
