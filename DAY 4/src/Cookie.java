
public class Cookie extends DessertItem {
	
	double cokie_prize;
	int cokie_no;
	
	public Cookie() {
		
		
	}
	public Cookie(String name,int cokie_no)
	{
		super(name);
		this.cokie_no=cokie_no;
		this.cokie_prize=120;
	}

	@Override
	public double Cost_Item() {
		double ans;
		
		cokie_prize=(this.cokie_prize*this.cokie_no)/12;
		System.out.println("Price of Cookies: "+cokie_prize);
		
		return cokie_prize;
	}
	

}
