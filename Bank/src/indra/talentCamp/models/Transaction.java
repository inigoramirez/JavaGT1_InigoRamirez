package indra.talentCamp.models;

public abstract class Transaction {

	private BankAccount account;
	private int amount;
	private String type;
	
	public Transaction(BankAccount account, int amount, String type) {
		// TODO Auto-generated constructor stub
		this.account = account;
		this.amount = amount;
		this.type = type;
	}

}
