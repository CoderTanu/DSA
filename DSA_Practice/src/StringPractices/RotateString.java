package StringPractices;

public class RotateString {
	
	
	
	  public static  boolean rotateString(String s, String goal) {
		    int n =s.length();
	        int min = 0;
	        String left = "";
	        
	        
	        for(int i =0; i<n ; i++) {
	            String right = s.substring(i);
	            if(right+left == goal) {
	            	return true;
	            }
	        	
	        	left +=s.charAt(i);
	        }
	        
	        return false;
	    }

	public static void main(String[] args) {
		String s = "abcde";
		String goal ="cdeab";
		
            System.out.println(rotateString(s,goal));
	}

}
