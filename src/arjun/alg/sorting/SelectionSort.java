package arjun.alg.sorting;

public class SelectionSort {

	private void sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int min_index = i;

			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}

			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;

		}

	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]) {
		
		System.out.println("Selection Sort:");
		System.out.println("---------------");
		
		SelectionSort ob = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		
		System.out.println("Before Sort:");
		ob.printArray(arr);
		
		ob.sort(arr);
		
		System.out.println("\nAfter Sort:");
		ob.printArray(arr);
	}

}
