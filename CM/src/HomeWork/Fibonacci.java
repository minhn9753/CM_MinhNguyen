package HomeWork;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 15;
		System.out.println("Fibonacci of " + num + " = " + fibonacci(num));

	}

	public static int fibonacci(int num) {
		int a = 0;
		int b = 1;
		int c;

		if (num == 0)
			return a;
		if (num == 1)
			return b;
		for (int i = 2; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
}
//TIME COMPLEXITY O(n)?
