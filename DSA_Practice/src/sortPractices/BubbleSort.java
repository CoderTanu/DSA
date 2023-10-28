package sortPractices;

public class BubbleSort {
	
	public static void bubble_sort(int a[], int n) {
		
		for(int i=n-1; i>=1; i--) {
			int didSwap=0;
			for(int j=0; j<= i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					didSwap=1;
				}
			}
			
			if(didSwap==0) {
				break;
			}
			System.out.println(didSwap);
			
			
		}
		
		System.out.println("After bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
	
		
		 int a[] = {13, 46, 24, 52, 20, 9};
		//int a[] = {1,2,3,5,7,8};

	        int n = a.length;
	        System.out.println("Before bubble sort:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	        bubble_sort(a, n);	
		
		
		

	}

}
