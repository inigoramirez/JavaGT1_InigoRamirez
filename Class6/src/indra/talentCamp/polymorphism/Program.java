package indra.talentCamp.polymorphism;

import java.util.ArrayList;
import java.util.List;

import indra.talentCamp.polymorphism.models.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player excalibur = new Warrior("Excalibur");
		Player batman = new Warrior("Batman");
		Player thanos = new Wizard("Thanos");
		
		List<Player> players = new ArrayList<Player>();
		players.add(excalibur);
		players.add(batman);
		players.add(thanos);
		
		// Turn Start
		System.out.println("------------ Start --------------");
		System.out.println(excalibur);
		System.out.println(batman);
		System.out.println(thanos);
		
		batman.action(excalibur);
		thanos.action(excalibur);
		
		System.out.println("\n------------ Alive Players --------------");
		players.stream().filter(n -> n.isAlive()).forEach(System.out::println);
		
		players.forEach(p -> p.endTurn());
		
		// Turn End
		System.out.println("\n------------ End --------------");
		System.out.println(excalibur);
		System.out.println(batman);
		System.out.println(thanos);
		
		System.out.println("\n------------- Animals ----------------");
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog("Sparky"));
		animals.add(new Cat("Oliver"));
		animals.add(new Cow("Daisy"));
		
		animals.forEach(animal -> animal.makeSound());
	}

}
