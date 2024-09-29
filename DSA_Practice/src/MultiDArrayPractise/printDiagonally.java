package MultiDArrayPractise;

public class printDiagonally {
	
	
	public static void main(String[] args) {
		
		 int a[][]= {{12,56},{45,78}};
		 matrixDiagonally(a);
		 
	}

	
	  public static int[] matrixDiagonally(int[][] mat) {
	        
	        int i =0;
	        int j=0;
	        boolean isUp =true;
//	        int arr[] =new int[mat.length];
//	        arr[0] = mat[0][0];
	     //   System.out.println(arr[0]);
	        int n=mat.length;
	        for(int k=0; k<n ;) {
	             if(isUp) {
	               for(; i>=0 && j<n; j++, i--)
	               {
	            	   System.out.println( mat[i][j]);  
	                	   k++;
	                   }
	                   
	           }     
	               
	           }
			return arr;        
	  }  
}
