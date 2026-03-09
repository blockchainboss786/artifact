package story1;

import java.security.InvalidAlgorithmParameterException;
import java.util.UUID;

import org.springframework.stereotype.Service;

import net.bytebuddy.asm.Advice.Return;

@Service
public class TransferService {
	
	public TransferResponse transferMoney(TransferRequest request) {
		if(request.getAmount()<=0) {
			throw new InvalidTransferAmountException("Amount must be greater than zero");
		}
		if(request.getFromAccount().equals(request.getToAccountString())){
			throw new SameAccountTransferException("The to and from account cannot be same");
		}  
		
		String transactionId = "TXN-" + UUID.randomUUID().toString()
.substring(0,8);
		return new TransferResponse(transactionId, "SUCCESS");
		}

}
