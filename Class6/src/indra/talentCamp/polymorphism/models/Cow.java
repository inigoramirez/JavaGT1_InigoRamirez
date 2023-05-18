package indra.talentCamp.polymorphism.models;

public class Cow extends Animal {

	public Cow(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(super.toString() + "Moo");
	}
}
