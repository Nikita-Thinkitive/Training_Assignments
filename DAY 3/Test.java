
public class Test {
	

	

	public static void main(String[] args) {

		System.out.println("\n\n*******CALCULATOR CLASS*******");
		
		
		Calculator c = new AdvanceCalculator();
		//method signature to invoke is decided by type of object
		
		Calculator c1=new Calculator();
		

		AdvanceCalculator ac = new AdvanceCalculator(); 
		int ans = ac.add(2, 4);
		System.out.println(ans);
		
		
	
		System.out.println(c.divide(10,5));
		System.out.println(c1.divide(10,5));
		
		
	}
}

/*OUTPUT

*******CALCULATOR CLASS*******
Calculator Parent Class Constuctor
Constructor using super above line


Advance Calculator Child Class Constuctor
Calculator Parent Class Constuctor
Calculator Parent Class Constuctor
Constructor using super above line


Advance Calculator Child Class Constuctor
6
Division ans as Quotient:
 5
Remainder of Disvision: 
0
2
*/
