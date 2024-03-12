package StringPractices;

import java.util.ArrayList;
import java.util.List;

public class test {
	
	
	public static char nthCharacter(String s, int r, int n)
    {
        String  newStr="";
        char ch = 0;
        
         for(int i=0; i<r; i++){
             
             newStr = check(s);
         }
         
         for(int i=0; i<newStr.length(); i++){
             
             if(i == n){
                 ch=newStr.charAt(i);
             }
         }
         
         return ch;
        
    } 
      
        
      public static String check(String s)  
        {
       String str="";
       for(int i=0; i<s.length(); i++){
           if(s.charAt(i) == '1'){
              str=str+"10";
           }else  if(s.charAt(i) == '0'){
              str=str+"01";
           }
       }
       return str;
    }

	
	public static void main(String[] args) {
	
//		
//		String s="1100";
//		int r=2;
//		int round=0;
//	   String str="";
//	  if(r>0) {
//		  
//		  
//     for(int i=0; i<s.length(); i++){
//         if(s.charAt(i) == '1'){
//            str=str+"10";
//         }else  if(s.charAt(i) == '0'){
//            str=str+"01";
//         }
//     }
//	}
//     s=str;
//     round++;
//     System.out.println(round);
//     
//     if(round==r) {
//    	 
//     }
//     System.out.println(s);
////     System.out.println(str);
//		String s = "1100";
//			int	r = 2;
//			int	n = 3;
//		
//		sysout    
//		nthCharacter( s,  r,  n);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		
		System.out.println(list.get(0));
	
}

}

