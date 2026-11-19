package co.in.rays.op;

public class TestFoodOrdering {
	
	public static void main (String [] args) {
		
		FoodOrdering fo = new FoodOrdering();
		
		fo.setOrderId(123);
		fo.setCustomerName("Naman");
		fo.setFoodItem("Samosa");
		fo.setQuantity(1);
		fo.setTotalAmount(Double.parseDouble("10"));
		
		
		 System.out.println(fo.getOrderId());
	        System.out.println(fo.getCustomerName());
	        System.out.println(fo.getFoodItem());
	        System.out.println(fo.getQuantity());
	        System.out.println(fo.getTotalAmount());
		
	}

}
