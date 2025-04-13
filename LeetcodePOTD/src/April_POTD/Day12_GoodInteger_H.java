package April_POTD;

public class Day12_GoodInteger_H {
	

	private static boolean isDivisible(int x, int k){
        String s = String.valueOf(x);

        int freq[] = new int[10];
        for(char ch : s.toCharArray()){
            freq[ch-'0']++;
        }

        int oddCount =0;
        for(int count : freq){
            if(count%2 !=0) oddCount++;
        }

        boolean isKPalindrome;
        if(k%2 ==0){
            isKPalindrome = oddCount == 0;
        }else{
             isKPalindrome = oddCount == 1;
        }
        
        boolean isDivisible = x%k == 0;
       
         return isKPalindrome && isDivisible;
    }
    private  static boolean isPalindromic(int x){
        int ans = x;
        int reverse = 0;
        while(x !=0){
        int r = x % 10;
        reverse = reverse * 10 + r;
        x/=10;
        }
       if(ans == reverse) return true;

       return false; 
    }





    public static  long countGoodIntegers(int n, int k) {
        long count =0;

        int start = (n == 1) ? 0 :(int)Math.pow(10, n-1);
        int end = (int) Math.pow(10,n)-1;
        for(int x=start +1; x<=end; x++){
           //	System.out.println(" "+ x);
          
          if(isPalindromic(x) && isDivisible(x,k)){
        
        	  System.out.println("x"+x);
        	 
            count++; 
        }
        }
       
        System.out.println("count"+ count);  
        return count; 
    }

	public static void main(String[] args) {
		long ans = countGoodIntegers(3,5);
		//System.out.println("ans" +ans);
	}

}
