//1.In Java, string is basically an object that represents sequence of char values.
//2.The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
//3.java.lang.String class is used to create a string object.
//4. how to create string
     //using string literal ex: String s="tanu"
     //using new keyword ex : String s = new String();
//5.String objects are immutable. Immutable simply means unmodifiable or unchangeable.
//6.A ClassLoader in Java uses a String object as an argument. Consider, if the String object is modifiable, the value might be changed and the class that is supposed to be loaded might be different.To avoid this kind of misinterpretation, String is immutable.
//7. As the String object is immutable we don't have to take care of the synchronization that is required while sharing an object across multiple threads.
//8.  immutable String objects avoid further errors by loading the correct class. This leads to making the application program more secure.
//9.The immutability of String helps to minimize the usage in the heap memory. When we try to declare a new String object, the JVM checks whether the value already exists in the String pool or not. If it exists, the same value is assigned to the new object. This feature allows Java to use the heap space efficiently.
//10. compare the String
//           There are three ways to compare String in Java:
//                         By Using equals() Method
//                         By Using == Operator
//                          By compareTo() Method
//11. The String class equals() method compares the original content of the string. It compares values of string for equality. String class provides the following two methods
//public boolean equals(Object another) compares this string to the specified object.
//public boolean equalsIgnoreCase(String another) compares this string to another string, ignoring case.
//12.The == operator compares references not values.
//13. The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.



package StringPractices;

public class StringPra {
	

	public static void main(String[] args) {
		
//		String s= "the sky is blue";
//		
//		StringBuilder sb = new StringBuilder();
//		String str="";
//		for(int i =0 ; i<=s.length()-1; i++) {
//			if(s.charAt(i) == ' ') {
//			   str+=s.charAt(i);
//			}
//		}
//		
//		System.out.println(str);
//		\\\
		
		
		//character of array
		
		char[] ch = {'t','a','n','u'};
		String s = new String(ch);
		System.out.println(s);
		
		
		
		
	
	}

}
