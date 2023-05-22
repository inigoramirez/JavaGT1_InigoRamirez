package indra.talentCamp.banco;

public class NotEnoughBalanceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NotEnoughBalanceException() {
		super("You don't have enough balance to this perform this transaction");
	}

}