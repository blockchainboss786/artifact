package junitlearning3_4Test;

public class OrderServices {

	private PaymentServices paymentService;
	private InventoryService inventoryService;

	public OrderServices(PaymentServices paymentService, InventoryService inventoryService) {
		this.paymentService = paymentService;
		this.inventoryService = inventoryService;
	}

	public String placeOrder(String productId, int amount) {
		if (productId == null || productId.isEmpty()) {
			return "Product ID cannot be empty";
		}

		if (!inventoryService.isInStock(productId)) {
			return "Product is out of stock";
		}

		try {
			boolean paymentStatus = paymentService.processPayment(amount);
			if (paymentStatus) {
				inventoryService.reduceStock(productId);
				return "Order placed successfully for product " + productId;
			} else {
				return "Payment failed. Order not placed.";
			}
		} catch (IllegalArgumentException ex) {
			return "Invalid payment amount: " + ex.getMessage();
		} catch (RuntimeException ex) {
			return "Error during order processing: " + ex.getMessage();
		}
	}

}
