package bankingday1_2;

public class InsufficientFundsException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String message) {
		super(message);
	}
}
