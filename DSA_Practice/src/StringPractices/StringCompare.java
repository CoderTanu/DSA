package StringPractices;

public class StringCompare {

	public static void main(String[] args) {
		
//		String s ="Tanu";
//		String s1 ="Tan78u";
////		System.out.println(s.equals(s1));
////		System.out.println(s.equalsIgnoreCase(s1));
//		// By Using == operator
//		System.out.println(s == s1);
//		System.out.println(s.equalsIgnoreCase(s1));
//		System.out.println(s.compareTo(s1));
		
		
		
		
		//equals and == difference
		
		String s1 = new String("Tanu");
		String s2 = new String("Tanu"); 
		
		System.out.println(s1==s2);   // reference comparison
		System.out.println(s1.equals(s2)); //content comparison bcz equals() is overridden from Object class to content comparison
		
		
		
		StringBuffer sb1 = new StringBuffer("Tanu"); 
		StringBuffer sb2 = new StringBuffer("Tanu"); 
		
		System.out.println(sb1==sb2);    // reference comparison
		System.out.println(sb1.equals(sb2)); //reference comparison in StringBuffer class equals () is not overridden from Object class and in object class equals() used for reference comparison
		
		
		

	}

}
