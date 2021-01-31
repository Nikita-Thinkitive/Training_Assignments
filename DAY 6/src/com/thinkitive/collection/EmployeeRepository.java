import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	List<Employee> al = new ArrayList<Employee>();
	int empid;
	String ename;
	int salary;

	public EmployeeRepository() {
		empid = 1;
		ename = "";
		salary = 100;
	}

	public void insert(Employee data) {
		al.add(data);
	}

	public void remove_Emp(Employee e) {
		// Employee data= (e) al.remove(e);
		al.remove(e);
	}

	public List<Employee> getAllEmp() {
		return al;
	}

	/*
	 * public void getone(int data) { for(int i=0;i<al.size()-1;i++) {
	 * System.out.println(al.indexOf(al)); } }
	 */

	public void updateEmp(Employee old, Employee newempl) {
		al.set(al.indexOf(old), newempl);
	}

	public Employee getEmp(int empid) {
		Employee e = null;
		for (Employee x : al) {
			if (x.getEmpid() == empid)
				e = x;
		}
		return e;
	}

	public void printdata(Employee d) {
		System.out.println(al);
	}

}