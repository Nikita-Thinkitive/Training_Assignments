import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
	
	public static void main(String[] args) {
	
		String str="Hii how are you ..are you fine";
		String arr[]=str.split(" ");
	
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		
		
		for(String x:arr)
		{
			map.merge(x, 1, DemoMap::add);
			
		}
		System.out.println("COLLECTION MAP:\n"+map);
		
	}
	public static Integer add(Integer a, Integer b)
	{
		return a+b;
	}
}
/*OUTPUT
 * 
 
COLLECTION MAP:
{how=1, fine=1, are=1, Hii=1, ..are=1, you=2}

*/