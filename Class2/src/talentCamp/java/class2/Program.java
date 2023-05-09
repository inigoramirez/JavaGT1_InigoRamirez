package talentCamp.java.class2;

import java.util.ArrayList;
import java.util.List;

// import java.util.ArrayList;

public class Program {
	
	public static void changeValue(int n) {
		n = 20;
	}
	
	public static void changeRectangle(Rectangle rect) {
		rect.base = 30;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Clase Dos");
		
		int number = 10;
		int  b = 20;
		number = b;
		
		System.out.println(number);
		
		Rectangle r = new Rectangle();
		r.base = 10;
		r.height = 30;
		
		System.out.println(r);
		System.out.println(r.base);
		System.out.println(r.height);
		
		Rectangle r2 = null;
		// System.out.println(r2.height); --> NullPointerException
		
		r2 = new Rectangle();
		r2.base = 5;
		r2.height = 15;
		
		System.out.println(r2.base);
		System.out.println(r2.height);
		
		r = r2;
		r2.base = 444;
		
		System.out.println(r2.base);

		int a = 555;
		changeValue(a);
		System.out.println(a);
		
		r.base = 888;
		changeRectangle(r);
		System.out.println(r.base);
		
		// Ctrl + Shift + o --> Auto-import all necessary packages
		List<String> jedisDeJava = new ArrayList<String>();
		jedisDeJava.add("Marcos");
		jedisDeJava.add("Javier");
		jedisDeJava.add("Borja");
		jedisDeJava.add("Angello");
		jedisDeJava.add("Jean");
		
		// El string es un tipo de dato especial, parece primitivo pero es de tipo
		
		String jediActual = null;
		System.out.println("Bienvenidos a la academia de Talent Camp");
		for(int i=0; i < jedisDeJava.size(); i++) {
			jediActual = jedisDeJava.get(i);
			System.out.println(jediActual);
		}
	}

}
