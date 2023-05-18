package indra.talentCamp.polymorphism.models;

public class Dog extends Animal {

	public Dog(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		super.toString();
		System.out.println(super.toString() + "Bark");
	}
}
