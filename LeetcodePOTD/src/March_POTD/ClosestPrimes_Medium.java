package March_POTD;

import java.util.ArrayList;
import java.util.List;

public class ClosestPrimes_Medium {

	//	public static  boolean isPrime(int n){
	//        if(n <= 1){
	//            return false;
	//        }
	//        for(int i=2; i<n; i++){
	//           if(n%i == 0){
	//             return false;
	//           } 
	//        }
	//        return true;
	//    }
	//	
	//	
	//	public static int[] closestPrimes(int left, int right) {
	//        int ans[] = {-1,-1};
	//        
	//       List<Integer> primeNumber = new ArrayList<>();
	//       for(int i=left; i<=right; i++){
	//          if(isPrime(i)){
	//            primeNumber.add(i);
	//          }
	//        }
	//       System.out.println(primeNumber);
	//       System.out.println(primeNumber.get(0));
	//       System.out.println(primeNumber.get(1));
	//
	//        ans[0] = primeNumber.get(0);
	//        ans[1] = primeNumber.get(1);
	//   
	//        return ans;
	//        
	//    }

	//optimzed

	public  static int[] closestPrimes(int left, int right) {

		boolean prime[] = new boolean[right+1];
		prime[0] = false;
		prime[1] = false;
		for(int i=2; i<=right; i++) {
			prime[i] = true;
		}

		for(int i =2; i*i <= right ; i++) {
			if(prime[i]){
				for(int j = i*i; j<=right; j+=i) {
					prime[j] = false; 
				}
			}
		}
		int ans[] = new int[]{-1,-1};
		int minDiff = Integer.MAX_VALUE;
		int prev =  -1;
		for(int i =left; i<=right; i++) {
			if(prime[i]){
				if(prev == -1){
					prev = i; 
				}else{
					if(i-prev < minDiff){
						ans[0]= prev;
						ans[1] = i;
						minDiff = i-prev; 
					}
					prev = i;
				}
			}
		}
		return ans;
	}


	public static void main(String[] args) {

		int ans [] = closestPrimes(10,19);
		for(int i=0; i<ans.length; i++){
			System.out.print(ans[i]+ " ");
		}

	}
}
