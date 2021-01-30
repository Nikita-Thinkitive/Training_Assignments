
public class Candy extends DessertItem{
	String candy_name ;
	
	double weight,price;
	
	public Candy() {
		
	}
	public Candy(String name,  double price)
	{
		super(name);
		this.candy_name=name;
		
		this.price=price;
		
	}

	@Override
	public double Cost_Item() {
		double can_prize;
		can_prize=(this.weight*this.price)/1000;
		
		System.out.println(weight);
		System.out.println("price of Candy " +candy_name+ " is: Rs."+can_prize);
		return can_prize;
	}

}


