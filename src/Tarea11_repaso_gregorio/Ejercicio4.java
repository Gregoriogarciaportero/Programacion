package Tarea11_repaso_gregorio;

import java.util.Scanner;

	/*
	 * Pre:...
	 * Post: Escribe un programa Java que pregunte al usuario por dos
	 *		 Strings, y compruebe si el primero de ellos finaliza con el valor del segundo.
			 1º String: Hola
			 2º String: la
			 Hola finaliza con la ->; devuelvo TRUE
	 */

public class Ejercicio4 {

	public static void terminar (String a, String b) {
		int longA = a.length()-1;
		int longB = b.length()-1;
	
		boolean es=true;
		for (int i = 0; i <b.length() ; i++) {
			
			if (b.charAt(longB-i) == a.charAt(longA-i)) {
				
				
			} else {
				es = false;
				break;
			}
		}
		System.out.print(a + " finaliza con "+b+ " -> " + es);
	}
	
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce dos palabras: ");
		String palabra1 = enter.nextLine ();
		String palabra2 = enter.nextLine ();
		terminar ( palabra1, palabra2);
		enter.close();
	}

}
