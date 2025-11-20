package Tns;
public class ShoppingCart {
//TypeCastingDemo
	public static void main(String[] args) {
		int quantity=3;
		double priceitem=99.50;
		double totalprice = quantity*priceitem;
		double discount=10.75;
		int roundedDiscount=(int)discount;
		double finalAmount =totalprice -roundedDiscount;
		
		System.out.println("Online Shopping summary");
		System.out.println("final amount "+finalAmount);
	}

}
