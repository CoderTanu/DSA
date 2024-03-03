package StringPractices;

public class StringCompare {

	public static void main(String[] args) {
		
		String s ="Tanu";
		String s1 ="Tan78u";
//		System.out.println(s.equals(s1));
//		System.out.println(s.equalsIgnoreCase(s1));
		// By Using == operator
		System.out.println(s == s1);
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo(s1));

	}

}
