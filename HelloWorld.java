
public class HelloWorld {
	public static void main(String[] args) {

		int score = 55;

		System.out.println("***Score Card***");
		System.out.println("\n\n1. Using IF ELSE");
		if (score >= 70) {
			System.out.println("Fist Class with Distinction");
		} else if (score >= 60 && score <= 69) {
			System.out.println("First Class");
		} else if (score >= 50 && score <= 59) {
			System.out.println("Second Class");
		} else if (score >= 40 && score <= 49) {
			System.out.println("Pass Class");
		} else {
			System.out.println("Fail");
		}
		// Switch Case
		System.out.println("\n\n1. Using Switch");
		switch (score) {
		case 70:
		case 71:
		case 72:
		case 73:
		case 74:
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
			System.out.println("First Class With Distinction");
			break;
		case 60:
		case 61:
		case 62:
		case 63:
		case 64:
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
			System.out.println("Fisrt Class");
			break;
		case 50:
		case 51:
		case 52:
		case 53:
		case 54:
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
			System.out.println("PSecond Class");
			break;
		case 40:
		case 41:
		case 42:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		case 48:
		case 49:
			System.out.println("Pass class");
			break;

		default:
			System.out.println("fails");
			break;

		}

		// Factorial program using for loop
		System.out.println("\n\n ***Factorial Of Number***");
		int a = 1, n = 7;
		for (int i = 1; i <= n; i++) {
			a = a * i;

		}
		System.out.println("Fact of " + n + " " + a);

		// Prime number in array
		System.out.println("\n\n***Prime Number***");
		int arr[] = { 7, 31, 46 };
		int arr2[] = { 7, 31, 46 };
		boolean flag = false;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					count++;
					break;
				}

			}
			if (count == 0)
				System.out.println(arr[i] + "  Prime number");
			else
				System.out.println(arr[i]+ " is Not Prime Numbers");

		}

		
		// Program for checking two arrays
		System.out.println("\n\n***Array Program***");
		if (arr.length == arr2.length) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr[i] == arr[j])
						flag = true;
				}
			}
		}
		if (flag == true) {
			System.out.println("Array are Same");
		} else {
			System.out.println("Array are not same");
		}

	}

}
