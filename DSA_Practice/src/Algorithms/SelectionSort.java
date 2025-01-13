package Algorithms;

public class SelectionSort {
	
	private static void selectionSortLogic(int arr[]) {
		int n = arr.length;
		for(int i=0; i<=n-2; i++) {
			int min = i;
			for(int j=i; j<=n-1; j++) {
				if(arr[j]< arr[min]) {
					min = j;
				}
				
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {13,46,24,52,20,9};
		selectionSortLogic(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}

}
