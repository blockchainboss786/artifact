package bankingday1_2;

import java.util.ArrayList;
import java.util.List;

public class BankService {
	public void transfer(BankAccount from, BankAccount to, double amount) {
        if (from == null || to == null) {
            throw new NullPointerException("Accounts cannot be null!");
        }
        from.withdraw(amount);
        to.deposit(amount);
    }

    // Transfer between accounts using list index
    public void transferByIndex(List<BankAccount> accounts, int fromIndex, int toIndex, double amount) {
        // intentional bug: forgot to check list size
        BankAccount from = accounts.get(fromIndex);
        BankAccount to = accounts.get(toIndex);
        transfer(from, to, amount);
    }
}
