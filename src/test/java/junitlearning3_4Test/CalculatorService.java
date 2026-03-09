package junitlearning3_4Test;

public class CalculatorService {
	
	public void calculatorService(CalculatorService calculatorService) {
		this.calculatorService(calculatorService);
	}

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

