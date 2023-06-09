package indra.talentCamp.maven;

import java.util.Properties;

import com.google.gson.Gson;

import indra.talentCamp.maven.models.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo Maven\n");
		
		String json = "{\"nombre\":\"Pepe\",\"edad\":23}";
		
		Gson gson = new Gson();
		Properties p = gson.fromJson(json, Properties.class);
		System.out.println("El nombre es : " + p.getProperty("nombre"));
		System.out.println("La edad es : " + p.getProperty("edad"));
		
		System.out.println("\n------------ Deserializando --------------");
		Person persona = gson.fromJson(json, Person.class);
		System.out.println("El nombre es : " + persona.getNombre());
		System.out.println("La edad es : " + persona.getEdad());
	}

}
