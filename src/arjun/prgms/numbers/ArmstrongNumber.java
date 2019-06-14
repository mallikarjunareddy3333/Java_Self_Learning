package arjun.prgms.numbers;

public class ArmstrongNumber {

	static int power(int x, int y) {

		while (y != 0) {
			return x * power(x, y - 1);
		}

		return 1;

	}

	static int order(int x) {
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}

	public static boolean isArmstrong(int n) {
		int num = n;
		int rem;
		int sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = (int) (sum + power(rem, order(n)));
			num = num / 10;
		}

		if (sum == n)
			return true;

		return false;
	}
	
	public static int NthArmstrangNumber(int x) {
		int count = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if ( isArmstrong(i)) {
				count++;
			}
			if (x == count) {
				return i;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		int num = 1634;
		System.out.println(isArmstrong(num));
		System.out.println(NthArmstrangNumber(12));
	}

}
