package sortPractices;

import java.util.Scanner;

public class SelectionSort {
	
	
	public static void selection_sort(int a[], int n) {
		
		for(int i=0; i<=n-2; i++) {
			int min=i;
			for(int j=i; j<=n-1;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		
		System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
		
		
	}
	
	
	
	

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//	 // int n=sc.nextInt();
//		int n=5;
//	//  int a[]= new int[n];
//	  int a[]= {13,46,24,52,20,9};
////	  for(int i=0; i< a.length; i++) {
////		  System.out.println(a[i]);
////	  }
//	  selection_sort(a, n);
//	  for(int i=0; i< a.length; i++) {
//		  System.out.println(a[i] + " ");
//	  }
//
		
		 int a[] = {13, 46, 24, 52, 20, 9};
	        int n = a.length;
	        System.out.println("Before selection sort:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	        selection_sort(a, n);	
		
		
		
		
		
		
	}

}
