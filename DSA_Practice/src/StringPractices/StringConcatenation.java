package StringPractices;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		String s="tanu";
		String s1=" coder";
		//Concatenation using +
		System.out.println(s+ " " + s1);
		// Concatenation using concat
		System.out.println(s.concat(s1));
		//String concatenation using StringBuilder class
		StringBuilder s3 = new StringBuilder("Hello");
		StringBuilder s2 = new StringBuilder(" World");
		
		StringBuilder s4= s3.append(s2);
		System.out.println(s4.toString());
		
		//String concatenation using format() method
		String s5="";
		System.out.println(s5.format("%s%s" ,s, s1));
		
		//String concatenation using String.join() method (Java Version 8+)
          s5=String.join("", s,s1);
          System.out.println(s5);
          
          //. String concatenation using StringJoiner class (Java Version 8+)
          
          StringJoiner sj =new StringJoiner(", ");
          sj.add("tanu");
          sj.add("world");
          sj.add("Hello");
          System.out.println(sj.toString());
          
          // String concatenation using Collectors.joining() method (Java (Java Version 8+)
          List<String> list =Arrays.asList("abc ","xyz ","bvhc ");
          String str=list.stream().collect(Collectors.joining(","));
          System.out.println(str);
          
          
		
	}

}
