import java.util.Random;

import indra.utils.Consola;

public class Program {
	static final int CANTIDAD_OPORTUNIDADES = 5;
	static final int MAX_VALUE = 100;
	
	public static void juegoAdivinarNumero() {
		Random r = new Random();
		int secreto = r.nextInt(1, MAX_VALUE);
		boolean adivino = false;
		int turnoActual = 1;
		
		System.out.println("Bienvenidos al juego. Tiene 5 oportunidades para adivinar el número secreto.");
		
		while((!adivino) && (turnoActual <= CANTIDAD_OPORTUNIDADES)) {
			int adivinanza = Consola.readInt("Ingrese un número");
			
			if(adivinanza < secreto) {
				System.out.println("El número ingresado es menor al secreto");
			}
			else if(adivinanza > secreto) {
				System.out.println("El número ingresado es mayor al secreto");
			}
			else {
				System.out.println("¡Felicitaciones! Lo has adivinado");
				adivino = true;
			}
			turnoActual++;
		}
		
		if(!adivino) {
			System.out.println("Lo siento, no lo has adivinado. El número secrteto era " + secreto);
		}
	}
	
	public static void esPrimo() {
		int numero = Consola.readInt("Ingrese un número y diremos si es primo");
		boolean esPrimo = true;
		
		for(int i=2; i < numero/2; i++) {
			if((numero % i) == 0) {
				esPrimo = false;
				break;
			}
		}
		
		if(esPrimo) {
			System.out.println("El número es primo.");
		}
		else {
			System.out.println("El número no es primo.");
		}
	}
	
	public static void main(String[] args){
		int num = Consola.readInt("Introduzca su edad");
		System.out.println(num);
		
		juegoAdivinarNumero();
		
		esPrimo();
	}
}
