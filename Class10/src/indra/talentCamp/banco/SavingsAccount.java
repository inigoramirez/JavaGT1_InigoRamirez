package indra.talentCamp.banco;

public class SavingsAccount extends BankAccount {

	SavingsAccount(Client owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdrawal(double amount) throws NotEnoughBalanceException {
		if (this.getBalance() < amount) {
			throw new NotEnoughBalanceException();
		}

		this.transactions.add(new Transaction(-amount));
	}

	@Override
	public void withdrawal(double amount, String concept) throws NotEnoughBalanceException {
		if (this.getBalance() < amount) {
			throw new NotEnoughBalanceException();
		}

		this.transactions.add(new Transaction(-amount, concept));
	}

}
