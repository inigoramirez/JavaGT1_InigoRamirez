package indra.talentCamp.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import indra.talentCamp.banco.Bank;
import indra.talentCamp.banco.BankAccount;
import indra.talentCamp.banco.Client;
import indra.talentCamp.banco.NotEnoughBalanceException;

class BankAccountTests {
	
	Client c;
	
	@BeforeAll
	public static void BeforeAll() {
		System.out.println("Before running the all tests");
		
	}
	
	@BeforeEach
	public void Before() {
		System.out.println("Before running each test");
		c = Client.builder()
				.setID(123)
				.setName("Esteban")
				.setSurname("Calabria")
				.build();
	}

	@Test
	void ShouldAutoIncrementBankAccountNumber() {
		Bank bank = new Bank();
		
		// Client c = new Client(123,"Esteban", "Calabria");
		
		// No puedo crear una cuenta porque el constructor es package-private
		BankAccount account = bank.createCurrentAccount(c);
		BankAccount account2 = bank.createSavingsAccount(c);
		assertTrue(account.getAccountNumber() < account2.getAccountNumber(), "Las dos cuentas no son ");
		assertEquals(1, account.getAccountNumber());
		assertEquals(2, account2.getAccountNumber(), "La cuenta 2 no tiene IBAN 2");
	}
	
	@Test
	void ShouldNotBeAbleToWithdrawMoreFromSavingsAccount() {
		Bank bank = new Bank();
		
		BankAccount savingsAccount = bank.createSavingsAccount(c);
		savingsAccount.deposit(100);
		
		assertTrue(savingsAccount.getBalance() > 0);
		assertThrows(NotEnoughBalanceException.class, () -> savingsAccount.withdrawal(200));
	}
	
	@Test
	void ShouldWithdrawCorrectly() throws NotEnoughBalanceException {	
		Bank bank = new Bank();
		
		BankAccount savingsAccount = bank.createSavingsAccount(c);
		savingsAccount.deposit(100);
		savingsAccount.withdrawal(50);
		
		assertEquals(50, savingsAccount.getBalance());
	}

}
