package Algorithms;

/**
 * Push the max to the last by adj swapping
 */

public class BubbleSort {
	
    //O(n*n)
	private static void bubbleSortLogic(int arr[]) {
		int n = arr.length;
		for(int i=n-1; i>=1; i--) {
			for(int j=0; j<=i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
    //O(n)
	private static void bubbleSortOptimizedLogic(int arr[]) {
		int n = arr.length;
	
		for(int i=n-1; i>=1; i--) {
			int didSwap = 0;
			for(int j=0; j<=i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					didSwap = 1;
				}
			}
			System.out.println(didSwap);
			if(didSwap == 0) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		//int arr[] = {13,46,24,52,20,9};
	//	bubbleSortLogic(arr);
		int arr[] = {1,2,3,4};
		bubbleSortOptimizedLogic(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}

}
