package junitlearning3_4Test;

public class PaymentServices {
	public boolean processPayment(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        // Simulate successful payment if amount < 1000
        if (amount < 1000) {
            return true;
        } else {
            return false; // Payment fails for large amounts
        }
    }
}
