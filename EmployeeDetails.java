
public class EmployeeDetails {
	public static void main(String[] args) {

		EmployeeData e = new EmployeeData(EmployeeData.empid, "Virat", 25000, 400);

		e.printData();
		System.out.println("\n\n");
		e.printData();
		System.out.println("\n\n");
		e.printData();
		System.out.println("\n\n");
		e.printData();

		EmployeeData e1 = new EmployeeData(EmployeeData.empid, "Virat", 15000, 600);

		e1.printData();
		System.out.println("\n\n");
		e1.printData();
		System.out.println("\n\n");

	}
}
