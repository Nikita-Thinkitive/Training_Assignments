
public class Test {
	public static void hello(MyInterface add)
	{
		System.out.println(add.performAction(12, 2));
	}

	
	public static void main(String[] args) {

		Outer o = new Outer();
		o.performAction(10, 12);

		Outer_Sub os = new Outer_Sub();
		os.performAction(22, 10);
     
		//ANNONYMOS INNER CLASSES
		MyInterface add =(a,b) ->a+b;
		MyInterface sub =(a,b) ->a-b;
		MyInterface multiply =(a,b) ->a*b;
		MyInterface div =(a,b) ->a/b;

		hello((a,b) ->a+b); //Lambda Expression for any concrete method but it should be static method
		
		/*
		
		  MyInterface sub = new MyInterface() {
		  
		  @Override public int performAction(int a, int b) {
		  
		  return a - b; } };
		  
		  MyInterface multiply = new MyInterface() {
		  
		  @Override public int performAction(int a, int b) {
		  
		  return a * b; } };
		  
		  MyInterface div = new MyInterface() {
		  
		  @Override public int performAction(int a, int b) {
		  
		  return a / b; } };
		 */
		
		
		System.out.println("\n****Annonymos Inner Class****");
		System.out.println("Addition: "+add.performAction(12, 8));
		System.out.println("Substraction: "+sub.performAction(20, 10));
		System.out.println("Multiplication: "+multiply.performAction(10, 20));
		System.out.println("Division: "+div.performAction(20, 5));

	}
}

/*OUTPUT
 * Addition: 22
Substraction:12
14

****Annonymos Inner Class****
Addition: 20
Substraction: 10
Multiplication: 200
Division: 4
*/

