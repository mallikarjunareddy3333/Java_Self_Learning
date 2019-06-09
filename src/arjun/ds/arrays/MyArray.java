package arjun.ds.arrays;

public class MyArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5 };
		System.out.println(nums[4]);

		int[] nums1 = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(nums1[4]);

		int marks[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(marks[i][j] + " ");
			}
		}
	}

}
