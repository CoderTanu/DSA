package StringPractices;


/**
 * isomorphic:   if the characters in s can be replaced to get t.
 * 
 * "egg" , t = "add"
 */
public class IsomorphicString {
	
	
	//brute force
	public  static boolean isomorphicString(String s, String t) {
		int n = s.length();
		int smap[] = new int[256];
		int tmap[] = new int[256];
		for(int i=0; i<n; i++) {
			if(smap[s.charAt(i)] != tmap[t.charAt(i)]) return false;
			
			smap[s.charAt(i)] = i +1;
			tmap[t.charAt(i)] = i+1;
		}
		
		
		return true;
       
    }
	

	public static void main(String[] args) {
		 String s = "apple" , t = "bbnbm";
		System.out.println(isomorphicString(s,t));

	}

}
