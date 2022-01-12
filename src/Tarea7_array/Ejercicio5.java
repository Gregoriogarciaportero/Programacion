package Tarea7_array;

import java.util.Scanner;

public class Ejercicio5 {

	/* Pre: ....
	 * Post: Implementa un programa Java con un método llamado
	 *   	 copyArray(String[] tabla, String[] tabla2) que devuelva “tabla2” con los
	 *		 mismos valores de “tabla”. Es decir, el programa debe copiar el contenido
	 *		 de una tabla en otra.
	 */
	
	public static String [] copyArray (String [] tabla, String []tabla2) {
		// Metodo para copiar los valores de una tabla en otra.
		for (int i = 0; i<tabla2.length; i++) { //Bucle para recorre la primera tabla.
			tabla2 [i]=tabla [i]; // Paso los valores de la primera a la segunda tabla.
		}
		return tabla2; // Devuelvo al main la tabla copiada
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		String [] tabla = new String [4]; // Creo la primera tabla
		tabla [0] = "otonyo"; // Asigno valores a las celdas o posiciones de la tabla
		tabla [1] = "invierno";
		tabla [2] = "primavera";
		tabla [3] = "verano";
		String [] tabla2 = new String[tabla.length]; // Creo la segunda tabla2
		tabla2 = copyArray (tabla, tabla2); // Llamo al metodo para copiar la tabla
		for (int i = 0; i<tabla2.length; i++) { // Bucle que recorre la tabla y voy mostrando por pantalla.
			System.out.println ("La tabla copiada tiene en la posición "+ (i+1) +" el valor: "  + tabla2[i]);
		}
		enter.close();
	}
}



  