package January_POTD;

/**
 * 3042. Count Prefix and Suffix Pairs I
 *  time required to solve: 10 min
 * own/video solution: video solution
 */

public class Day8_Easy_String {
	
	private static int countPrefixSuffixPairs(String words[]) {
		
		int count = 0;
		int n = words.length;
		for(int i=0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				String word1 = words[i];
				String word2 = words[j];
				if(word1.length() > word2.length()) {
					continue;
				}
				if(word2.startsWith(word1) && word2.endsWith(word1)) {
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		String words [] = {"pa","papa","ma","mama"};
		int count = countPrefixSuffixPairs(words);
		System.out.println(count);
	}

}
