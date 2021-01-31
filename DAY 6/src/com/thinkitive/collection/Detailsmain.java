import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Detailsmain {
	public static void main(String[] args) {
		
		Employee e1=new Employee(2,"PQR",3000);
		Employee e2=new Employee(3,"XYZ",200);
		
		Employee e3=new Employee(4,"Abc",5000);
		Employee e4=new Employee(5,"BCD",6000);
		
		List<Employee> list=new LinkedList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Iterator<Employee> itr=list.iterator();
		System.out.println(itr.next());
		
			
		}
		
		
	}


