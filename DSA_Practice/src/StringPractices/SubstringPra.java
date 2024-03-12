package StringPractices;

public class SubstringPra {

	public static void main(String[] args) {
	
		
		String s="acdcdacdc";
		
		
//		System.out.println(s.substring(1, 4));
		
		for(int i=0; i<s.length()-1; i++) {
			String subString="";
			for(int j=i; j<s.length()-1; j++) {
				
				subString =subString+s.charAt(j);
				System.out.println(subString);
			}
		}
		
		
	}

}
