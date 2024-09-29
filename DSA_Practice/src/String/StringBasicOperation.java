package String;

public class StringBasicOperation {
	
	
	public static void main(String[] args) {
		
       String  str ="geeksforgeeks A-118, Sector-136, Uttar Pradesh-201305";
       System.out.println(str);
    // Replacing every non-digit number
       // with a space(" ")
       //str = str.replaceAll("[^\\d] & quot;, ", str);
       str =str.trim();
       System.out.println(str);
       
       str = str.replaceAll(" + ", " ");
       
       System.out.println(str);
       
       if (str.equals(" "))
           return "-1 & quot;
       ;
       
	}

}
