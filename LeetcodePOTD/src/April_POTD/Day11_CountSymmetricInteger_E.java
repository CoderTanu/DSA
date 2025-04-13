package April_POTD;

/**
 * 2843. Count Symmetric Integers
 */
public class Day11_CountSymmetricInteger_E {
	
	private static int findSum(String n) {
		int sum = 0;
		for(int i=0; i<n.length(); i++) {
			sum +=n.charAt(i);
		}
		System.out.println(sum);
		return sum;
	}
	
	 public static int countSymmetricIntegers(int low, int high) {
	        int symmetricCount = 0;
	        for(int i =low; i<=high; i++){
	           int digitLen = String.valueOf(i).length();
	           System.out.println("digitLen" + digitLen);
	           if(digitLen%2 == 0  && digitLen >= 2){
System.out.println(" i data" + i);
	                int mid = digitLen/2;
	                System.out.println("mid" +mid);
	                 String firstN = String.valueOf(i).substring(0, mid);
	                 System.out.println("firstNs" + firstN);
	                 String lastN =String.valueOf(i).substring(mid, digitLen);
	                 System.out.println("lastN" + lastN);
	                 int sumfirst = findSum(firstN);
	                 int sumlast = findSum(lastN);
	                if(sumfirst == sumlast){
	                    symmetricCount++;
	                }
	           }
	        }

	        return symmetricCount;
	    }

	public static void main(String[] args) {
		int ans = countSymmetricIntegers(90,100);
		System.out.println(ans);

	}

}
