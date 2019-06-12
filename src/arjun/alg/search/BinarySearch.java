package arjun.alg.search;

public class BinarySearch {

	public int binarySearch(int arr[], int l, int r, int x) {
		
		if (r >= l) {
			
			// calculate mid
			int mid = l + r - 1 / 2;
			
			// if element at mid is equal to x return mid
			if (arr[mid] == x) {
				return mid;
			}
			
			// if x is less than arr[mid] -> do search again between first half
			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			}
			
			//do serch again between first half
			return binarySearch(arr, mid + 1, r, x);
		}
		
		return -1;
	}
	
	public int binarySearch (int arr[], int x) {
		int l = 0, r = arr.length-1;
		
		while (l <= r) {
			int mid = l + r -1 /2;
			
			if (arr[mid] == x) {
				return mid;
			}
			
			if (x <= arr[mid]) {
				r = mid-1;
			}
			
			if (x >= arr[mid]) {
				l = mid + 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 100;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
		
		x = 10;
		result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
