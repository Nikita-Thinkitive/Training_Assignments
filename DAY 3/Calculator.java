/**
 * Program : -Calculator program
 * @author Nikita
 *
 */
public class Calculator {
	
	/**
	 * This method is used to adds two integer numbers and returns answers.
	 * @param a first integers value
	 * @param b second integer value
	 * @return returns interger addition of a and b
	 */

	public Calculator()
	{
		System.out.println("Calculator Parent Class Constuctor");
	}
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

}
