package January_POTD;
import java.util.Stack;

/**
 * 2116. Check if a Parentheses String Can Be Valid
 * time required to solve: 20 min
 * own/video solution: video solution
 * 
 * approach: 
 * using stack (most of the Parathensis problem solved using stack)
 */

public class Day12_Medium_String {
	
	
	private static boolean canBeValid(String s, String locked) {	
		int n = s.length();
        if(n%2 != 0) return false;

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            char state = locked.charAt(i);
            if(state =='0'){
                unlocked.push(i);
            }
            //if bracke is closing than first balance the bracket if any change present(0) in unlocked stack.
           else if(ch == '('){
               stack.push(i);
           }else{
              //locked and closing
              if(!stack.isEmpty()){
                stack.pop();
              }else{
                if(!unlocked.isEmpty()){
                    unlocked.pop();
                }else{
                    return false;
                }
              }
           }
        }
        

        while(!stack.isEmpty() && !unlocked.isEmpty() && stack.peek() < unlocked.peek() )
        {
            stack.pop();
            unlocked.pop();
        }

        return (stack.isEmpty());
        
	}
	
	public static void main(String[] args) {
		
		String s = "))()))";
		String locked = "010100";	
        System.out.println(canBeValid(s, locked));
       
	}

}
