package January_POTD;

/**
 * 2657. Find the Prefix Common Array of Two Arrays
 * time required to solve: 10 min
 * own/video solution: video solution
 * 
 * approch: 
 * using counting freq of two array if both the no present in the array so increase the count and store inside freq array
 */

public class Day14_Medium_Array {
	
	//using map
	private static int[] findThePrefixCommonArray(int A[], int B[]) {	
		int count =0;
		int n =A.length;
		int ans [] = new int[n];
		int freq [] = new int[n+1];
		for(int i=0; i<n; i++) {
			//counting the freq in A array and stored inside freq array
			freq[A[i]]++;
			if(freq[A[i]] == 2) count++;
			//counting the freq in A array and stored inside freq array
			freq[B[i]]++;
			if(freq[B[i]] == 2) count++;


			ans[i] = count;
		}
		return ans;
	}

	public static void main(String[] args) {
		int A[] = {1,3,2,4};
		int B[] = {3,1,2,4};
		int m[] = findThePrefixCommonArray(A,B);
		for(int i =0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}

}
