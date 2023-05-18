package indra.talentCamp.models;

public class Withdrawal extends Transaction {

	public Withdrawal(BankAccount account, int amount, String type) {
		// TODO Auto-generated constructor stub
		super(account,amount,"Withdrawal");
	}

}
