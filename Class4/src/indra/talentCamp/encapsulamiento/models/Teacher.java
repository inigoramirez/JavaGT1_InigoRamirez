package indra.talentCamp.encapsulamiento.models;

public class Teacher extends Person {

	private String preferedLanguage;
	
	public Teacher(String name, int dni, String address) {
		super(name, dni, address);
		this.preferedLanguage = "Java"; // Lo inicializamos con un valor por defecto
	}
	
	public Teacher(String name, int dni, String address, String preferedLanguage) {
		super(name, dni, address);
		this.preferedLanguage = preferedLanguage;
	}

	public String getPreferedLanguage() {
		return preferedLanguage;
	}

	public void setPreferedLanguage(String preferedLanguage) {
		this.preferedLanguage = preferedLanguage;
	}

	@Override
	public String toString() {
		return this.getName() + " (DNI: " + this.getDni() + ", dirección: " +
				this.getAddress() + ")\n" + "Experto en " + this.getPreferedLanguage();
	}
}
