package indra.talentCamp.models;

import java.util.List;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int accountNumber, double accountBalance, List<Transaction> accountMovements,
			Client accountOwner) {
		super(accountNumber, accountBalance, accountMovements, accountOwner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawal(double amount) {
		// TODO Auto-generated method stub

	}

}
