package March_POTD;

import java.util.ArrayList;
import java.util.List;

public class Day30_PartitonLabel_String_M {

	public static List<Integer> partitonLabels(String s){

		List<Integer> ans = new ArrayList<>();
		int start =0;

		while(start<s.length()) {

			int end = start;

			for(int i=start; i<=end; i++) {
				char c = s.charAt(i);
				int lastIndex = findLastIndex(s,c);
				end = Math.max(end, lastIndex);
			}
			ans.add(end-start+1);
			start = end+1;


		}
       System.out.println(ans);
       return ans;

	}



	private static int findLastIndex(String s, char c) {
		for(int i=s.length()-1; i>= 0; i--) {
			if(s.charAt(i) == c) return i;
		}
		return -1;
	}

	public static List<Integer> partitonLabelsOptimized(String s){
		List<Integer> ans = new ArrayList<>();
		int lastIndex[] = new int[26];
		for(int i=0; i<s.length(); i++) {
			lastIndex[s.charAt(i)-'a'] = i;
		}
		
		int start = 0; int end =0;
		for(int i=0; i<s.length(); i++) {
			end = Math.max(end,  lastIndex[s.charAt(i)-'a']);
			if(i ==end) {
				ans.add(end-start+1);
				start = end+1;
			}
		}
		
		
		return ans;	
	}


	public static void main(String[] args) {
		
		 long startTime = System.nanoTime(); 
		 String s = "ababcbacadefegdehijhklij";
	        // Call the function
		 partitonLabelsOptimized(s);
	        
	        // End time
	        long endTime = System.nanoTime(); 
	        
	        // Calculate elapsed time in milliseconds
	        double elapsedTime = (endTime - startTime) / 1e6; 
		System.out.println(elapsedTime);
	}

}
