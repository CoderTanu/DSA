package February_POTD;


/**
 * 1752. Check if Array Is Sorted and Rotated
 * 
 * An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
 * 
 */
public class Day2_Easy_Array {

	public static boolean specialArray(int s[]) {
		int n = s.length;
		if(n == 1) return true;
		for(int i=1; i<n; i++) {
			if((s[i] % 2) ==(s[i-1]%2)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int s[] = {2,1,4};
		System.out.println(specialArray(s));
	}

}
