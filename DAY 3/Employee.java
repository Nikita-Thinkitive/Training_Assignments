//ENCAPSULATION PROGRAMS 

public class Employee {
	private int empid;
	private String ename;
	private int salary;

	// static int emp = 0; //static counter
	
	static Employee emp = null;

	private Employee() { // Private constructor

		empid = 1;
		ename = "Virat";
		salary = 3000;
	}
	
	/**
	 * This method used to create object of private Constructor
	 * @return
	 * it returns the object
	 */

	static public Employee getInstance() {// Method for calling private constructor
		/*
		 * if(emp==null) { emp=new Employee(); } return emp;
		 */
		/* also we can use following code to create object */

		/*
		 * Employee e = new Employee(); emp++;
		 * 
		 * 
		 * // CODE FOR CREATING ONLY ONE OBJECT OF CLASS if(emp >=2) { e=null; }
		 * 
		 * 
		 * System.out.println("Object of Class Employee: " + emp);
		 */

		// For singlton Object simple code
		if (emp == null) {
			emp = new Employee();
			return emp;
		} else {
			System.out.println("Object is already created");
			return emp;
		}

	}

	Employee(int empid, String ename, int salary) {
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

}
