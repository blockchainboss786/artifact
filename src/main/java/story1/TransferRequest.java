package story1;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class TransferRequest {
	@NotNull(message = "From account cannot be null")
	private String fromAccount;
	
	@NotNull(message = "To account cannot be null")
	private String toAccountString;
	
	@Positive(message = "Amount must be greater then 0")
	private double amount;
	
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccountString() {
		return toAccountString;
	}
	public void setToAccountString(String toAccountString) {
		this.toAccountString = toAccountString;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
