package recursion;

public class FindSumOfNaturalNumber {

	public static void main(String[] args) {
		int num = 2;
		int res = findSumN(num);
		System.out.println(res);
		

	}

	private static int findSumN(int num) {
		
		if(num <=0) return 0;
		
		return num + findSumN(num-1);
	}

}
