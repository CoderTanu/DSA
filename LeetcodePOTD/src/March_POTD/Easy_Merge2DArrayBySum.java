package March_POTD;

import java.util.ArrayList;

public class Easy_Merge2DArrayBySum {
	
	 public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {

	        ArrayList<int[]> res = new ArrayList<>();
	        int i = 0;
	        int j = 0;
	        int n = nums1.length;
	        int m = nums2.length;
	        while(i<n && j<m){
	            if(nums1[i][0] == nums2[j][0]){
	                res.add(new int[]{nums1[i][0], nums1[i][1]+ nums2[j][1]});
	                i++;
	                j++;
	            }else if(nums1[i][0] < nums2[j][0]){
	               res.add(new int[]{nums1[i][0], nums1[i][1]});
	                i++; 
	            }else{
	                res.add(new int[]{nums2[j][0], nums2[j][1]});
	                j++;
	            }
	        }
	        //if first array data is left
	        while(i<n){
	              res.add(new int[]{nums1[i][0], nums1[i][1]});
	                i++; 
	        }
	      //if second array data is left
	        while(j<m){
	              res.add(new int[]{nums2[j][0], nums2[j][1]});
	                j++;
	        }
	        return res.toArray(new int[res.size()][]);
	        
	    }

	public static void main(String[] args) {
		int nums1[][] = {{1,2},{2,3},{4,5}};
		int nums2 [][] = {{1,4},{3,2},{4,1}};
		int ans[][] =  mergeArrays(nums1, nums2);
		int n = ans.length;
		int m = ans[0].length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(ans[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
