import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DemoProps {

	public static void main(String[] args) throws IOException {
		
		//PROPERTY class will load the data from file
		Properties prop=new Properties();
		FileReader fr=new FileReader("Demo.txt");
		prop.load(fr);
		System.out.println("***FILE USING PROPERTIES***");
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("City"));
		System.out.println(prop.getProperty("Mobile"));
		System.out.println(prop.getProperty("Company"));
		System.out.println(prop.getProperty("Designation"));
	}
}
/* OUTPUT

***FILE USING PROPERTIES***
Nikita
Pune
998877
Thinkitive
Trainee Software Engineer

*/