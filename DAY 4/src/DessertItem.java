
public abstract class DessertItem {
	String dessert_name;
	
	public DessertItem() {
		
	}
	
	public DessertItem(String dessert_name)
	{
		this.dessert_name=dessert_name;
	}
	
	public abstract double Cost_Item();
	
	public final String Desset_name() {
		System.out.println("dessert_name: "+dessert_name);
		return this.dessert_name;
	}

}
