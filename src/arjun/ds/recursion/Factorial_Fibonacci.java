package arjun.ds.recursion;

public class Factorial_Fibonacci {

	public static int fact(int n) {
		if (n >= 0) {
			if (n == 0 || n == 1) {
				return 1;
			} else {
				return n * fact(n - 1);
			}
		} else {
			System.out.println("given number is not a positive number.");
			return 0;
		}
	}
	
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
		
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Factorial of " + n + " is " + fact(n));
		n= 9;
		System.out.println("fibonacci number " + n + " is " + fibonacci(n));
	}

}
