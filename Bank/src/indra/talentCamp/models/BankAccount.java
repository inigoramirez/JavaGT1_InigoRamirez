package indra.talentCamp.models;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
	
	private int accountNumber;
	private double accountBalance;
	List<Transaction> accountTransactions = new ArrayList<Transaction>();
	private Client accountOwner;
	
	public BankAccount(int accountNumber, double accountBalance, List<Transaction> accountMovements, Client accountOwner) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		for(Transaction t : accountTransactions) {
			this.accountTransactions.add(t);
		}
		this.accountOwner = accountOwner;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<Transaction> getAccountTransactions() {
		return accountTransactions;
	}

	public void addAccountTransaction(Transaction t) {
		this.accountTransactions.add(t);
	}

	public Client getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(Client accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	public abstract void deposit(double amount);
	
	public abstract void withdrawal(double amount);
}
