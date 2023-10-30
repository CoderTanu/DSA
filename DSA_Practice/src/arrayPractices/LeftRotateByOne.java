package arrayPractices;

public class LeftRotateByOne {
	
	   public static void leftRotation(int a[], int n) {
		   
		   int temp=a[0];
		   for(int i=1; i<n; i++) {
			   a[i-1]=a[i];
		   }
		   
		   a[n-1] =temp;
		   for (int i = 0; i < n; i++) {
			    System.out.print(a[i]+" ");
			  }
		   
	   }
	
	
	
	

	public static void main(String[] args) {
		
	
		int a[]= {1,2,3,4,5};
		int n=a.length;
    	leftRotation(a,n);

	}

}
