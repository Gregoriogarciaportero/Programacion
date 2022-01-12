package tarea5_string;

import java.util.Scanner;

public class Ejercicio6 {

	/* Pre:...
	 * Post: Implementa un programa Java que solicite al usuario una cadena de
	 * caracteres (String) y muestre por pantalla dicha cadena, pero con el
	 * primer y último carácter cambiados de posición.
	 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce una cadena de caracteres por teclado: ");
		String cadena = enter.nextLine(); //Declaro variable cadena y asigno palabra introducida
		String primcaracter = cadena.substring(0, 1 ); //Declaro variable y asigno primer caracter
		String intcaracter = cadena.substring(1, cadena.length()-1);//Declaro variable y asigno caract. intermedios
		String ultcaracter = cadena.substring(cadena.length ()-1); //Declaro variable y asigno ultimo caracter
		System.out.println(ultcaracter+intcaracter+primcaracter); //Imprimo en orden segun el problema plnateado
	 enter.close();
	}
}

