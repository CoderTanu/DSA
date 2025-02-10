package February_POTD;


/**
 * 3174. Clear Digits
 * You are given a string s.Your task is to remove all digits by doing this operation repeatedly:
   Delete the first digit and the closest non-digit character to its left.
   Return the resulting string after removing all digits.
 */
public class Day10_Easy_String {
	
	
	
	public static String clearDigit(String str) {
		int n = str.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			if(!Character.isDigit(str.charAt(i))) {
				sb.append(str.charAt(i));
			}else {
				if(sb.length() != 0) {
					sb.deleteCharAt(sb.length()-1);
				}
			}
		}
		
		return sb.toString();	
	}
	
	
	

	public static void main(String[] args) {
		String str = "abc5";
		String ans = clearDigit(str);
		System.out.println(ans);
		
	}

}
