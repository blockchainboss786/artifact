package story1;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class FundTransferController {
	
	private final TransferService transferService;
	
	public FundTransferController(TransferService transferService) {
		this.transferService = transferService;
	}
	
	@PostMapping("/transfer")
	public ResponseEntity<TransferResponse> transferMoney(@Valid @RequestBody TransferRequest request){
		String transactionId = "TXN-" + UUID.randomUUID().toString().substring(0,8);
		
		if(request.getFromAccount().equalsIgnoreCase(request.getToAccountString())) {
			return ResponseEntity.badRequest().body(new TransferResponse(null, "From and to accounts cannot be same"));
		}
		TransferResponse response = new TransferResponse(transactionId,"SUCCESS");
		
		return ResponseEntity.ok(response);
	}
	

}
