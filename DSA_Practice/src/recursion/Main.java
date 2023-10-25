package recursion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RecursionProblems print1 = new RecursionProblems();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of times you want to print:");
		int n = sc.nextInt();
	//	print1.printName(1,n);
		//print1.printNumber(1, n);
	//	print1.printNumberReverse(n, 1);
	//	print1.printNumberByBackTrack(n, n);
		//print1.printNumberByBackTrack1(n, n);
		
		FunctionalRecursion funRec = new FunctionalRecursion();
		int v=funRec.fact(n);
		System.out.println(v);
		
	}

}
