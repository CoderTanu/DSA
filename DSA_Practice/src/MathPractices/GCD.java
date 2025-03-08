package MathPractices;

public class GCD {
	
	public static int gcd(int n1, int n2) {
		
		int largest = 1;
		for(int i =2; i<=Math.min(n1, n2); i++) {
			if(n1%i == 0 && n2%i == 0) {
				largest = i;
			}
		}
		return largest;
		
	}
	
	//TC=O(log(min(n1,n2))
	//SC=O(1)
    public static int gcdOptimal(int n1, int n2) {
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
		int ans = gcd(20,40);
		System.out.println(ans);
		int ansOp= gcdOptimal(35,10);
		System.out.println(ansOp);
	}

}
