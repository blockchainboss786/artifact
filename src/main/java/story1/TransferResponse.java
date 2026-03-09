package story1;

import javax.validation.constraints.NotNull;

public class TransferResponse {
	@NotNull
	private String transactionId;
	
	private String status;
	
	public TransferResponse(String transactionId,String status) {
		this.transactionId =transactionId;
		this.status = status;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getStatus() {
		return status;
	}
	

}
