package January_POTD;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 * 2559. Count Vowel Strings in Ranges
 * 
 * Approach : 
 * 
 * 1. 
 */
public class Day2_Medium_String {

	private static int[] countVowelInStringRange(String[] words, int[][] querries){
		int n = querries.length;;
		int ans[] = new int[n];
		int m = words.length;
		int prefixSum[] = new int[m];
		prefixSum[0] = isVowel(words[0]);
		for(int i =1; i<m; i++) {
			prefixSum[i] = prefixSum[i-1] + isVowel(words[i]);
		}

		for(int i =0; i<n; i++) {
			int l = querries[i][0];
			int r =querries[i][1];
			
			int res = prefixSum[r];
			if(l!=0) {
				res -= prefixSum[l-1];
			}
			 ans[i] = res;	
		}
		return ans;
	}
	private static int isVowel(String word) {
		HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
		char first = word.charAt(0);
		char last = word.charAt(word.length()-1);
		if(set.contains(first) && set.contains(last)) {
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {

		String[] words = {"aba","bcb","ece","aa","e"};
		int [][] querries = {{0,2},{1,4},{1,1}};
		int res[]= countVowelInStringRange(words,querries);
		for(int i=0; i<res.length; i++) {
			System.out.print( res[i] + " ");
		}
	

	}

}
