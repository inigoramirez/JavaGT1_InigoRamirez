package indra.talentCamp.banco;

public class CurrentAccount extends BankAccount {

	CurrentAccount(Client owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdrawal(double amount) throws NotEnoughBalanceException {
        this.transactions.add(new Transaction(-amount));
	}

	@Override
	public void withdrawal(double amount, String concept) throws NotEnoughBalanceException {
        this.transactions.add(new Transaction(-amount, concept));
	}
	
}
