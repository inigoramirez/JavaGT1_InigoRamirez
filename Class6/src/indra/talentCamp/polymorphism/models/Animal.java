package indra.talentCamp.polymorphism.models;

public abstract class Animal {
	
	private String name;

	public Animal(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public abstract void makeSound();
	
	@Override
	public String toString() {
		return this.name + ": ";
	}

}
