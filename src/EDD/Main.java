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
		System.out.println("Gregorio García Portero");
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
		
		EjercicioX.llamar();
	}

}
