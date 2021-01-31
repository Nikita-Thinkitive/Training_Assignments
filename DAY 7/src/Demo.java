
public class Demo {
	public static void main(String[] args) {
		Address addr=new Address("Pune");
		Employee e=new Employee(1,"ABC",1000,addr);
		
		Employee temp=new Employee(2, "Virat", 2000);
		
		temp.doserialize();
		temp=temp.doDeserialize();
		System.out.println(temp);
		
		
		
		e.doserialize();
		e=e.doDeserialize();
		System.out.println(e);

	}
	
}
