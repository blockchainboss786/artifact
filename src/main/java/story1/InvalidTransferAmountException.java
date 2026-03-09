package story1;

public class InvalidTransferAmountException extends RuntimeException{

	public InvalidTransferAmountException(String message) {
		super(message);
	}
}
