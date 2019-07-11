package arjun.prgms.numbers;

public class GCD {

	static int gcd(int a, int b) {
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

	static int gcd2(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if (a == b)
			return a;
		if (a > b)
			return gcd2(a - b, b);

		return gcd2(a, b - a);
	}

	public static void main(String[] args) {
		int a = 56, b = 98;
		System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
		System.out.println("GCD of " + a + " and " + b + " is " + gcd2(a, b));
	}

}
