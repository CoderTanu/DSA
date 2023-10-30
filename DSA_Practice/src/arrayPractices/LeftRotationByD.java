package arrayPractices;

public class LeftRotationByD {
	
	
	public static void leftRotationByD(int a[], int n, int d) {
		
		
		
		if (n == 0)
		      return;
		  d=d%n;
		    if (d > n)
		      return;
		  
		    int temp[]= new int[d];   
		  	//put back in temp
				for(int i=n-d; i<n; i++) {
					temp[i-(n-d)]=	a[i];
				} 
		    
		    
		//shifting
		
		for(int i=n-d-1; i>=0; i--) {
			a[i+d]=a[i];
		}
		
	
		
		//store inside temp
		for(int i=0; i<d; i++) {
			a[i]=temp[i];
		}
		
		System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
          System.out.print(a[i] + " ");
        }
		
	}

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7};
		int n=a.length;
		int d=2;
    	leftRotationByD(a,n,d);
    	
	}

}
