package arjun.alg.dynamicpro;

public class EnergyOfFruitesOfQuantityS {

	private static int fruitBox(int W, int[] quantity, int[] costs, int n) {
		
		if (W == 0 || n == 0) {
			return 0;
		}
		
		if (quantity[n-1] * costs[n-1] > W) {
			return fruitBox(W, quantity, costs, n-1);
		} else {
			return quantity[n-1] * costs[n-1] +  fruitBox(W, quantity, costs, n-1);
		}
		
	}

	public static void main(String[] args) {

		int quantity[] = { 1, 2, 2 };
		int costs[] = { 20, 5, 5 };

		int W = 10;
		int n = 3;
		
		System.out.println("Energy: "+ fruitBox(W, quantity, costs, n));
		
	}

}
