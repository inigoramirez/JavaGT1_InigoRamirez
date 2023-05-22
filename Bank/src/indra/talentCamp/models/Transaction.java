package indra.talentCamp.models;

public abstract class Transaction {

	private int accountNumber;
	private double amount;
	private String type;
	
	public Transaction(int accountNumber, double amount, String type) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.type = type;
	}

}
