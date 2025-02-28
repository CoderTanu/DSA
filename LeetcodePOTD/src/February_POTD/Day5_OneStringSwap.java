package February_POTD;

/**
 * Question
 * 1790. Check if One String Swap Can Make Strings Equal
 * 
 */



public class Day5_OneStringSwap {
	
	private static boolean areAlmostEqual(String s1, String s2) {
		int n = s1.length();
		int countDiff = 0;
		int index1 = 0;
		int index2 = 0;
		for(int i=0; i<n; i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				countDiff++;
				if(countDiff>2) return false;
				else 
					if(countDiff ==1) index1 =i;
					else index2 = i;
			}
		}
		
		return (s1.charAt(index1) == s2.charAt(index2) && s1.charAt(index2) == s2.charAt(index1));
		
	}

	public static void main(String[] args) {
		String s1 ="bank";
		String s2 ="pakb";
		boolean ans = areAlmostEqual(s1,s2);
		System.out.println(ans);

	}

}
