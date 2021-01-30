
public class AdvanceCalculator extends Calculator{
	
	 public AdvanceCalculator()
	 {
		 super();
		 System.out.println("Constructor using super above line\n");
		 System.out.println("\nAdvance Calculator Child Class Constuctor");
	}
		
	
	public int fact(int n)
	{
		int a=1;
		for(int i=1;i<=n;i++)
		{
			a=a*i;
		}
		return a;
	}
	@Override
	public int divide(int a, int b) {
		System.out.println("Division ans as Quotient:\n "+ super.divide(10, 2));
		System.out.println("Remainder of Disvision: ");
		return a % b;
	}
	
}
