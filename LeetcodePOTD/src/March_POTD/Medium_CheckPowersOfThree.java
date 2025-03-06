package March_POTD;

/**
 * 1780. Check if Number is a Sum of Powers of Three
 * Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.
 * An integer y is a power of three if there exists an integer x such that y == 3x.
 */
public class Medium_CheckPowersOfThree {
	
	public static boolean checkPowersOfThree(int n) {
		while(n>0){
			if(n%3 == 2) {
				return false;
			}
			
			n = n/3;
			
		}
		return true;
	}

	public static void main(String[] args) {
		int n =21;
		System.out.println(checkPowersOfThree(n));

	}

}
