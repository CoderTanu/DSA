package January_POTD;

import java.util.ArrayList;
import java.util.List;

/**
 * 916. Word Subsets
 * time required to solve: 20 min
 * own/video solution: video solution
 */

public class Day10_Medium_String {
	public static int[] getFreq(String word){
        int freq[] = new int[26];
        for(int i=0; i<word.length(); i++){
            freq[word.charAt(i) - 'a']++;
        }
        return freq;
  }
	
  public static List<String> wordSubsets(String[] words1, String[] words2) {
      int freq[] = new int[26];
      for(String word: words2){
          int temp[] = getFreq(word);
          for(int i=0; i<26; i++){
            freq[i]  = Math.max(freq[i], temp[i]);
          }
      }
      List<String> ansList = new ArrayList<>();
      for(String word: words1){
          int temp[] = getFreq(word);
          boolean containData = true;
          for(int i=0; i<26; i++){
           if(freq[i] > temp[i]){
             containData =  false;
             break;
            }
          }
           if(containData){
              ansList.add(word);
          }
      }

      return ansList;
  }
  
	public static void main(String[] args) {
		String [] words1 = {"amazon","apple","facebook","google","leetcode"}; 
		String [] words2= {"e","o"};
		List<String> ansList = wordSubsets(words1, words2);
		
		for(int i=0; i<ansList.size(); i++) {
			System.out.print(ansList.get(i) +  " ");
		}
        
	}

}
