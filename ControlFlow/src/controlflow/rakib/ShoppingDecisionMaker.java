package controlflow.rakib;

import java.util.Scanner;

public class ShoppingDecisionMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		
		if ( isAffordable(price))
		{
			buyProduct();
		} else if (isDiscountAvailable(price)) {
			buyProduct();
		} else {
			dontBuyThisProduct();
		}	
		
	}
	
	
	private static void dontBuyThisProduct()
	{
		System.out.println("I will not buy this product");
	}
	
	private static void addThisProducttoWishList() {
		System.out.println("I will buy it later");
	}
	
	private static boolean isDiscountAvailable ()
	{
		return DISCOUNT_AVAILABLE;	
	}
	
	private static boolean isLittleExpensive(int price)
	{
		if ( 500 < price && price < 1000 ) return true;
		else return false;
	}

}
