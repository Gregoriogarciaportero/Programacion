package Tarea8_array;

import java.util.Scanner;

	/*
	 * Pre: ...
	 * Post: Implementa un método Java llamado incrementarValores, el
	 * 		 cual recibe una tabla y un valor numérico, y devuelve todos los elementos
	 *		 de la tabla multiplicados por dicho valor, excepto el primero y el último.
	 */

public class Ejercicio2 {

	/*
	 * Pre: ...
	 * Post: El método recorre la tabla desde la segunda celda hasta 
	 * la penultima, multiplicando cada valor de la celda por el numero 
	 * que se envía al método.
	 */
	public static int [] incrementarValores( int tabla [], int a) {
		for (int i=0; i<tabla.length; i++) {
			if (i>0 && i<tabla.length-1) {
				tabla[i]=tabla[i]*a;
			}
		}
		return tabla ;
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Introduce 10 numeros enteros del 1 al 10, para completar la tabla: ");
		int [] tabla = new int [10];
			for (int i=0; i<10; i++) {
			tabla[i]  = enter.nextInt ();
			}		
		System.out.println ("Introduce un numero entero: ");
		int num = enter.nextInt ();
		incrementarValores ( tabla, num);
		System.out.println ("Los valores de la nueva tabla son: ");
		for (int i=0; i<tabla.length; i++) {
			System.out.print (" "+tabla[i]);
		}
		enter.close();
	}

}
