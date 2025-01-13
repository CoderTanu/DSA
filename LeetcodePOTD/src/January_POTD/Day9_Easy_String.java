package January_POTD;

/**
 * 2185. Counting Words With a Given Prefix
 * time required to solve: 5 min
 * own/video solution: own
 */

public class Day9_Easy_String {
	
	private static int prefixCount(String words[], String pref) {	
		int count =0;
		int n =words.length;
		for(int i=0; i<n; i++) {
			String word = words[i];
			if(word.startsWith(pref)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String [] words = {"pay","attention","practice","attend"}; 
		String pref = "at";
		int n = prefixCount(words, pref);
        System.out.println(n);
	}

}
