package April_POTD;


/**
 * 1922. Count Good Numbers
 * A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime 
 */
public class Day13_CountGoodNumbers_Math_M {

	private static  long mod = 1000000007;
	private  static long pow (long x, long n){
		if(n == 0) return 1;
		long temp = pow(x, n/2);
		if(n%2 == 0){
			return (temp * temp) % mod;
		}else{
			return (x * temp * temp )%mod;
		}
	}
	
	public static int countGoodNumbers(long n) {
		long even = (n+1)/2;
		long odd = n/2;
		long evenPlacesEvenNum = pow(5 , even) % mod;
		long oddPlacesPrimeNum = pow(4,odd)% mod;
		return (int) ((evenPlacesEvenNum *oddPlacesPrimeNum) %mod);
	}

	public static void main(String[] args) {
		long ans = countGoodNumbers(4);
		System.out.println("ans" +ans);
	}

}
