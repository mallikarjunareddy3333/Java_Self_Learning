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
	
	static int fib_memoize(int n, int[] mem) {
		if ( mem[n] != 0 ) {
			return mem[n];
		}
		
		int result;
		if (n == 1 || n == 2) {
			result = 1;
		} else {
			result = fib_memoize(n-1, mem) + fib_memoize(n-2, mem);
		}		
		mem[n] = result;
		return result;
	}
	
	public static int fib_bottom_up(int n) {
		if (n == 1 && n == 2)
			return 1;
		int[] bottom_up = new int[n+1];
		bottom_up[1] = 1;
		bottom_up[2] = 1;
		
		for (int i = 3; i <= n; i++)
			bottom_up[i] = bottom_up[i-1] + bottom_up[i-2];
		
		return bottom_up[n];		
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Factorial of " + n + " is " + fact(n));
		
		int[] memo = new int[201];
		System.out.println("fib_memoize: Factorial of " + 200 + " is " + fib_memoize(200, memo));
		
		System.out.println("fib_bottom_up: fibonacci number " + 200 + " is " + fib_bottom_up(200));
		
		System.out.println("fibonacci number " + 200 + " is " + fibonacci(100));
	}

}
