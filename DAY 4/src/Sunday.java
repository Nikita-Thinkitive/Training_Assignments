
public class Sunday extends IceCream{
	
	int topping;
	double icost;
	
	public Sunday() 
	{
		super();
		
	}
	
	public Sunday(int topping,double icost)
	{
		super();
		this.topping=20;
	}

	public double Cost_Sunday()
	{
		
		
		cost=this.cost+this.topping;
		
		System.out.println("Final cost: ");
		return cost;
	}
}
