package sortPractices;

public class MergeSort {
	
	
	
	public static void merge(int a[], int low, int mid,  int high) {
		
		
		
	}
	
	
//	//divide
	public static void mergeSort(int a[], int low, int high) {
		if(low>=high) return;
		int mid =low+high/2;
		System.out.println(mid);
		mergeSort( a,  low, mid);
		mergeSort( a, mid+1,  high);	
		merge(a, low, mid, high);
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		int a[]= {3,1,2,4,1,6,5,2,4};
		int low=0;
		int high=a.length-1;
		System.out.println(low);
		System.out.println(high);
		mergeSort( a,  low,  high);
	

	}

}
