package indra.talentCamp.models;

import java.util.List;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(int accountNumber, double accountBalance, List<Transaction> accountMovements,
			Client accountOwner) {
		super(accountNumber, accountBalance, accountMovements, accountOwner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.setAccountBalance(super.getAccountBalance() + amount);
		super.addAccountTransaction(
				new Deposit(super.getAccountNumber(),amount));
	}

	@Override
	public void withdrawal(double amount) {
		// TODO Auto-generated method stub
		super.setAccountBalance(super.getAccountBalance() - amount);
		super.addAccountTransaction(
				new Withdrawal(super.getAccountNumber(),amount));
	}

}
