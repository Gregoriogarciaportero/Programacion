package tarea5_string;

import java.util.Scanner;

public class Ejercicio4 {
	/* Pre:..
	 * Post:Implementa un programa Java que solicite al usuario una cadena de
	 *	caracteres (String) y muestre por pantalla la longitud de esta.
	 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce una cadena frase, por favor");
		String cadena = enter.nextLine(); //Declaro la variable cadena y le asigno la frase
		System.out.println ("El numero de caracteres de la frase es :"+ cadena.length ());
		// Se imprime por pantalla el numero de caracteres de la frase
		enter.close ();
	}
}
