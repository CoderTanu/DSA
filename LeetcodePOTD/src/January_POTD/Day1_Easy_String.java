package January_POTD;


/**
 * Maximum Score After Splitting a String
 * 
 */
public class Day1_Easy_String {
	
	
	
	 public static  int maxScore(String s) {

	       int score =0;
	       int oneScore = 0;
	       int zeroScore = 0;
	       int n = s.length();


	        for(int i =0; i<n; i++){
	       if(s.charAt(i) == '1'){
	             oneScore++;
	            }
	        }

	        for(int i =0; i<n-1; i++){
	             if(s.charAt(i) == '0'){
	               zeroScore++;
	            }else{
	                oneScore--;
	            }
	            score = Math.max(score, zeroScore+oneScore);
	        }

	       return score;
	        
	    }
	

	public static void main(String[] args) {
		
		System.out.println(maxScore("1100110"));
		

	}

}
