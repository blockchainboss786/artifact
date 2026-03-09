package junitlearning3_4Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class OrderServicesTest {
	
	@Mock
	private PaymentServices paymentServices;
	
	@Mock
	private InventoryService inventoryService;
	
	@InjectMocks
	private OrderServices orderServices;
	
	public OrderServicesTest() {
	      MockitoAnnotations.openMocks(this); // ✅ initializes @Mock and @InjectMocks fields
	}
	 
	@Test
	public void test1() {
//		PaymentServices paymentServices = Mockito.mock(PaymentServices.class);
		OrderServices orderServices = new OrderServices(paymentServices,inventoryService);
		String result = orderServices.placeOrder("1",123);	
		assertEquals("Product is out of stock", result);
    }
	
	@Test
	public void test2() {
//		PaymentServices paymentServices = Mockito.mock(PaymentServices.class);
		OrderServices orderServices = new OrderServices(paymentServices,inventoryService);
		String result = orderServices.placeOrder(null,123);	
		assertEquals("Product ID cannot be empty", result);
    }

}
