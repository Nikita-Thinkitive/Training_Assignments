
public class Employee {
	// instance data
	int empid;
	String ename;
	int salary;

	public Employee() {

	}

	public Employee(int empid, String ename) {
		this.empid = empid;
		this.ename = ename;
	}

	public Employee(int empid, String ename, int salary) {
		this(empid, ename);

		this.salary = salary;

	}

	public void getData() {
		empid = 1;
		ename = "Virat";
		salary = 100;
	}

	public void printData() {
		System.out.println("***Employee Detailes***");
		System.out.println(" ID : " + empid);
		System.out.println(" NAME : " + ename);
		System.out.println(" SALARY : " + salary);
	}
}
