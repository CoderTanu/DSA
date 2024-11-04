package StringPractices;

public class StringHeapAndSCP {

	public static void main(String[] args) {
		String s1 = new String("You cannot change me");
		String s2 = new String("You cannot change me");
		System.out.println(s1==s2);  //false;
		
		String s3 ="You cannot change me";
		System.out.println(s1==s3); //false
		
		String s4 = "You cannot change me";
		System.out.println(s3==s4);//true
		
		String s5 ="You cannot " + "change me"; //operation performed at compile time bcz constant value
		System.out.println(s4==s5);//true
		
		String s6 ="You cannot ";
		String s7 = s6 + "change me"; //operation performed at runtime only bcz constant combined with variable
		System.out.println(s4==s7); //false bcz same date but s4 pointing to SCP and S7 is pointing to heap area
		
		final String s8 ="You cannot ";
		String s9 = s8+ "change me"; //every final variable replaceable only compiler time and operation performed at compile time bcz constant value
		System.out.println(s4==s9); //true
		
		
		//6 object is created for above string data
		
		//s1,s2,s7---heap area
		//s3,s4,s5,s6,s9--->SCP

	}

}
