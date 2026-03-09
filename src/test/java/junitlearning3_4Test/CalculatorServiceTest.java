package junitlearning3_4Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;


public class CalculatorServiceTest {
	
//	@InjectMocks
	private CalculatorService calculatorService = new CalculatorService();
	
	
	@Test
	public void test1() {
		int num = calculatorService.add(1,2);
		assertEquals(num, 3);
	}
	
	@Test
	public void test2() {
		int num = calculatorService.divide(2,1);
		assertEquals(num, 2);
	}
	
	@Test
	public void test4() {
//		int num = calculatorService.divide(2,0);
		assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(2, 0));
		
	}
	
	@Test
	public void test3() {
		boolean num = calculatorService.isEven(2);
		assertEquals(num,true);
	}

}
