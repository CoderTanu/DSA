package recursion;

import java.util.Collections;

public class FunctionalRecursion {

	//print arry
	public void printArray(int a[] , int n) {
	 System.out.print("Reversed array is:- \n");
	 n=a.length;
     for (int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
     }
	}
	
	
	
	//1 factorial of number
	public int fact(int n) {
		if(n==0) {
			return 1;
		}
		
		return n * fact(n-1);
	}
	
	//2. reverse an array using recursion
	
	 public void reverseArray(int i, int a[], int n) {
		 
		 if(i> n/2) {
			 return;
		 }
		if(i<n) {
			int temp =a[i];
			a[i]=a[n];
			a[n]=temp;
			reverseArray(i+1,a,n-1);
		}
		 
		 
	 }
	 
	 //3.check the number is palindrom or not
	 
	 public Boolean palindrom(String s, int i) {
		
		 if(i>=s.length()/2) return true;
		if(s.charAt(i) != s.charAt((s.length())-i-1)) {
			return false;
		}
		
		return palindrom(s, i+1);
		 
	 }
	 
	 //4. print  random fibonaci  number
	 public int printFibo(int n) {
		 if(n<=1) {
			 return n;
		 }
		 int last=printFibo(n-1);
		 int sLast= printFibo(n-2);
		 return last+sLast;
	 }
	 
	
	
	
}
