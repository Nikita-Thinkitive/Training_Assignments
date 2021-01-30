
public class IceCream extends DessertItem {

	double cost;
	
	public IceCream() {
		
	}
	IceCream(String name,double cost )
	{
		super(name);
		this.cost=cost;
	}
	
	@Override
	public double Cost_Item() {
		
		System.out.println("Cost Of Ice-Cream is: Rs." +cost);
		return this.cost;
	}

}
