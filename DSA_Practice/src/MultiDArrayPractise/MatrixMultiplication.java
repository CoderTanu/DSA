package MultiDArrayPractise;

public class MatrixMultiplication {
	
	public static int MAX = 100;
	
	public static int i=0, j=0,k=0;
	
	public static void multipleMatrixRect(int a[][],int b [][],int row1, int row2,int  col1, int col2 ,int c[][]){
		
		
		if(i>=row1) {
			return;
		}
		if(j<col2) {
			if(k<col1){
				
				c[i][j] += a[i][k] *b[k][j];
				k++;
				multipleMatrixRect(a, b , row1,  row2,  col1,  col2 , c);
			}
			k=0;
			j++;
			multipleMatrixRect(a, b , row1,  row2,  col1,  col2 , c);
			
			}
		j=0;
		i++;
		multipleMatrixRect(a, b , row1,  row2,  col1,  col2 , c);
		
	}	
		
		
	
	
	public static void multiplyMatrix(int a[][],int b [][],int row1, int row2,int  col1, int col2) {
	
		if(row2!=col1) {
			System.out.println("not possible");
		}
		
		int c[][] = new int[MAX][MAX];
		
		multipleMatrixRect( a,b, row1,  row2,  col1,  col2 , c);
		
		for(int i=0; i<row1; i++) {
			 for(int j=0; j<col2; j++) {
				 
				 System.out.print(c[i][j] + " ");
			 } 
			 System.out.println();
		 }
	
		
		
	}
	
	public static void main(String[] args) {
		
		 int a[][]= {{12,56},{45,78}};
		 int b[][]= {{2,6},{5,8}};
		 
		 
		 int row1 =2;
		 int row2 =2;
		 int col1=2;
		 int col2=2;
		 
		 multiplyMatrix(a,b,row1, row2, col1, col2);
		 
		 for(int i=0; i<a.length; i++) {
			 for(int j=0; j<a.length; j++) {
				 System.out.print(a[i][j] + " ");
			 } 
			 System.out.println();
		 }
		 
		 
		 for(int i=0; i<b.length; i++) {
			 for(int j=0; j<b.length; j++) {
				 
			 } 
			 System.out.println();
		 }
	
	
}

}
