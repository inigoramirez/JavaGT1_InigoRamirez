package indra.talentCamp.controller;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Manejo de fechas
		LocalDate fecha = LocalDate.now();
		System.out.println(fecha);
		
		LocalDateTime fechaYHora = LocalDateTime.now();
		System.out.println(fechaYHora);
		
		LocalTime horaActual = LocalTime.now();
		System.out.println(horaActual);
		
		LocalDate fechaEspecifica = LocalDate.of(2023, Month.FEBRUARY, 10);
		LocalDate cumpleBorja = LocalDate.of(2023, Month.DECEMBER, 24);
		System.out.format("Feliz cumple el %d del mes %s,", cumpleBorja.getDayOfMonth(), cumpleBorja.getMonth());
		
		LocalDate navidad = cumpleBorja.plusDays(1);
		System.out.println("\n\nFeliz Navidad");
		System.out.println(navidad);
		
		if(cumpleBorja.isBefore(navidad)) {
			System.out.println("Borja cumple antes de la Navidad");
		}
		
		Period periodo = Period.between(cumpleBorja, navidad);
		System.out.format("Hay %d años, %d meses, %d días entre el cumple de Borja y la Navidad",
				periodo.getYears(), periodo.getMonths(), periodo.getDays());
		
		Duration duracion = Duration.between(LocalTime.now(), LocalTime.now().plusHours(1));
		System.out.println(duracion.getSeconds());
		
		String texto = "Como están los maquinas";
		List<String> palabras = Arrays.asList(texto.split(" "));
		palabras.forEach(System.out::println);
		
		// Diccionarios
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("Casa", "Lugar donde vive la gente");
		if(diccionario.containsKey("Coche")) {
			diccionario.put("Coche", "Vehiculo que te lleva de un lado a otro");
		}
		
		for(var entrada : diccionario.entrySet()) {
			System.out.println(entrada.getKey() + " : " + entrada.getValue());
		}
		
		System.out.println("\n\n------------ EJERCICIO ---------------");
		String textoEjercicio = "Como están los maquinas los";
		List<String> palabrasTextoEjercicio = Arrays.asList(textoEjercicio.split(" "));
		Map<String, Integer> diccionarioEjercicio = new HashMap<>();
		
		for(String palabra : palabrasTextoEjercicio) {
			if(diccionarioEjercicio.containsKey(palabra)) {
				diccionarioEjercicio.put(palabra, diccionarioEjercicio.get(palabra) + 1);
			}
			else {
				diccionarioEjercicio.put(palabra, 1);
			}
		}
		
		for(var entrada : diccionarioEjercicio.entrySet()) {
			System.out.println(entrada.getKey() + " : " + entrada.getValue());
		}
		
		// SET
		System.out.println("\n\n------------ SET ---------------");
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Casa");
		conjunto.add("Casa");
		conjunto.add("Casa");
		conjunto.add("Mesa");
		conjunto.add("Mesa");
		conjunto.add("Mesa");
		
		System.out.println(conjunto.size());
		for(var e : conjunto) {
			System.out.println(e);
		}
		
		// Priority Queue
		System.out.println("\n\n------------ PRIORITY QUEUE ---------------");
		Queue<Integer> prioridades = new PriorityQueue<>();
		prioridades.offer(9);
		prioridades.offer(19);
		prioridades.offer(49);
		prioridades.offer(2);
		prioridades.offer(4);
		System.out.println("Valor más alto = " + prioridades.poll());
		prioridades.offer(1);
		System.out.println("Valor más alto = " + prioridades.poll());
	}

}
