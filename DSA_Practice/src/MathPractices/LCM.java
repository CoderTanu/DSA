package MathPractices;

public class LCM {
//	
//	//TC O(N1*N2)
//	//SC O(1)
//     public static int lcm(int n1, int n2) {
//		
//		int i = 1;
//        int maxNum = Math.max(n1, n2);
//        do {
//        	int multiple = i* maxNum;
//        	if(multiple% n1 ==0 && multiple% n2 ==0) {
//        		
//        		return multiple;
//        	}
//        	i++;
//        }while(){
//        	 return -1;
//        }
//		
//	}
     
   //TC=O(log(min(n1,n2))
 	//SC=O(1)
     public static  int gcdOptimal(int n1, int n2) {
 		int val = 0;
 		while(n1!=0 && n2!=0) {
 			if(n1>n2) n1 = n1%n2;
 			else n2 = n2%n1;
 			if(n2 == 0) val =  n1;
 			else val = n2;;
 		}
 		return val;
 	}
     
     

	public static void main(String[] args) {
		//int ans = lcm(3,5);
		//System.out.println(ans);
		int ans2 = (3 * 5)/gcdOptimal(3,5);
		System.out.println(ans2);
	}

}
