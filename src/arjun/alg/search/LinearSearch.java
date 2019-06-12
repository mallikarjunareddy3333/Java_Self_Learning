package arjun.alg.search;

public class LinearSearch {

	public int linearSearch(int arr[], int x) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		LinearSearch obj = new LinearSearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;
		int result = obj.linearSearch(arr, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + result);
	}

}
