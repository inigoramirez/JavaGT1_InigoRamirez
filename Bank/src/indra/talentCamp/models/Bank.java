package indra.talentCamp.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	List<BankAccount> accounts = new ArrayList<BankAccount>();
	List<Client> clients = new ArrayList<Client>();

	public Bank(List<BankAccount> accounts, List<Client> clients) {
		// TODO Auto-generated constructor stub
		for(BankAccount a : accounts) {
			this.accounts.add(a);
		}
		for(Client c : clients) {
			this.clients.add(c);
		}
	}

}
