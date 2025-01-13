package StringPractices;

import java.util.Stack;

public class PalindromCheck {
	
	
	    public static boolean palindromeCheck(String s) {
	       //reverse the string and than check wether the string matched with original String

	    //String originalString = s;
	       StringBuilder sb = new StringBuilder();
	       Stack stack = new Stack();
	       for(int i =0; i<s.length(); i++){
	          stack.push(s.charAt(i));
	       }

	       while(!stack.isEmpty()){
	            sb.append(stack.pop());
	       }

	       System.out.println(s);
	       if(s.equals(sb.toString())){
	        return true;
	       }

	       return false;
	    }

   public static void main(String[] args) {
	   System.out.println(palindromeCheck("hannah"));
    }




}
