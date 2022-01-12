package Tarea1;

import java.util.Scanner;

public class Ejercicio5 {

	/**Implementa un programa Java que PREGUNTE al usuario por dos
		números enteros (x, y) y muestre por pantalla la suma, resta,
		multiplicación, división y resto de ambos, con el siguiente formato:
		x + y = …
		x – y = …
		x * y = …
		x / y = …
	    x % y = …
	 */
	public static void main (String [] args) {
		
		 Scanner EntradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner//
		 System.out.println("Introduce un número: ");
		 double x = EntradaEscaner.nextDouble () ;
		 System.out.println("Introduce otro número: ");
		 double y = EntradaEscaner.nextDouble();
		 double suma = x + y; 
		 double resta = x - y;
		 double multiplicacion = x*y;
		 double division = x/y;
		 double resto = x % y;
		 System.out.println("La suma de los números es: "+suma);
		 System.out.println("La resta de los números es: "+resta);
		 System.out.println("La multiplicación de los números es: "+multiplicacion);
		 System.out.println("La división de " + x + " y " + y + " es: " + division);
		 System.out.println("El resto de la division " + x + " y " + y + " es: " + resto);
		 EntradaEscaner.close ();
		}
}
