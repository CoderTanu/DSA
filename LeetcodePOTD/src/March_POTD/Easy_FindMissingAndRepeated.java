package March_POTD;


/**
 * Question
 * 2965. Find Missing and Repeated Values

 * 
 */

public class Easy_FindMissingAndRepeated {

	
	 public static int[] findMissingAndRepeatedValues(int[][] grid) {

         int ans[] = new int[2];

         //approch -1 using hashset
        //  int rows = grid.length;
        //  int cols = grid[0].length;
        //  int curSum  = 0;
        //  Set<Integer> set = new HashSet<>();
        //  for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         if(set.contains(grid[i][j])){
        //              ans[0] = grid[i][j]; 
        //           }else{
        //             set.add(grid[i][j]);
        //             curSum += grid[i][j];
        //           }
        //     }
        //  }

        //  int sq = rows * rows;
        //  int totalSum = sq *(sq+1)/2;
        //  ans[1] = totalSum-curSum;
        // //  for(int p = 1; p <= end; p++){
        // //     if(!set.contains(p)){
        // //         ans[1] = p;
        // //     }
        // //  }

      
      //approch -2 using array
         int rows = grid.length;
         int cols = grid[0].length;
         int curSum  = 0;
         int sq = rows * rows;
         int arr[]= new int[sq+1];
         for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[grid[i][j]] != 0){
                     ans[0] = grid[i][j]; 
                  }else{
                    arr[grid[i][j]] = 1;
                    curSum += grid[i][j];
                  }
            }
         }
         int totalSum = sq *(sq+1)/2;
         ans[1] = totalSum-curSum;
      
        return ans;
    }
	 
	 
	public static void main(String[] args) {
		int grid[][]= {{1,3},{2,2}};
		int ans[] = findMissingAndRepeatedValues(grid);
		for(int i=0; i< ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
