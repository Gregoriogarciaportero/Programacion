package Tarea1;

import java.util.Scanner;

public class Ejercicio5 {

	/**Implementa un programa Java que PREGUNTE al usuario por dos
		n�meros enteros (x, y) y muestre por pantalla la suma, resta,
		multiplicaci�n, divisi�n y resto de ambos, con el siguiente formato:
		x + y = �
		x � y = �
		x * y = �
		x / y = �
	    x % y = �
	 */
	public static void main (String [] args) {
		
		 Scanner EntradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner//
		 System.out.println("Introduce un n�mero: ");
		 double x = EntradaEscaner.nextDouble () ;
		 System.out.println("Introduce otro n�mero: ");
		 double y = EntradaEscaner.nextDouble();
		 double suma = x + y; 
		 double resta = x - y;
		 double multiplicacion = x*y;
		 double division = x/y;
		 double resto = x % y;
		 System.out.println("La suma de los n�meros es: "+suma);
		 System.out.println("La resta de los n�meros es: "+resta);
		 System.out.println("La multiplicaci�n de los n�meros es: "+multiplicacion);
		 System.out.println("La divisi�n de " + x + " y " + y + " es: " + division);
		 System.out.println("El resto de la division " + x + " y " + y + " es: " + resto);
		 EntradaEscaner.close ();
		}
}
