package Tarea1;

import java.util.Scanner;

public class Ejercicio4 {
	/** Implementa un programa Java que PREGUNTE al usuario por dos
		números enteros (x, y) y muestre por pantalla la suma de ambos.
	 */
	public static void main (String [] args ) {
	    Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
	    System.out.println("Introduce un número: ");
	    int x = entradaEscaner.nextInt () ;
	    System.out.println("Introduce otro número: ");
	    int y = entradaEscaner.nextInt(); 
	    int suma = x + y; 
		System.out.println("la suma de los números es: "+suma);
		entradaEscaner.close();
	    }
}
