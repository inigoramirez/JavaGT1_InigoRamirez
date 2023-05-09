package indra.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Consola {

	public static void ejemploBufferedReader(){
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
		try {
			try {
				System.out.println("Ingrese su nombre: ");
				String nombre = reader.readLine();
				
				System.out.println("Ingrese su edad: ");
				String edadString = reader.readLine();
				int edad = Integer.parseInt(edadString);
				
				System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		} finally {
			System.out.println("Cerrando el Buffer");
			try {
				reader.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public static void ejemploBufferedReaderConThrows() throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese su nombre: ");
		String nombre = reader.readLine();
		
		System.out.println("Ingrese su edad: ");
		String edadString = reader.readLine();
		int edad = Integer.parseInt(edadString);
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
		
		
		System.out.println("Cerrando el Buffer");
		reader.close();
	}
	
	public static void ejemploScanner() {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Su nombre es... ");
			String nombre = in.nextLine();
			System.out.println("Su edad es... ");
			int edad = in.nextInt();
			System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
		}
	}
	
	private static boolean esNumerico(String numero) {
		try {
			Integer.parseInt(numero);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	private static int readInt() {
		String numero = null;
		@SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero:");
            numero = in.nextLine();
        }while(!esNumerico(numero));
        
        return Integer.valueOf(numero);
	}
	
	// Sobreescritura de métodos
	public static int readInt(String prompt) {
		String numero = null;
		@SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(prompt);
            numero = in.nextLine();
        }while(!esNumerico(numero));
        
        return Integer.valueOf(numero);
	}
	
	public static void main(String[] args) {
		// ejemploBufferedReader();
		// ejemploScanner();
		// int num = readInt("Introduzca su edad");
		// System.out.println(num);
		
		
		/*
		System.out.println("Ingrese un número...");
		Scanner in = new Scanner(System.in);
		String entrada = in.nextLine();
		if(esNumerico(entrada)) {
			System.out.println("Gracias por ingresar un número.");
		}
		else {
			System.out.println("¡No me hiciste caso!");
		}
		// Al cerrar Scanner cierras la entrada estándar.
		// ¡No podrás volver a usar Scanner!
		in.close();
		*/
	}

}
