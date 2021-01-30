
public class Checkout 
{
	
    DessertItem final_cash[];
    
    public void add_item(DessertItem items[])
    {
    	this.final_cash=items;
    }
   
   public void clear()
   {
	   if(final_cash!=null)
	   {
		   final_cash=null;
	   }
	   else
		   System.err.println("Empty");
   }
  
   
	public double get_Item() {
		if(final_cash!=null)
		{
			return final_cash.length;
		}
		else
			System.err.println("No Item in Cart");
		
		return 0;
	}
	
	public double total_cost() {
		double tot=0;
		if(final_cash!=null)
		{
			for(DessertItem des:final_cash)
			{
				tot=tot+des.Cost_Item();
			}
			return tot;
		}
		else
			System.err.println("No Item in Cart");
		
		return 0;
	}
	@Override
	public String toString() {
		System.out.println("******** ICE-CREAM PARLOR  ********");
		String s = "";

		double total = 0;
		if (final_cash != null) {

			for (DessertItem d : final_cash) {
				s = s + d.Desset_name() + ":" + d.Cost_Item()+"\n";
			}
			s = s + " TOTAL " + ":RS." + this.total_cost();

			return s;
		} else {
			System.err.println("Cart is empty!!!!!");
			return s;
		}
		
	}
	

}
