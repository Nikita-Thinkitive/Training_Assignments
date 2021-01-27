
public class Calculator {
	/*
	 * public int add(int a, int b) { System.out.println("int"); return a + b; }
	 */
	public int add(int... arr) // VARARGS 1. always in last with many param,2. we only have one varargs

	{
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a = arr[i] + a;
		}

		return a;
	}

	public int add(int a, int b) {
		System.out.println("int");
		return (a + b);
	}

	public int add(byte a, byte b) {
		System.out.println("byte");
		return (a + b);
	}

	public int add(short a, short b) {
		System.out.println("short");
		return a + b;
	}

	public long add(long a, long b) {
		System.out.println("long");
		return a + b;
	}

	public float add(int a, float b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int sub(int... arr) // For substraction in calculator for many numbers
	{
		int a = 0;
		for (int x : arr) {
			a = x - a;
		}
		return a;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}
