package March_POTD;

import java.util.ArrayList;
import java.util.List;

/**
 * 2161. Partition Array According to Given Pivot
 * 
 */

public class PivotArray_Medium {
	
	 public static int[] pivotArray(int[] nums, int pivot) {
		 int n = nums.length;
		 int ans[] = new int[n];
		 List<Integer> lessList  = new ArrayList<>();	
		 List<Integer> pivotList  = new ArrayList<>();
		 List<Integer> greaterList  = new ArrayList<>();
		 
		 for(int i=0; i<n; i++) {
			 if(nums[i]<pivot) {
				 lessList.add(nums[i]); 
			 }else if(nums[i]>pivot) {
				 greaterList.add(nums[i]);
			 }else {
				 pivotList.add(nums[i]);
			 }
		 }
		 List<Integer> ansList = new ArrayList<>();
		 ansList.addAll(lessList);
		 ansList.addAll(pivotList);
		 ansList.addAll(greaterList);
		 
		 for(int ind = 0; ind < ansList.size(); ind++) {
			 ans[ind] = ansList.get(ind);
		 }
		 
		 return ans;
	 }

	public static void main(String[] args) {
		int nums[] = {9,12,5,10,14,3,10}, pivot = 10;
		int ans[] = pivotArray(nums, pivot);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
