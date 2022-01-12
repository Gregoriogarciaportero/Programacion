package Tarea8_array;

import java.util.Scanner;

	/*
	 * Pre:..
	 * Post: Implementa un método Java llamado calcularModa que
	 *		 calcule la moda de una tabla Java. La moda es el valor con mayor
	 *		 frecuencia que aparece en una colección de datos. Por ejemplo, si
	 *		 tenemos la tabla: {1, 1, 2, 1, 4, 1, 2, 1} la moda es 1.
	 */
public class Ejercicio1 {

	/*
	 * Pre:..
	 * Post:Metodo que recorre la tabla de numeros y obtiene la moda,
	 * es decir, el numero de la tabla que mas se repite.
	 */
	public static void calcularModa(int [] tabla) {
		int moda=0;
		int contadortabla=0;
		int contadormoda=0;
		for (int i=0; i<tabla.length; i++){ //recorre la tabla enviada al metodo
			moda = tabla [i]; //Asigno al valor de la moda el numero de la tabla de la i del bucle
			for (int j=0; j<tabla.length; j++) { 
				/* Recorre el bucle comparando el valor asignado a la moda
				 * con cada elemento de la tabla, incrementando una unidad en 
				 * el caso de ser iguales.
				 */
				if (tabla[i] == moda) {
				contadortabla = contadortabla + 1;
				}
			} // Esta condición es para renovar el valor de la moda
			if (contadortabla>contadormoda) {
				moda=tabla[i];
			}
		}
		System.out.println ("El valor (moda) de la tabla es: "+moda);
	}
	
	
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Introduce 20 numeros enteros del 1 al 20. "
				+ " Obligatorio repitir numeros: ");
			int [] tabla = new int [20];
		for (int i=0; i<20; i++) {
			tabla[i]  = enter.nextInt ();
		}			calcularModa (tabla);
	enter.close();
	}
}
