package February_POTD;

import java.util.HashMap;
import java.util.Map;

/**
 * Question
 * 1092. Shortest Common Supersequence 

 * 
 */



public class Day28_ShortestComSupsubSeq {
	
	public static String shortestCommonSupersequence(String str1, String str2) {
	      
	      int dp[][] = lcs(str1, str2);
	      int n= dp.length;
	      int m=dp[0].length;
	      int i=n-1;
	      int j=m-1;
	      StringBuilder sb = new StringBuilder();
	      while(i>0 && j>0){
	        if(str1.charAt(i-1) == str2.charAt(j-1)){
	        sb.append(str1.charAt(i-1));
	        i--;
	        j--;
	        } else if(dp[i-1][j]>dp[i][j-1]){
	             sb.append(str1.charAt(i-1));
	             i--;
	        }else{
	          sb.append(str2.charAt(j-1));
	          j--;
	        }

	      }
	    while(i>0){
	         sb.append(str1.charAt(i-1));
	             i--;
	    }
	    while(j>0){
	           sb.append(str2.charAt(j-1));
	          j--;
	    }

	       return sb.reverse().toString(); 
	    }

	    public static int[][] lcs(String s1, String s2){
	        int n = s1.length();
	        int m = s2.length();
	        int dp[][]= new int[n+1][m+1];
	        dp[0][0] =0;

	        for(int i=1; i<n+1; i++){
	            for(int j=1; j<m+1; j++){
	                if(s1.charAt(i-1) == s2.charAt(j-1)){
	                dp[i][j] = 1 + dp[i-1][j-1];
	                }else{
	                    int case1 = dp[i-1][j];
	                    int case2 = dp[i][j-1];
	                    dp[i][j] = Math.max(case1, case2);
	                 }
	            }
	        }
	        return dp;
	    }
	public static void main(String[] args) {
		String str1 ="abac";
		String str2 = "cab";
		String ans = shortestCommonSupersequence(str1, str2);
		System.out.println(ans);

	}

}
