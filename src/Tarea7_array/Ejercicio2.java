package Tarea7_array;

import java.util.Scanner;

public class Ejercicio2 {
	
	/* Pre:..
	 * Post: Implementa un programa Java con un método llamado
	 *	   	 average(double [] tabla) que devuelva un dato de tipo double, que
	 *		 indique la media de los valores de los elementos de la tabla pasada como
	 *		 parámetro.
	 */

	public static double average (double [] tabla ) {

		double suma = 0;
		for (int i=0; i<tabla.length; i++) {
			suma = suma + tabla[i];
		}
		double a = suma / tabla.length;
		return a;
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		
		System.out.printf("Introduce el tamaño de la tabla unidimensional: ");
		int longitud = enter.nextInt ();
		double [] tabla = new double [longitud];
		for (int i=0; i<tabla.length; i++) {
			System.out.println (" Introduce los valores de la tabla: ");
			tabla [i]= enter.nextInt ();
		}
		System.out.println (" La media de los numeros introducidos es :"+average (tabla));
		
		enter.close();
	}

}
