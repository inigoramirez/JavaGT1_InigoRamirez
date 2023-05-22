package indra.talentCamp.banco;

import java.util.*;

public abstract class BankAccount {

	private static int LAST_NUMBER = 1;

	private Client owner;
	private int accountNumber;
	protected List<Transaction> transactions = new ArrayList<Transaction>();

	//Si no pongo nada es private, pero un private especial que se llama package-private
	BankAccount(Client owner) {
		super();
		this.owner = owner;
		this.accountNumber = BankAccount.LAST_NUMBER;
		BankAccount.LAST_NUMBER++;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return transactions.stream().mapToDouble(transaction -> transaction.getAmount()).sum();
	}

	public List<Transaction> getTransactions() {
		return Collections.unmodifiableList(transactions);
	}

	public Client getOwner() {
		return owner;
	}

	public void deposit(double amount) {
		transactions.add(new Transaction(amount));
	}

	public void deposit(double amount, String concept) {
		transactions.add(new Transaction(amount, concept));
	}


	public abstract void withdrawal(double amount) throws NotEnoughBalanceException;	
	public abstract void withdrawal(double amount, String concept) throws NotEnoughBalanceException;

}
