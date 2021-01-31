
public class Exception1 {
	public static void main(String[] args) throws Exception {

		String s = null;
		int a = 10;
		int arr[] = { 10, 22, 33 };
		try {
			calc_bala();
			calc_age();
			hello();

			a = a / 0;
			System.out.println(s.length());
			System.out.println(arr[5]);

		}

		catch (ClassNotFoundException c) {
			System.out.println("Class Not found exception");
		}

		catch (NullPointerException nul) {

		} catch (ArithmeticException ae) {
			a = 10 / 2;
			System.out.println(a);
			System.out.println("aaa");
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(arr[6]);
		}

		catch (InsufficientFund e) {
			System.out.println("Transaction fail");
		}

		catch (InvalidAgeException e) {
			System.out.println("You are not eligible for admission process");
		} catch (Exception e) {
			System.out.println("Exception");
		}

	}

	public static void hello() throws ClassNotFoundException {
		Class.forName(" ");
	}

	public static void calc_age() throws InvalidAgeException {
		int age = 2;
		if (age >= 18 && age <= 30) {
			System.out.println("Welcome Your Admission is Sucessfull..");
		} else {
			InvalidAgeException ie = new InvalidAgeException("You are Not eligible for process");
			throw ie;
		}
	}

	public static void calc_bala() throws InsufficientFund {
		int bal = 50000;
		if (bal <= 5000) {
			InsufficientFund ie = new InsufficientFund();
			throw ie;
		} else {
			System.out.println("Transaction is sucessfull");
		}
	}

}
