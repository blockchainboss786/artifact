package junitlearning3_4Test;


public class PaymentService {
    public boolean processPayment(double amount) {
        // Imagine this calls an external payment gateway
        return amount < 10000; // simulate success for smaller amounts
    }
}
