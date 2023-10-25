package recursion;


public class RecursionProblems {
	
	
	//1 print name 5 times
	public void printName(int i, int n) {
		if(i<=n) {
			System.out.println("tanu");
			printName(i+1, n);
		}
		
	}
	
	//2 print lineraly from 1 to n times
		public void printNumber(int i, int n) {
			if(i<=n) {
				System.out.println(i);
				printNumber(i+1, n);
			}
			
		}
		
		
		//3 print  from n to 1 times
				public void printNumberReverse(int n, int i) {
					if(n>=i) {
						System.out.println(n);
						printNumberReverse(n-1, i);
					}
					
				}
				
				
				//4 print  from 1 to n times by backtracking
				public void printNumberByBackTrack(int i, int n) {
					if(i<1) {
					 return;
					 }
					printNumberByBackTrack(i-1, n);
				System.out.println(i);
					
				}

			
				
//				//5 print  from n to 1 times by backtracking
//				public void printNumberByBackTrack1(int i, int n) {
//					if(n>1) {
//						 return;
//						 }
//					printNumberByBackTrack1(i, n-1);
//				System.out.println(n);
//					
//				}

				
			
	

}
