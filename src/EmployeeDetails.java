
public class EmployeeDetails {
	public static void main(String[] args) {

		EmployeeData e = new EmployeeData(EmployeeData.empid, "Virat", 25000, 400);

		e.printData();
		System.out.println("\n\n");
		
		e.printData();	//static integer will increment
		System.out.println("\n\n");
		

		/*	EmployeeData e1 = new EmployeeData(EmployeeData.empid, "Virat", 15000, 600);

		e1.printData();
		System.out.println("\n\n");
		e1.printData();
		System.out.println("\n\n");
		*/

	}
}

/*OUTPUT
***Employee Details***
Employee Id: 1
Employee Name: Virat
Employee Basic Salary : 25000.0
Employee PT: 200
******************************************
Employee HRA: 12500.0
Employee PF: 3000.0
Employee Medical Insurance: 400.0
*********************************************
Employee Gross Salary: 37900.0
Employee Net Salary: 37700.0



***Employee Details***
Employee Id: 2
Employee Name: Virat
Employee Basic Salary : 25000.0
Employee PT: 200
******************************************
Employee HRA: 12500.0
Employee PF: 3000.0
Employee Medical Insurance: 400.0
*********************************************
Employee Gross Salary: 37900.0
Employee Net Salary: 37700.0



*/