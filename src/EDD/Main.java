package EDD;

import java.util.Scanner;

/*
	 * Pre:..
	 * Post: Ejercicio EDD
	 * Escribe un programa en Java, el que sea:
	 * Refactoriza para cambiar el nombre de la clase y de las variables utilizadas.
	 * Realiza capturas de pantalla y escribe un breve tutorial.
	 */
public class Main {

	public static void main(String[] args) {
		System.out.println("HOLA");
		System.out.println("Gregorio Garc�a Portero");
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
		
		EjercicioX.llamar();
	}

}
