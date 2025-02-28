package February_POTD;


/**
 * 1910. Remove All Occurrences of a Substring
 * Find the leftmost occurrence of the substring part and remove it from s.
 * Return s after removing all occurrences of part.
 */
public class Day11_Medium_String {
	
	public static String removeOccurence(String str, String part) {
		int n = str.length();
		int m = part.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(str.charAt(i));
			if(sb.length()>=m) {
				String sub = sb.substring(sb.length()-m);
				if(sub.equals(part)) {
					sb.setLength(sb.length()-3);
				}
			}
		}
		
		return sb.toString();	
	}
	

	public static void main(String[] args) {
		String str = "daabcbaabcbc";
		String part = "abc";
		String ans = removeOccurence(str, part);
		System.out.println(ans);
		
	}

}
