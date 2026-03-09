package bankingday1_2;

public class BankAccount {
	private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountNumber + " new balance: " + balance);
    }

	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
    
//    public void withdraw(double amount) {
//        if (amount > balance) {
//            // ❌ Bug: throwing a generic RuntimeException instead of handling properly
//            throw new RuntimeException("Insufficient funds for account " + accountNumber);
//        }
//        balance -= amount;
//        System.out.println(accountNumber + " new balance: " + balance);
//    }
//    public void deposit(double amount) {
//        if (amount <= 0) {
//            throw new IllegalArgumentException("Deposit must be positive!");
//        }
//        balance += amount;
//    }

//    public void withdraw(double amount) {
//        if (amount <= 0) {
//            throw new IllegalArgumentException("Withdrawal must be positive!");
//        }
//        if (amount > balance) {
//            throw new InsufficientFundsException(
//                "Cannot withdraw " + amount + " from balance " + balance
//            );
//        }
//        balance -= amount;
//    }
}
