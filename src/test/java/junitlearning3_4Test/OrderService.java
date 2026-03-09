package junitlearning3_4Test;

public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String placeOrder(String productId, double amount) {
        if (productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException("Product ID cannot be empty");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        boolean paymentSuccess = paymentService.processPayment(amount);

        if (paymentSuccess) {
            return "Order placed successfully for product " + productId;
        } else {
            return "Payment failed. Order could not be placed.";
        }
    }
}

