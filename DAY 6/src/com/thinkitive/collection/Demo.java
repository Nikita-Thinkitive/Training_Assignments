import java.util.*;

public class Demo {
	public static void main(String[] args) {

		System.out.println("COLLECTIONS IN JAVA");
		
		System.out.println("VECTOR: ");
		List l = new Vector();

		l.add(11);
		l.add("Helo");
		l.add("bye");
		l.add(1.90);

		System.out.println(l);
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		System.out.println("ARRAYLIST: ");
		List l1 = new ArrayList();

		l1.add(11);
		l1.add("Helo");
		l1.add("bye");
		l1.add(1.90);

		System.out.println(l1);
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("LINKEDLIST: ");

		List l2 = new LinkedList();

		l2.add(11);
		l2.add("Helo");
		l2.add("bye");
		l2.add(1.90);

		System.out.println(l2);
		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2.get(i));
		}
		
		
		
		
	}

}
/*OUTPUT

COLLECTIONS IN JAVA
VECTOR: 
[11, Helo, bye, 1.9]
11
Helo
bye
1.9
ARRAYLIST: 
[11, Helo, bye, 1.9]
11
Helo
bye
1.9
LINKEDLIST: 
[11, Helo, bye, 1.9]
11
Helo
bye
1.9

*/