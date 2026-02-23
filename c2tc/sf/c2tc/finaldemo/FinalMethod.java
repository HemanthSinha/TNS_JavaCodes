package org.tnsif.sf.c2tc.finaldemo;
//ecommerce discount calculation

class EcommercePlatform
{
	final void calculateDiscount()
	{
		System.out.println("Base discount =10%");
	}
}
class Amazon extends EcommercePlatform
{
	void calculateDiscount()
	{
	    System.out.println("Extra Discount =20%");	
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		Amazon obj=new Amazon();
		obj.calculateDiscount();

	}

}
