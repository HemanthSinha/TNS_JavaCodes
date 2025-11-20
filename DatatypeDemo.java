package Tns;

public class DatatypeDemo {

	public static void main(String[] args) {
		//primitive datatypes
		int orderId=101;
		double  price =299.99;
		boolean  isDelivered =false;
		char rating ='5';
		float deliverydistance= 5.3f;
		long deliveryboyPhone=7829017391l;
		byte deliveryTime =45;
		short restaurantId=12;
			
	
		//non primitive datatype
	String customerName="Aman";
	String[] FoodItems = {"Burger","Fries","Coco cola","lava cake"};
	
		System.out.println("Order Summary");
		System.out.println("Customer name : "+customerName);
		System.out.println("Order Id : "+orderId);
		System.out.println("RestaurantId : "+restaurantId);
		System.out.println("Delivery Boy Contact : "+deliveryboyPhone);
		System.out.println("Food item:");
		for (String item:FoodItems )
		{
			System.out.println("-"+item);
		}
		System.out.println("Total price "+price);
		System.out.println("Delivery dis "+deliverydistance);
		System.out.println("Expected time "+deliveryTime);
		System.out.println("Is Delivered "+isDelivered);
		System.out.println("Rating "+rating);
		
		
		
	}

}
