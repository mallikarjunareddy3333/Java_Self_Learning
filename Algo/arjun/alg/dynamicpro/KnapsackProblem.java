package arjun.alg.dynamicpro;

public class KnapsackProblem {

	static int max(int n1, int n2) {
		if (n1 > n2)
			return n1;
		else
			return n2;
	}

	static int knapsack(int wgt[], int val[], int cap, int n) {

		if (cap == 0 || n == 0) {
			return 0;
		}

		if (wgt[n] > cap) {
			return knapsack(wgt, val, cap, n - 1);
		} else {
			return max(val[n] + knapsack(wgt, val, cap - wgt[n], n - 1), knapsack(wgt, val, cap, n - 1));
		}
	}

	public static void main(String[] args) {
		int val[] = new int[] { 4, 4, 1, 2, 5 };
		int wt[] = new int[] { 5, 3, 5, 3, 2 };
		int cap = 10;
		int n = val.length;
		System.out.println(knapsack(wt, val, cap, n - 1));

	}

}
