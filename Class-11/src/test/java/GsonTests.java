import static org.junit.Assert.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Properties;

import org.junit.Test;

import com.google.gson.Gson;

import indra.talentCamp.maven.models.Person;

public class GsonTests {

	String json = "{\"nombre\":\"Pepe\",\"edad\":23}";
	private Gson gson = new Gson();
	
	@Test
	public void shouldReadPropertiesFromJson() {
		Properties p = gson.fromJson(json, Properties.class);
		assertEquals("Pepe", p.getProperty("nombre"));
		assertEquals("23", p.getProperty("edad"));
	}
	
	@Test
	public void shouldReadCustomObjectFromJson() {
		Person persona = gson.fromJson(json, Person.class);
		assertEquals("Pepe", persona.getNombre());
		assertEquals(23, persona.getEdad());
	}
}
