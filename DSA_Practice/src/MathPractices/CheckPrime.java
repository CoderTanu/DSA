package MathPractices;



public class CheckPrime {
	
	//TC O(n)
	//SC(1)
	public static boolean checkPrime(int n) {
		 if(n == 1) return false;
		 for(int i=2; i<n; i++) {
			 if(n%i == 0) {
				 return false;
			 }
		 }
		 return true;
	}
	
	
//	TC O(sqrt(n)) ---Optimal is faster than brute for larger number of n
//	SC(1)
	public static boolean checkPrimeOptimal(int n) {
		 if(n == 1) return false;
		 for(int i=2; i*i<=n; i++) {
			 if(n%i == 0) {
				 return false;
			 }
		 }
		 return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPrime(23));
		System.out.println(checkPrimeOptimal(23));
	}

}
