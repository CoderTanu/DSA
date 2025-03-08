package MathPractices;

public class ArmstrongNumber {
	
	 public static boolean isArmstrong(int n) {
		 int sum = 0; int count = (int)Math.log10(n) + 1;
		 int temp = n;
		 while(n>0) {
			 int lastDigit = n %10;
			 sum = sum + (int) Math.pow(lastDigit, count);
			 
			 n = n/10;
		 }
		 
		 return (sum == temp);
	 }
	
	

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));

	}

}
