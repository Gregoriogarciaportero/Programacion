package tarea5_string;

import java.util.Scanner;

public class Ejercicio3 {
	/* Pre:...
	 * Post: Implementa un programa Java que solicite al usuario una cadena de
	 *		 caracteres (String) y muestre por pantalla dicha cadena sin el último
	 *   	 caracter.
	 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce una palabra esdrujula");
		String cadena = enter.nextLine ();
		String subcadena=cadena.substring (0, cadena.length()-1);
		System.out.println (subcadena);		
	}

}
