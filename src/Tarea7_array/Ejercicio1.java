package Tarea7_array;

import java.util.Scanner;
public class Ejercicio1 {
	
	/* Pre:..
	 * Post: Implementa un programa Java con un método llamado
	 *       sum(int [] tabla) que muestre por pantalla el resultado de sumar todos los
	 *		 elementos de la tabla pasada como parámetro.
	 */
	public static int sumatabla (int [] tabla)  {
		int suma=0;
		for (int i =0; i<tabla.length; i++) {
			suma = suma + tabla[i];
		}
		return(suma);
	}
	
	
	public static void main(String[] args) {
		Scanner enter=new Scanner (System.in);
		System.out.println ("Introduce un numero para definir el tamaño de la tabla: ");
		int longitud = enter.nextInt ();
		int [] tabla = new int [longitud];
		for (int i=0 ; i<tabla.length; i++) {
			System.out.println ("Introduce un numero entero positivo o negativo: ");
			tabla [i]= enter.nextInt ();
		}
		System.out.println ("La suma de todos los elementos es: " + sumatabla (tabla));	
		enter.close();
		
	}

}
