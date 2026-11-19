package co.in.rays.op;

public class FoodOrdering {

	Integer orderId;
	String customerName;
	String foodItem;
	Integer quantity;
	double totalAmount;

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderId() {
		return orderId;

	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}
	

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public String getFoodItem() {
		return foodItem;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}


	
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

}
