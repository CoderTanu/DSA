package sortPractices;

public class InsertionSort {

	public static void insertion_sort(int a[], int n) {
		
		for(int i=0; i<=n-1; i++) {
			int j=i;
			while(j>0 && a[j-1]>a[j]) {
				int temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
              j--;
			}
		}
		
		System.out.println("After insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
		
	}
	
	
	
	public static void main(String[] args) {
		        int a[] = {14,9,15,12,6,8,13};
                int n = a.length;
		        System.out.println("Before insertion sort:");
		        for (int i = 0; i < n; i++) {
		            System.out.print(a[i] + " ");
		        }
		        System.out.println();
		        insertion_sort(a, n);	

	}

}
