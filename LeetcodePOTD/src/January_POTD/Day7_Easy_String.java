package January_POTD;

import java.util.ArrayList;
import java.util.List;

/**
 * 1408. String Matching in an Array
 *  time required to solve: 20 min
 * own/video solution: video solution
 */

public class Day7_Easy_String {
	
	private static List<String> stringMatching(String words[]) {
		
		int n = words.length;
	    List<String> list = new ArrayList<>();
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
		String words [] = {"leetcode","et","code"};
		stringMatching(words);
	}

}
