package indra.talentCamp.encapsulamiento.models;

public class Person {

	private String name;
	private int dni;
	private String address;
	
	public Person(String name, int dni, String address) {
		super();
		this.name = name;
		this.dni = dni;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
