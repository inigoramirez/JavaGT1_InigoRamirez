package indra.talentCamp.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.generics.Operation;
import indra.talentCamp.generics.Safe;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Figure> drawings = Arrays.asList(
				new Circle(10.0),
				new Triangle(10,15,16,22),
				new Rectangle(10,20));

		System.out.println("The perimeter of my drawing is:");
		System.out.println(drawings.stream().mapToDouble(n->n.calculatePerimeter()).sum());

		System.out.println("\nThe area of my drawing is:");
		System.out.println(drawings.stream().mapToDouble(n->n.calculateArea()).sum());
		double totalPerimeter = 0.0;
		double totalPerimeterBi = 0.0;

		for(Area a: drawings) {
			if(a instanceof Perimeter) {
				totalPerimeter += ((Perimeter)a).calculatePerimeter();
				totalPerimeterBi += Perimeter.class.cast(a).calculatePerimeter();
			}
		}

		System.out.println("\nTotal perimeter = " + totalPerimeter);
		System.out.println("\nTotal perimeter bi = " + totalPerimeterBi);

		System.out.println("\nTotal perimeter with lambda = " + drawings.stream().filter(Perimeter.class::isInstance).map(Perimeter.class::cast).mapToDouble(p -> p.calculatePerimeter()).sum());

		List <Figure> figures = drawings.stream().filter(Figure.class::isInstance).map(Figure.class::cast).collect(Collectors.toList());
		Collections.sort(figures);

		System.out.println("\nSorting figures by area:");
		figures.forEach(System.out::println);

		OperationInteger sumaInt = (a,b) -> (a+b);
		int resInt = sumaInt.operate(2, 2);
		System.out.println("2 + 2 = " + resInt);

		Operation<Integer> suma = (a,b) -> (a+b);
		int res = suma.Operate(2, 2);
		System.out.println("2 + 2 = " + res);

		List<Integer> numbers = Arrays.asList(4,5,656,232,54,657,865,23,433);
		int sumaPar = numbers.stream().filter(n -> n%2 == 0).mapToInt(n -> n).sum();
		int max = numbers.stream().max((a,b) -> a.compareTo(b)).orElse(0);
		
		System.out.println("Suma números pares = " + sumaPar);
		System.out.println("Número max = " + max);
		
		Safe<String, String> keyText = new Safe<String, String>("Open sesame");
		keyText.updateValue("Home banking key");
		String key = keyText.readValue("Open sesame");
		System.out.println("\nThe key is: " + key);
		
		System.out.println("\nAccesing with a wrong key");
		try {
			String badKey = keyText.readValue("Fail");
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
}
