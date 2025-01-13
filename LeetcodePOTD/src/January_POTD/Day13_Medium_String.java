package January_POTD;

import java.util.HashMap;
import java.util.Map;

/**
 * 3223. Minimum Length of String After Operations
 * time required to solve: 20 min
 * own/video solution: video solution
 * 
 * approch: 
 * using hashing or map
 */

public class Day13_Medium_String {
	
	
	//using map
	private static int minimumLength(String s) {	
		int count =0;
		int n =s.length();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}else {
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			}
		}
		
		for(Map.Entry<Character, Integer> mapData : map.entrySet()) {
			if(mapData.getValue() % 2 == 0) {
				count +=2;
			}else {
				count +=1;
			}
		}
		return count;
	}
	
	
	//using hasing
	
	private static int minimumLengthUsingHashing(String s) {	
		int count =0;
		int n =s.length();
		int freq[] = new int[26];
		for(int i=0; i<n; i++) {
			freq[s.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<26; i++) {
			if(freq[i] > 0) { 
			if(freq[i]% 2 == 0) {
				count +=2;
			}else {
				count +=1;
			}
		  }
		}
		return count;
	}
	

	public static void main(String[] args) {
		String s = "abaacbcbb";
		int n = minimumLength(s);
        System.out.println(n);
        
        int m = minimumLengthUsingHashing(s);
        System.out.println(m);
	}

}
