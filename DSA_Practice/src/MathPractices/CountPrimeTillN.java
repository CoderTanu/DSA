package MathPractices;



public class CountPrimeTillN {
	
	
	
//	TC O( n+ sqrt(n))
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
	
	public static int countPrime(int n) {
		int count = 0;
		for(int i=2; i<=n; i++) {
			if(checkPrimeOptimal(i)) {
				count++;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		int ans = countPrime(10);
		System.out.println(ans);
	}

}
