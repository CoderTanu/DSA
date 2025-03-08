package Algorithms;

public class InsertionSort {
	
//TC:O(n*n) : worst,average for best case O(N)
	//sc o(1)
		private static void insertionSortLogic(int arr[]) {
			int n = arr.length;	
			for(int i=0; i<=n-1; i++) {
				int j = i;
				while(j>0 && arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] =  arr[j];
					arr[j] = temp;
					j--;	
					System.out.println("run");
				}
			}
		}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		insertionSortLogic(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
