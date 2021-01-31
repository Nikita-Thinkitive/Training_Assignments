import java.util.Scanner;

public class Stringassignment {
	
	
	public String s = "hello world this is string program for you";
	

	public String words[] = s.split("\\s");
	public String cap = "";
	public String reverseWord = "";
	
	
	public void capString()
	{
	
	System.out.println("\n 1. Make First Letter of Every string capital");

	
	for (String w : words)
	{
		
		cap += w.substring(0, 1).toUpperCase() + w.substring(1) +" ";;
	}
	System.out.println(cap);
	
	}
	
	public void reverstring()
	{

	System.out.println("\n2.Reverse string");
	
	for (int i = s.length() - 1; i >= 0; i--) 
	{
		System.out.print(s.charAt(i));
	}
	System.out.println("");
	
	}
	
	public void reverseWords()
	{
	System.out.println("\n3. Reverse Every word in String: ");

	
	
	
	
	for (String w : words) {

		StringBuilder sb = new StringBuilder(w);
		sb.reverse();
		reverseWord += sb.toString() + " ";

	}
	System.out.println(reverseWord);
	
	
	}
	
	public void countWord()
	{

	
	System.out.println("\n4. Find Frequency of word");
	
	for(int i=0;i<words.length;i++) 
	{
		String sub = words[i];
		int count=0;
		for(int j=0;j<words.length;j++) 
		{
			if(words[j].toLowerCase().equals(sub)) 
			{
				
				count=count + 1;
			}
			else
				continue;
		}
		System.out.println(sub + " : " + count);
		
		
	
	
	}
	}
	
	public static void main(String[] args) {
		
			Stringassignment d=new Stringassignment();
			int op=0;
			Scanner sc=new Scanner(System.in);
			
			do
			{
				System.out.println("\n\n***STRING OPERATIONS***");
				System.out.println("\n1.Make First Letter of Every string capital:\t.\n2.Reverse string:\t.\n3.Reverse Every word in String:\t\n4.Find Frequency of word:\t");
				System.out.println("Enter operation:");
				op=sc.nextInt();
			switch(op)
			{
			case 1:
				d.capString();
				break;
				
			case 2:
				d.reverstring();
				break;
			case 3:
				d.reverseWords();
				break;
			case 4:
				d.countWord();
				break;
			default:
				System.out.println("ENTER COUNT");
				break;
			}
			}while(op>0);
		

	}
}
/*OUTPUT
 * 
***STRING OPERATIONS***

1.Make First Letter of Every string capital:	.
2.Reverse string:	.
3.Reverse Every word in String:	
4.Find Frequency of word:	
Enter operation:
1

 1. Make First Letter of Every string capital
Hello World This Is String Program For You 


***STRING OPERATIONS***

1.Make First Letter of Every string capital:	.
2.Reverse string:	.
3.Reverse Every word in String:	
4.Find Frequency of word:	
Enter operation:
2

2.Reverse string
uoy rof margorp gnirts si siht dlrow olleh


***STRING OPERATIONS***

1.Make First Letter of Every string capital:	.
2.Reverse string:	.
3.Reverse Every word in String:	
4.Find Frequency of word:	
Enter operation:
3

3. Reverse Every word in String: 
olleh dlrow siht si gnirts margorp rof uoy 


***STRING OPERATIONS***

1.Make First Letter of Every string capital:	.
2.Reverse string:	.
3.Reverse Every word in String:	
4.Find Frequency of word:	
Enter operation:
4

4. Find Frequency of word
hello : 1
world : 1
this : 1
is : 1
string : 1
program : 1
for : 1
you : 1


***STRING OPERATIONS***

1.Make First Letter of Every string capital:	.
2.Reverse string:	.
3.Reverse Every word in String:	
4.Find Frequency of word:	
Enter operation:

 */

