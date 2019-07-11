package arjun.prgms.arrays;

public class CountSubArrays {

	private static int countSubarray(int[] array, int size, int k) {

		int count = 0;
		for (int i = 0; i < size; i++) {
			int sum = 0;
			for (int j = i; j < size; j++) {
				if (sum + array[j] < k) {
					count++;
					sum = sum + array[j];
				} else {
					break;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int array[] = { 1, 11, 2, 3, 15 };
		int k = 10;
		int size = array.length;
		int count = countSubarray(array, size, k);
		System.out.println(count);
	}

}
