package indra.talentCamp.tests;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import indra.talentCamp.banco.Client;

class ClientTests {

	@Test
	public void shouldValidateClientCreation() {
		// Client.builder().setName("mal").build();
		assertThrows(AssertionError.class, () -> Client.builder().setName("mal").build());
		assertThrows(AssertionError.class, () -> Client.builder().setSurname("mal").build());
		assertThrows(AssertionError.class, () -> Client.builder().setID(1).build());
		assertThrows(AssertionError.class, () -> Client.builder().setName("mal").setSurname("mal").build());
	}

}
