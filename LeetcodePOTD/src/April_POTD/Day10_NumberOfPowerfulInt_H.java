
package April_POTD;

import java.util.Arrays;

/**
 * 2999. Count the Number of Powerful Integers
 * 
 */

public class Day10_NumberOfPowerfulInt_H {


	private static long dp[][];
	private static final int MAX_DIGITS = 17;



	private static long numberOfPowerfulInt(long start, long finish,int limit, String s){
		long suffixVal = Long.parseLong(s);
		String startStr = Long.toString(start-1);
		String finishStr =Long.toString(finish);

		int finishDigit = finishStr.length();
		int startDigit = startStr.length();

		long upToFinish = (finish>= suffixVal)? solveUpTo(finishStr,finishDigit, limit,s): 0;
		long upToStart =(suffixVal<start)? solveUpTo(startStr, startDigit, limit, s):0;
		return upToFinish - upToStart;

	}
	private static long solveUpTo(String str, int digit, int limit, String s) {
		dp = new long[MAX_DIGITS][2];
		for(long row []: dp) {
			Arrays.fill(row, -1);
		}
		long result = countValidNumber(str, 0, digit,true,limit,s);
		if(checkSubstract(str,digit,s, limit)) {
			result--;
		}

		return result;
	}


	private static boolean checkSubstract(String str, int digit, String s, int limit) {

		if(digit<s.length()) return false;
		String suffixOfNum =str.substring(digit-s.length());
		boolean substract = Long.parseLong(suffixOfNum) <Long.parseLong(s);

		if(substract) {
			for(int i=0; i<digit-s.length(); i++) {
				if((str.charAt(i)-'0')> limit) 
					substract =false;
				break;
			}
		}
		return substract;
	}


	private static long countValidNumber(String str, int index, int digit, boolean isTight, int limit, String s) {
		if(index == digit) return 1;
		if(dp[index][isTight?1:0] != -1) return dp[index][isTight?1:0];

		int low , high;
		int sLen = s.length();
		if(index>=digit -sLen) {
			int suffixIndex = index -(digit -sLen);
			low = high = s.charAt(suffixIndex) -'0';
		}else {
			high = isTight ? Math.min(limit,str.charAt(index)-'0'):limit;
			low = 0;
		}
		long total = 0;
		for(int i=low; i<=high; i++) {
			boolean newTight = isTight && (digit == str.charAt(index)-'0');
			total +=countValidNumber(str,index+1,digit,newTight,limit,s);

		}

		dp[index][isTight?1:0] =total;
		return total;
	}
	public static void main(String[] args) {
		long start = 1; long finish = 6000; int limit = 4; String s = "124";
		long ans = numberOfPowerfulInt(start, finish, limit, s);
		System.out.println(ans);
	}

}
