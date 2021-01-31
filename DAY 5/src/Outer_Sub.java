
public class Outer_Sub implements MyInterface {

	@Override
	public int performAction(int a, int b) {
		int ans=0;
		ans=a-b;
		System.out.println("Substraction:"+ans);
		return ans;
	}
	
	

}
