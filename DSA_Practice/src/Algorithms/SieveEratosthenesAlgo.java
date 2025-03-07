package Algorithms;

/**
 * SieveEratosthenesAlgo used for prime number 
 */
public class SieveEratosthenesAlgo {

	
	 public static void sieve(int n) {
		 
		 boolean prime[] = new boolean[n+1];
		 for(int i=2; i<n; i++) {
			 prime[i] = true;
		 }
		 
//		 for(int i =2; i<n; i++) {
//			 if(prime[i]){
//				 for(int j = 2*i; j<=n; j+=i) {
//					 prime[j] = false; 
//				 }
//			 }
//		 }
//		 for(int i=2; i<n; i++) {
//			 if(prime[i]) {
//				 System.out.print(i +" ");
//			 }
//		 } 
		 
		 
		 //opyimzide
		 //TC: log(log n)
		 for(int i =2; i<n*n; i++) {
			 if(prime[i]){
				 for(int j = i*i; j<=n; j+=i) {
					 prime[j] = false; 
				 }
			 }
		 }
		 for(int i=2; i<n; i++) {
			 if(prime[i]) {
				 System.out.print(i +" ");
			 }
		 } 
		 
		 
		 //total TC: O(n log(log n)) + O(n)
	 }
	public static void main(String[] args) {
		sieve(8);
	}

}
