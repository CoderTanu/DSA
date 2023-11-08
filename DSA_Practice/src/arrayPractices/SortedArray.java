package arrayPractices;

public class SortedArray {
	
	
	
	//brute force apprroch
	//TC: O(N*n)
	//Sc:O(1)
	public static boolean isSortedArrayByBrute(int a[]) {
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j] ) {
					return false;
				}
			}
		}
		
		
		
		return true;
		
	}
	
	//optimal  apprroch
		//TC: O(n)
		//Sc:O(1)
		public static boolean isSortedArray(int a[]) {
			
			for(int i=1; i<a.length; i++) {
				if(a[i]<a[i-1] ) {
						return false;
					}
				}
			
			
			
			
			return true;
			
		}


	public static void main(String[] args) {
		  int a[]= {1,2,3,5,6,8};
            boolean n=isSortedArray(a);
            System.out.println(n);
	}

}
