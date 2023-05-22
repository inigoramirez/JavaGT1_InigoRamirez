package indra.talentCamp.banco;

import java.util.*;

public class Bank {

	private List<BankAccount> accounts = new ArrayList<BankAccount>();

	public List<BankAccount> getCuentas() {
		return Collections.unmodifiableList(accounts);
	}

	public BankAccount createSavingsAccount(Client client) {
		SavingsAccount account = new SavingsAccount(client);
		this.accounts.add(account);
		return account;
	}

	public BankAccount createCurrentAccount(Client client) {
		CurrentAccount account = new CurrentAccount(client);
		this.accounts.add(account);
		return account;
	}

	public BankAccount searchAccount(int accountNumber) {		
		return this.accounts.stream().filter(c -> c.getAccountNumber() == accountNumber).findFirst().orElse(null);	
	}
	
}
