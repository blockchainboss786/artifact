package bankingday1_2;

import java.util.ArrayList;
import java.util.List;

public class BankApp {
	public static void main(String[] args) {
//		processTransaction();
		
//		 List<BankAccount> accounts = new ArrayList<>();
//	        accounts.add(new BankAccount("ACC1001", 500));
//	        accounts.add(null);   // ❌ Bug: null object accidentally added
//	        accounts.add(new BankAccount("ACC2001", 1000));
//
//	        processTransaction(accounts, 1, 200);
		
//		List<BankAccount> accounts = new ArrayList<>();
//        accounts.add(new BankAccount("ACC1001", 500));
//        accounts.add(new BankAccount("ACC2001", 1000));
//
//        // This will work
//        processWithdrawal(accounts, 0, 200);
//
//        // ❌ This will crash at runtime
//        processWithdrawal(accounts, 0, 1000);
		
		 List<BankAccount> accounts = new ArrayList<>();
	        accounts.add(new BankAccount("ACC1001", 500));
	        accounts.add(new BankAccount("ACC2001", 1000));

//	        // Transaction amounts are coming as Strings (e.g., from UI or CSV)
//	        String[] transactions = {"200", "abc", "300"};  // ❌ Second entry is invalid
//
//	        processTransactions(accounts.get(0), transactions);
	        BankAccount bankAccount = new BankAccount();
	        bankAccount.withdraw(10);
	}
	
	static void processTransactions(BankAccount acc, String[] amounts) {
        for (String amtStr : amounts) {
            double amount = Double.parseDouble(amtStr);  // ❌ Will throw NumberFormatException for "abc"
            acc.deposit(amount);
        }
    }
//	 static void processWithdrawal(List<BankAccount> accounts, int index, double amount) {
//	        BankAccount acc = accounts.get(index);
//	        acc.withdraw(amount);
//	    }

//	static void processTransaction(List<BankAccount> accounts, int index, double amount) {
//        BankAccount acc = accounts.get(index);  // index=1 → valid, but null inside
//        validateAndDeposit(acc, amount);
//    }
//
//    static void validateAndDeposit(BankAccount acc, double amount) {
//        // ❌ This will throw
//        acc.deposit(amount);
//    }
//	method chaining
//	static void processTransaction() {
//	    validateAccount();
//	}
//
//	static void validateAccount() {
//	   BankAccount acc = null;   // ❌ not initialized
//	   acc.deposit(100);         // Exception will happen here
//	}
		
//		------------------------------
//		  BankAccount acc = null;   // ❌ forgot to initialize
//	        acc.deposit(100);
//	        solution
//	        BankAccount acc = new BankAccount()use parameterized constructor;   // don't add a constructor without the intialization of values
//	        acc.deposit(100);
		
//	-----------------LEVEL3-------------
//		List<BankAccount> accounts = new ArrayList<>();
//        accounts.add(new BankAccount("ACC1001", 1000));
//        accounts.add(new BankAccount("ACC2001", 500));
//
//        BankService bankService = new BankService();
//
//        // ✅ Normal transfer
//        bankService.transfer(accounts.get(0), accounts.get(1), 200);

        // ❌ DOUBLE BUG:
        // 1) Index 5 does not exist → ArrayIndexOutOfBoundsException
        // 2) If index existed, negative withdraw amount → IllegalArgumentException
//        try {
//            BankAccount from = accounts.get(5); // Bug 1
//            from.withdraw(-100);                 // Bug 2
//        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }  
//        Solution
//        if (accounts.size() > 5) {
//            BankAccount from = accounts.get(5);
//            if (from != null) {
//                try {
//                    from.withdraw(-100);
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Cannot withdraw negative amount");
//                }
//            }
//        } else {
//            System.out.println("Invalid account index!");
//        }
//
//        // ❌ Null account bug still present
//        try {
//            bankService.transfer(null, accounts.get(0), 50);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		
// ---------------LEVEL2-----------------------		
//		List<BankAccount> accounts = new ArrayList<>();
//        accounts.add(new BankAccount("ACC1001", 1000));
//        accounts.add(new BankAccount("ACC2001", 500));
//
//        BankService bankService = new BankService();
//
//        // ✅ Normal transfer
//        bankService.transfer(accounts.get(0), accounts.get(1), 200);
//
//        // ❌ New bug: transfer using invalid index
//        try {
//            bankService.transferByIndex(accounts, 0, 5, 100); // index 5 doesn't exist
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // ❌ New bug: withdraw negative amount
//        try {
//            accounts.get(1).withdraw(-100);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // ❌ Existing bug: null account
//        try {
//            bankService.transfer(null, accounts.get(0), 50);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//		
		
		
		
//	--------------------------------Level1-----------------------------------
//        BankAccount acc1 = new BankAccount("ACC1001", 1000);
//        BankAccount acc2 = new BankAccount("ACC2001", 500);
//
//        BankService bankService = new BankService();
//
//        // ✅ Correct flow
//        System.out.println("Initial Balance Acc1: " + acc1.getBalance());
//        System.out.println("Initial Balance Acc2: " + acc2.getBalance());
//
//        bankService.transfer(acc1, acc2, 200);
//        System.out.println("After transfer - Acc1: " + acc1.getBalance() + ", Acc2: " + acc2.getBalance());
//
////        // ❌ BUG 1: Withdraw more than balance
////        try {
////            acc1.withdraw(2000);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//        
//     // Option 1: Catch & handle
//        try {
//            acc1.withdraw(2000);
//        } catch (InsufficientFundsException e) {
//            System.out.println("Cannot withdraw: " + e.getMessage());
//        }
//
//        // Option 2: Prevent before calling
//        if (acc1.getBalance() >= 2000) {
//            acc1.withdraw(2000);
//        } else {
//            System.out.println("Insufficient balance!");
//        }
//
//        // ❌ BUG 2: Deposit invalid amount
//        try {
//            acc2.deposit(-50);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // ❌ BUG 3: Null account in transfer
//        try {
//            bankService.transfer(null, acc2, 100);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    
}
