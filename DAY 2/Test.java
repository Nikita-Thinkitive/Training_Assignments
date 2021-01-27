
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee(3, "ABC", 2000);
		e.getData();
		e.printData();

		System.out.println("\n\n*********************************************");
		Calculator c = new Calculator();
		int arr[] = { 1, 2, 3, 5, 8 };
		int ans = c.add(arr);
		System.out.println("\n\nSUM OF CALCULATOR: " + ans);
		// System.out.println("byte : "+c.add(1,1));

		System.out.println(" Addition: " + c.add(1, 1));
		System.out.println(" Subtraiction: " + c.sub(10, 2));
		System.out.println(" Subtraiction: " + c.sub(10, 2, 20, 12, 100));
		System.out.println(" Multiplication: " + c.multiply(10, 2));
		System.out.println(" Division: " + c.div(10, 2));
	}

}

/*OUTPUT
***Employee Detailes***
ID : 1
NAME : Virat
SALARY : 100


*********************************************


SUM OF CALCULATOR: 19
int
Addition: 2
Subtraiction: 8
Subtraiction: 116
Multiplication: 20
Division: 5
*/