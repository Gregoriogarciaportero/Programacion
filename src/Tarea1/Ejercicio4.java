package Tarea1;

import java.util.Scanner;

public class Ejercicio4 {
	/** Implementa un programa Java que PREGUNTE al usuario por dos
		n�meros enteros (x, y) y muestre por pantalla la suma de ambos.
	 */
	public static void main (String [] args ) {
	    Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
	    System.out.println("Introduce un n�mero: ");
	    int x = entradaEscaner.nextInt () ;
	    System.out.println("Introduce otro n�mero: ");
	    int y = entradaEscaner.nextInt(); 
	    int suma = x + y; 
		System.out.println("la suma de los n�meros es: "+suma);
		entradaEscaner.close();
	    }
}
