package tarea2;

import java.util.Scanner;

public class Ejeercicio10 {
	/** 10. Escribe un programa Java que devuelva los N números de la Sucesión de Fibonacci
	 *  (donde N es un número entero seleccionado por el usuario). 
	 *  Para realizar este ejercicio primero debes conocer qué es la Sucesión de Fibonacci y
	 *   cómo funciona.
	 */
	public static void main(String[] args) {
		Scanner enter= new Scanner (System.in); 
		int x = 0;
		int y = 1;
		int contador = 2;
		System.out.println ("Este ejercicio devuelve por teclado los numeros de la "
				+ "serie de Fibonacci en funcion de un numero.");
		System.out.println ("Por favor, introduce un numero entero: ");
		int num=enter.nextInt ();
		if (num <= 1) {
			System.out.println ("Por favor, introduzca un numero mayor que el numero (1), vuelva a iniciar el programa.");
		}else if (num >= contador) { 
			System.out.println ("La sucesion de Fibonacci incluye los numeros: ");
			System.out.println (x);
			System.out.println (y);
			while (contador < num) {
				int serie = x + y; //sumo el valor actual de las variables//
				System.out.println (serie);
				x = y; y = serie; //actualizo las variables iniciales x,y,contador
				contador = contador + 1;
			}	
		enter.close ();
		}
	}
}
