package patternPractices;

public class PatternPrint {
	
	
	/*****
	*****
	*****
	*****
	*****/
	//1
	public void squarePattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0;j<n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//2
	public  void nForest(int n) {
        for(int i=0;i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
             System.out.println("");
        }
    }
	//3
	  public   void nTriangle(int n) {
	         for(int i=1;i<=n; i++){
	            for(int j=1; j<=i; j++){
	                System.out.print(j +" ");
	            }
	             System.out.println("");
	        }
	    }
	//4
	  public  void nTriangleNum(int n) {
	      for(int i=1;i<=n; i++){
	            for(int j=1; j<=i; j++){
	                System.out.print(i +" ");
	            }
	             System.out.println("");
	        } 
	    }
	//5
	  public  void nTriangleNum2(int n) {
	         for(int i=1;i<=n; i++){
	            for(int j=1; j<=i; j++){
	                System.out.print(j +" ");
	            }
	             System.out.println("");
	        }
	    }
	  //6
	  public  void seeding(int n) {
	         for(int i=1;i<=n; i++){
	            for(int j=1; j<=n-i+1; j++){
	                System.out.print("* ");
	            }
	             System.out.println("");
	        } 
	    }
	  //7
	  public  void nNumberTriangle(int n) {
	         for(int i=1;i<=n; i++){
	            for(int j=1; j<=n-i+1; j++){
	                System.out.print(j +" ");
	            }
	             System.out.println("");
	        } 
	    }
	  
	  //8
	  public  void nStarTriangle(int n) {
	         for(int i=0;i<n; i++){
	             //space
	            for(int j=0; j<n-i-1; j++){
	                System.out.print(" ");
	            }
	            //star
	             for(int j=0; j<2*i+1; j++){
	                System.out.print("*");
	            }
	            //space
	             for(int j=0; j<n-i-1; j++){
	                System.out.print(" ");
	            }
	             System.out.println("");
	        } 
	    }
	  
	  //9
	  
	  public  void nStarTriangleRever(int n) {
	         for(int i=0;i<n; i++){
	             //space
	            for(int j=0; j<n-i+1; j++){
	                System.out.print(" ");
	            }
	            //star
	             for(int j=0; j<2*i+1; j++){
	                System.out.print("*");
	            }
	            //space
	             for(int j=0; j<n-i+1; j++){
	                System.out.print(" ");
	            }
	             System.out.println("");
	        } 
	  }
	
	  //10
	  
	  *
	  **
	  ***
	  ****
	  *****
	  ****
	  ***
	  *
	
	  public void print10(int n) {
	        for(int i=1;i<=2*n-1; i++){
	        	int stars=i;
	        	 if(i>n) {
	        		 stars=2*n-i;
	             }
		            for(int j=1; j<=stars; j++){
		                System.out.print("*");
		            }
		             System.out.println("");
		             
		            
		        }
		    }


      
	
	

	
	
	
	
	
	
	
	

}
