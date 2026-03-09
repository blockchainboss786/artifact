package story1;

import org.springframework.stereotype.Service;

@Service
public class FundTransferService {
	
	public TransferResponse processTransfer(TransferRequest request) {
		
		if(request.getFromAccount() ==null || request.getToAccountString() == null) {
			throw new AccountNotFoundException("From or to Account cannot be empty");
		}
		if (request.getAmount() <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive");
        }
		// Dummy check (simulate insufficient funds)
        if (request.getAmount() > 10000) {
            throw new InsufficientBalanceException("Insufficient balance for transfer");
        }
        
     // ✅ Simulate DB logic — generate transaction ID
        String txnId = "TXN-" + UUID.randomUUID().toString().substring(0, 8);
        return new TransferResponse(txnId, "SUCCESS");
	}

}
