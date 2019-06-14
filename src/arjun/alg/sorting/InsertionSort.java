package arjun.alg.sorting;

public class InsertionSort {

	private void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
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

		System.out.println("Insertion Sort:");
		System.out.println("---------------");

		InsertionSort ob = new InsertionSort();
		int arr[] = { 64, 25, 12, 22, 11 };

		System.out.println("Before Sort:");
		ob.printArray(arr);

		ob.sort(arr);

		System.out.println("\nAfter Sort:");
		ob.printArray(arr);
	}

}
