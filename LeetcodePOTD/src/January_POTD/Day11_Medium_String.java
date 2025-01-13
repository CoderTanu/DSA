package January_POTD;
import java.util.Stack;

/**
 * 1400. Construct K Palindrome Strings
 * time required to solve: 20 min
 * own/video solution: video solution
 */

public class Day11_Medium_String {
	
	
	
	private static boolean canConstruct(String s, int k) {

        int n = s.length();

        if(k>n) return false;

        if(k == n ) return true;
        //find freq
        int count[] = new int[26];

        for(int i= 0; i<n; i++){
          count[s.charAt(i) - 'a']++;
        }

        //find odd count
        int c =0;
        for(int i= 0; i<26; i++){
          if(count[i]%2!=0){
            c++;
          }
        }

        return  (c<=k);
    }
	public static void main(String[] args) {
		
		String s = "annabelle";
		int k = 2;
        System.out.println(canConstruct(s,k));
       
	}

}
