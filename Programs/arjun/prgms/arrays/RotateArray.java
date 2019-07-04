package arjun.prgms.arrays;

public class RotateArray {

	private void leftRotate(int[] arr, int d, int n) {
		for (int i = 0; i < d; i++) {
			leftRotateOne(arr, n);
		}
	}

	private void leftRotateOne(int[] arr, int n) {

		int temp = arr[0];
		int i;
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[i] = temp;
	}

	/* utility function to print an array */
	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Before Rotate: ");
		rotate.printArray(arr, arr.length);

		rotate.leftRotate(arr, 2, 7);

		System.out.println("\nAfter Rotate: ");
		rotate.printArray(arr, 7);
	}

}
