package Tarea7_array;

import java.util.Scanner;

public class Ejercicio3 {

	/* Pre:..
	 * Post:Implementa un programa Java con un método llamado
	 *     	contains(String[] tabla, String cadena) que devuelva TRUE, sí o solo sí,
	 *		alguno de los elementos de la tabla pasada como parámetro es igual al
	 *		valor de la variable “cadena”.
	 */
	
	public static boolean contains (String [] tabla, String cadena) { 
		
		/* Metodo para encontrar el animal en la tabla creada en el metodo main
		 * le envio la tabla de animales y el animal introducido por el usuario. 
		 */
		
		boolean escierto=false; // Declaro la variable boolean como false
		for (int i=0; i<tabla.length; i++) {
			/* Bucle para recorrer la tabla desde la posicion 0 hasta length-1
			 * La condición para cambiar la variable "escierto" a true es que
			 * el aninal introducido sea igual a un parámetro de la tabla
			 */
			if (tabla[i].equals(cadena)) { 
				escierto=true;
			}
		}
		return escierto; //Devuelvo el valor de escierto
	}
	public static void main (String[] args) {
		Scanner enter = new Scanner (System.in);
		String [] tabla = new String [8]; // Creo la tabla y asigno valores a cada celda
		tabla [0] = "perro";
		tabla [1] = "gorrion";
		tabla [2] = "comadreja";
		tabla [3] = "uron";
		tabla [4] = "tortuga";
		tabla [5] = "gato" ;
		tabla [6] = "pez";
		tabla [7] = "periquito";
		
		// Solocito al usuario que introduzca un animal para encontrarlo en la tabla creada.
		System.out.println ("Introduce un nombre de animal domestico que pienses que esta "
				+ "en la tabla animales: "); 
		
		// Declaro la variabe cadena con el valor introducido por el usuario
		String cadena = enter.nextLine ();
		
		// Condiciones para imprimir por pantalla SI esta o NO esta el animal en la tabla
		if (contains (tabla, cadena)){
			System.out.println ("El animal introducido por teclado ESTA en la tabla");	
		} else {
			System.out.println ("El animal introducido por teclado NO ESTA en la tabla");	
		}
		enter.close ();
	}
}


