package indra.talentCamp.banco;

import java.time.LocalDate;

public class Transaction {

	private LocalDate date;
	private double amount; //Positivo, deposito, Negativo, extraccion;
	private String motive;
    
    public Transaction(double amount) {
		super();
		this.amount = amount;
		this.date = LocalDate.now();
		this.motive = (amount > 0)? "Deposito" : "Extracción";
	}
    
    public Transaction(double amount, String motive) {
    	super();
		this.amount = amount;
		this.date = LocalDate.now();
		this.motive = motive;
    }

	public double getAmount() {
		return amount;
	}

	public String getMotive() {
		return motive;
	}
	
	public TransactionType getTipo() {
		if (this.amount>0) {
			return TransactionType.Deposit;
		}
		
		return TransactionType.Withdrawal;
	}
	
	@Override
	public String toString() {
		return "...";
	}
	
}
