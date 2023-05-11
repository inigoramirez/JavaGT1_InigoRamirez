package indra.talentCamp.encapsulamiento.models;

public class Student extends Person {

	private boolean prefersFrontEnd;
	
	public Student(String name, int dni, String address) {
		super(name, dni, address);
		this.prefersFrontEnd = false; // Lo inicializamos con un valor por defecto
	}
	
	public Student(String name, int dni, String address, boolean prefersFrontEnd) {
		super(name, dni, address);
		this.prefersFrontEnd = prefersFrontEnd;
	}

	public boolean isPrefersFrontEnd() {
		return prefersFrontEnd;
	}

	public void setPrefersFrontEnd(boolean prefersFrontEnd) {
		this.prefersFrontEnd = prefersFrontEnd;
	}

	@Override
	public String toString() {
		/*
		return this.getName() + " (DNI: " + this.getDni() + ", dirección: " +
				this.getAddress() + ")\n" +
				(this.prefersFrontEnd ? "Entusiasta del Front" : "Entusiasta del back");
		*/
		return String.format("%s (DNI: %d, Dirección: %s)\n%s",
				this.getName(),
				this.getDni(),
				this.getAddress(),
				(this.prefersFrontEnd ? "Entusiasta del Front" : "Entusiasta del back"));
	}
}
