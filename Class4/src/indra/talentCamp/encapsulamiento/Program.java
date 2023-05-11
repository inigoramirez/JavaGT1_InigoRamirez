package indra.talentCamp.encapsulamiento;

import indra.talentCamp.encapsulamiento.models.*;
import indra.talentCamp.utils.Console;

public class Program {

	public static void main(String[] args) {
		try {
			System.out.println("Bienvenidos al Talent Camp de Java");
			
			System.out.println("¿Quién va a impartir el curso?");
			Teacher jedi = new Teacher(
					Console.readString("¿Cómo te llamas?"),
					Console.readInt("¿Cuál es tu DNI?"),
					Console.readString("¿Cuál es tu dirección?"));
			
			System.out.println("¿Quién va a asistir al curso?");
			Student padawan = new Student(
					Console.readString("¿Cómo te llamas?"),
					Console.readInt("¿Cuál es tu DNI?"),
					Console.readString("¿Cuál es tu dirección?"));
			
			String respuesta = Console.readString("¿Te gusta el front-end? (S/N)");
			padawan.setPrefersFrontEnd(respuesta.equalsIgnoreCase("S"));
			
			System.out.println("----------Profesor-----\n" + jedi);
			System.out.println("----------Alumno-------\n" + padawan);
			/*
			System.out.println("Bienvenido " + padawan.getName() + " al Talent Camp de Java");
			System.out.println("Su dni es " + padawan.getDni() + " y vive en " + padawan.getAddress());
			if(padawan.isPrefersFrontEnd()) {
				System.out.println("Esperemos que se le asigne un proyecto de front");
			}
			else {
				System.out.println("Esperemos que se le asigne un proyecto de back");
			}
			*/
		}finally {
			// in.close();
		}
	}

}
