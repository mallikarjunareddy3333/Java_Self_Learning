package arjun.alg.sorting;

public class BubbleSort {

	private void sort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			boolean swapped = false; 
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					swapped = true;
				}
			}
			
			// IF no two elements were  
            // swapped by inner loop, then break
			if ( swapped == false )
				break;

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
		
		System.out.println("Bubble Sort:");
		System.out.println("---------------");
		
		BubbleSort ob = new BubbleSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		
		System.out.println("Before Sort:");
		ob.printArray(arr);
		
		ob.sort(arr);
		
		System.out.println("\nAfter Sort:");
		ob.printArray(arr);
	}

}
