package indra.talentCamp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.lambda.models.Person;

public class Program {
	
	public static void main(String[] args) {
		String frase = "Que la fuerza";
		frase += " te";
		frase += " acompañe";
		
		System.out.println(frase);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Que la fuerza");
		builder.append(" te");
		builder.append(" acompañe");
		
		System.out.println(builder);
		
		/*
		List <Person> jedis = new ArrayList<Person>();
		
		jedis.add(new Person("Anakin", 178));
		jedis.add(new Person("Yoda", 178));
		jedis.add(new Person("Ashoka", 165));
		jedis.add(new Person("Luke", 165));
		*/
		
		List <Person> jedis = Arrays.asList(
				new Person("Anakin", 178),
				new Person("Yoda", 80),
				new Person("Ashoka", 165),
				new Person("Luke", 165));
		
		for(Person jedi: jedis) {
			System.out.println(jedi);
		}
		
		/*
		 * jedi -> System.out.println(jedi)
		 * 
		 * =
		 * 
		 * void show(Person jedi){
		 * 		System.out.println(jedi)
		 * }
		 */
		jedis.forEach(jedi -> System.out.println(jedi));
		
		jedis.forEach(System.out::println);
		
		List<Integer> numeros = Arrays.asList(4,5,656,232,54,657,865,23,433);
		
		int max = 0;
		for(int numero: numeros) {
			if(Integer.compare(numero, max) > 0) {
				max = numero;
			}
		}
		
		System.out.println(max);
		
		
		max = numeros.stream().max((a,b) -> a.compareTo(b)).orElse(0);
		System.out.println(max);
		
		Person jediMasAlto = jedis.stream().max((a,b) -> a.getCm() - b.getCm()).orElse(null);
		System.out.println(jediMasAlto);
		
		System.out.println(numeros.stream().mapToInt(n -> n).sum());
		
		System.out.println("Jedi más alto: " + jedis.stream().mapToInt(jedi -> jedi.getCm()).sum());
		System.out.println("Jedi más alto: " + jedis.stream().mapToInt(Person::getCm).sum());
		
		System.out.println("Media " + numeros.stream().mapToDouble(n -> (double)n).average().orElse(0));
		System.out.format("Media %.2f\n", numeros.stream().mapToDouble(n -> (double)n).average().orElse(0));
		System.out.println("Media " + jedis.stream().mapToDouble(Person::getCm).average().orElse(0));
		
		
		List<Integer> numsMayores100 = numeros.stream().filter(n -> n > 100).collect(Collectors.toList());
		System.out.println(numsMayores100);
		
		List<Person> jedisAltos = jedis.stream().filter(jedi -> jedi.getCm() > 100).collect(Collectors.toList());
		System.out.println(jedisAltos);
		jedisAltos.forEach(System.out::println);
		
		List<Integer> alturas = jedis.stream().map(p -> p.getCm()).collect(Collectors.toList());
		alturas.forEach(System.out::println);
		
		int sum = numeros.stream().reduce(0, (acumulado, valorActual) -> acumulado + valorActual);
		System.out.println("Total de la lista: " + sum);
	}
}