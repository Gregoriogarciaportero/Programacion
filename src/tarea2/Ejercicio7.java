package tarea2;

import java.util.Scanner;

public class Ejercicio7 {
	/** 
	 * Pre:
	 * Post: 7. Escribe un programa Java que pregunte al usuario por un n�mero entero y
	 * muestre por pantalla su tabla de multiplicar
	 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in); //Creaci�n de un objeto Scanner//
		System.out.println("Introduce un n�mero entero distinto de cero: ");                                                       
	    int num = enter.nextInt();
	    System.out.println("La tabla de multiplicar del numero " + num + " es: ");
	    int i=1;
	    while (i<=10) {
	    	System.out.println(num + " * " + i + " = " + (num*i)); //Las operaciones en par�ntesis//
	    	i=i+1;
	    }
	    enter.close ();
	}
}
