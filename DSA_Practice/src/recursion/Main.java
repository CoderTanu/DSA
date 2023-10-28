package recursion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		RecursionProblems print1 = new RecursionProblems();
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the no of times you want to print:");
//		int n = sc.nextInt();
	//	print1.printName(1,n);
		//print1.printNumber(1, n);
	//	print1.printNumberReverse(n, 1);
	//	print1.printNumberByBackTrack(n, n);
		//print1.printNumberByBackTrack1(n, n);
		
		FunctionalRecursion funRec = new FunctionalRecursion();
//		int v=funRec.fact(n);
//		System.out.println(v);



//		System.out.println("enter Numbers:");
//	    int n=sc.nextInt();
//     	int a[] = new int[n];
//		for(int i=0; i<n; i++) {
//		System.out.println(a[i]);
//	}
		
//     	int n=5;
//	    int a[] = { 1,2,3,4,5};
//		 
//		funRec.reverseArray(0, a,n-1);
//		funRec.printArray(a,n);
		
//		String paliValue= sc.next();
//		boolean value= funRec.palindrom(paliValue, 0);
//		System.out.print(value);
		
		//4
		int n= sc.nextInt();
		int value=funRec.printFibo(n);
		System.out.print(value);
		
		
	}

}
