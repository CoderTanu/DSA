package March_POTD;

import java.util.ArrayList;
import java.util.List;


/**
 * 1358. Number of Substrings Containing All Three Characters
 * Sliding window approch
 */
public class NumberOfSubString_Medium {
	
//	
//	  public static int numberOfSubstrings(String s) {
//
//
//	        int n = s.length();
//	        
//	        if(n<3) return 0;
//
//	        List<String> list = new ArrayList<>();
//	        for(int i=0; i<n; i++){
//	            for(int j=i; j<n; j++){
//	               list.add(s.substring(i, j+1));
//	            } 
//	         }
//	 
//	    	System.out.println(list);
//
////check a,b,c present or not
//	         int count =0;
//	        for(int i= 0; i<list.size(); i++) {
//	        	
//	        	if(isAtLeastPresent(list.get(i))) {
//	        		count++;
//	        	}
//	        }
//	       return count;
//	        
//	    }
//	 
//	private static boolean isAtLeastPresent(String s) { 
//			   return (s.contains("a") && s.contains("b") && s.contains("c"));
//	}
//

	
	public static int numberOfSubstrings(String s) {


		   int n = s.length();
	        int freq[] = new int[3];
	        int count =0;
	        int curCount =0;
	        int l =0;
	        for(int r=0; r<n; r++){
	            //expansion
	            char ch = s.charAt(r);
	            freq[ch-'a']++;
	            if(freq[ch-'a'] == 1){
	              curCount++;  
	            }

	            while(curCount==3){
	                count += (n-r);
	                //shrinking
	                char c = s.charAt(l);
	                freq[c-'a']--;
	               if(freq[c-'a'] == 0){
	                   curCount--;  
	                 }
	                 l++;

	            }
	        }

	     return count;

        
    }
	
	
	public static void main(String[] args) {
		String s = "abc";
		int ans = numberOfSubstrings(s);
		System.out.println(ans);

	}

}
