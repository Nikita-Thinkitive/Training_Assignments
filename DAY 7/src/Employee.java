import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private int empid;
	private String name;
	transient private int salary; //Making the salary secure by not sending original data
	 private Address address;
	
	public Employee() {
		super();
	}
	
	

	public Employee(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	

	public Employee(int empid, String name, int salary, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}



	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", " + address + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
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
		return true;
	}
	
	
	public void doserialize() 
	{
		try {
			FileOutputStream fout = new FileOutputStream("file.serial");
			ObjectOutputStream out=new ObjectOutputStream(fout); //connect two stream together
			
			out.writeObject(this);
			
			out.close();
			fout.close();
			
		} catch (FileNotFoundException e ) {
			
			e.printStackTrace();
		}
		catch (IOException e2) {
			
		}
			
	}

	
	
	public Employee doDeserialize()
	{
		Employee e=null;
		
		
		try {
		
			FileInputStream	fin = new FileInputStream("file.serial");
			
			ObjectInputStream in=new ObjectInputStream(fin);
			
			e=(Employee) in.readObject();
			//System.out.println("****"+e);
			
			in.close();
			fin.close();
			
		
		
		} 
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (IOException e2) {
			// TODO: handle exception
		}catch (ClassNotFoundException e2) {
			// TODO: handle exception
		}
		
		return e;
	}
}
