import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		List l=new ArrayList();
		
		System.out.println("\n\nArrayList\n");
		
		Address add11=new Address("Pune",41104);
		Address add1=new Address("Nagpur",41162);
		Address add2=new Address("Mumbai",41190);
		
		
		Employee e=new Employee(1,"ABc",2000,add11);
		Employee e1=new Employee(1,"ABc",2000,add1);
		
		Employee e2=new Employee(2,"PQR",3000,add2);
		Employee e3=new Employee(3,"XYZ",200," Banglore",41108);
		
		Employee e4=new Employee(4,"Abc",5000,"Nagpur",411098);
		Employee e5=new Employee(5,"BCD",6000,"Nashik",44123);
		
		
		
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
	//	Collections.sort(l);
		
		System.out.println(l);
		System.out.println("\n\nSETS\n\n");
		
		Set s=new HashSet();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		
		System.out.println(s);
		
		List <Employee> empl=new LinkedList<Employee>();
		
		System.out.println("List for comparing object");
		empl.add(e);
		empl.add(e1);
		empl.add(e2);
		empl.add(e3);
		empl.add(e4);
		empl.add(e5);
		
		
		Collections.sort(empl);
		System.out.println(empl);
		

		Set <Employee> tree=new TreeSet<Employee>();
		System.out.println("Treeset for object Comarable ");
		tree.add(e);
		tree.add(e1);
		tree.add(e2);
		tree.add(e3);
		tree.add(e4);
		tree.add(e5);
		
		//Collections.sort(tree);
		System.out.println(tree);
		
		
		Set <Employee> hash=new HashSet<Employee>();
		System.out.println("Hashset for object Comarable ");
		hash.add(e);
		hash.add(e1);
		hash.add(e2);
		hash.add(e3);
		hash.add(e4);
		hash.add(e5);
		System.out.println(e3.compareTo(e2));
		//Collections.sort(tree);
		System.out.println(tree);
		
		//***************USING COMPARATOR INTERFACE*****************
		
		
		EmpSalaryComparator empcomp=new EmpSalaryComparator();
		
		
		EmpNameComparator empname=new EmpNameComparator();
		
		
		
	Collections.sort(empl);
	System.out.println(empl);
		
		
	
	}
	

}
