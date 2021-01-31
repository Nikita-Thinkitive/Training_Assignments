import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
	private int empid;
	private String ename;
	private int salary;
	private Address city;
	private Address pin;

	public Employee() {

	}

	public Employee(int empid, String ename, int salary, String city, double pin) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee(int empid, String ename, int salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee(int empid, String ename, int salary, Address city) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.city = city;
	}

	public Address getCity() {
		return city;
	}

	public void setCity(Address city) {
		this.city = city;
	}

	public Address getPin() {
		return pin;
	}

	public void setPin(Address pin) {
		this.pin = pin;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		List<Employee> e = new ArrayList<Employee>();

		System.out.println(e);

	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", city=" + city + ", pin=" + pin
				+ "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary == o.salary)
			return 1;
		else if (this.salary < o.salary)
			return 11;
		else
			return 100;
	}

}
