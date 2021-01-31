
public class Outer implements MyInterface {

	@Override
	public int performAction(int a, int b) {
		int ans=0;
		ans =a+b;
		System.out.println("Addition: "+ans);
		
		return ans;
	}
	 

	

}
