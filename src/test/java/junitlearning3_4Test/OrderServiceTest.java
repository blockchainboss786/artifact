package junitlearning3_4Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class OrderServiceTest {
	
//	@Mock
//	private PaymentService paymentService;
//	
//	@InjectMocks
//	private OrderService orderService;

	@Test
	public void test1() {
		PaymentService paymentService = Mockito.mock(PaymentService.class);
		
		OrderService orderService = new OrderService(paymentService);
		Mockito.when(paymentService.processPayment(5)).thenReturn(true);
		String ocString = orderService.placeOrder("wert",5);
		assertEquals("Order placed successfully for product wert", ocString);
		
	}
	
	@Test
	public void test2() {
		PaymentService paymentService = Mockito.mock(PaymentService.class);
		
		OrderService orderService = new OrderService(paymentService);
		Mockito.when(paymentService.processPayment(5)).thenReturn(true);
		String ocString = orderService.placeOrder(null,123);
		assertEquals("Product ID cannot be empty", ocString);
	}
}
