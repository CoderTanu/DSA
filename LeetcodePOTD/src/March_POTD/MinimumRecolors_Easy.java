package March_POTD;

/**
 * 2379. Minimum Recolors to Get K Consecutive Black Blocks
 * approach: sliding window
 */
public class MinimumRecolors_Easy {
	
	private static int minimumRecolors(String blocks, int k) {
		int n = blocks.length();
		int count=0;
		for(int i =0; i<k; i++) {
			if(blocks.charAt(i) == 'W') {
				count++;
			} 
		}
		int ans = count;
		for(int i =1; i<(n-k+1); i++) {
			if(blocks.charAt(i-1) == 'W') {
				count--;
			} 
			if(blocks.charAt(i+k-1) == 'W') {
				count++;
			} 

			ans = Math.min(ans, count);
		}
		return ans;
	}

	public static void main(String[] args) {
		String blocks = "WBWBBBW"; int k = 2;
		int ans = minimumRecolors(blocks, k);
		System.out.println(ans);
	}

}
