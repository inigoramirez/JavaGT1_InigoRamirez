package indra.talentCamp.maven.services;

import java.util.List;

import indra.talentCamp.maven.models.Person;
import indra.talentCamp.maven.persistence.PersonRepository;

public class PersonService {

	private PersonRepository repo;

	public PersonService() {
		this.repo = new PersonRepository();
	}

	public List<Person> recuperarPersonas(){
		List<Person> personas = this.repo.findAll();

		//Aqui programo los requerimientos tecnicos
		//Puedo eliminar las personas que el usuario actual no tiene tiene permiso de ver
		//Puedo sacar las personas que no estan activas
		//Puedo hacer validaciones si tengo permisos para recuperar las personas
		//Puedo guardar un mensaje de log de que es lo que esta pasando...

		return personas;    	
	}

	public void registrarPersonaNueva(Person p) {
		//Valido que la persona cunpla las reglas de negocio
		//Delego la validacion al modelo o en ultima instancia valido aqui
		
		//Ejemplo
		if (p.getNombre() == null) {
			//throw new ValidationException("Falta el nombre");
		}

		this.repo.save(p);
	}

}
