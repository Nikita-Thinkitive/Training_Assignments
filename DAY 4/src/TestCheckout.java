
public class TestCheckout {
	public static void main(String[] args) {
		DessertItem desser[];
		
		
		Candy c=new Candy("Orange candy",200);
		IceCream ice=new IceCream("Chocolate",100);
		
		Cookie cokie= new Cookie("Blueberry cookies",5);
		
		
		Sunday sun=new Sunday(100,100);
		Checkout cart=new Checkout();
		
		DessertItem items[] = { sun, ice, cokie, c};
		
		
		cart.add_item(items);
		System.out.println(cart);
		 
		
		
		
		

		
}
}

/*OUTPUT
 ******** ICE-CREAM PARLOR  ********
dessert_name: null
Cost Of Ice-Cream is: Rs.0.0
dessert_name: Chocolate
Cost Of Ice-Cream is: Rs.100.0
dessert_name: Blueberry cookies
Price of Cookies: 50.0
dessert_name: Orange candy
price of Candy Orange candy is: Rs.0.0
Cost Of Ice-Cream is: Rs.0.0
Cost Of Ice-Cream is: Rs.100.0
Price of Cookies: 20.833333333333332
price of Candy Orange candy is: Rs.0.0
null:0.0
Chocolate:100.0
Blueberry cookies:50.0
Orange candy:0.0
 TOTAL :RS.120.83333333333333

 */

