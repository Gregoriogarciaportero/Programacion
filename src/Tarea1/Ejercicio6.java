package Tarea1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main (String [] args) {
		/**Implementa un programa Java que PREGUNTE al usuario por un número
			entero (x) y muestre por pantalla su tabla de multiplicar, con el siguiente
			formato:
			La tabla de multiplicar del número 2 es la siguiente:
				2 x 1 = 2
				2 x 2 = 4
		 		(...) 
		 */
		Scanner sc = new Scanner (System.in); //Creación de un objeto Scanner//
		System.out.println("Introduce un número entero del 1 al 9, inclusives: ");                                                       
	    int x = sc.nextInt();
	    System.out.println("La tabla de multiplicar del numero " + x + " es: ");
	    for(int i = 1; i<=10; i++){
	    System.out.println(x + " * " + i + " = " + x*i);
	    sc.close ();
	    }
	}
}
	   

