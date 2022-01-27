package Tarea24_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;




	/* Pre:..
	 * Post: Implementa un programa Java que inserte un elemento
	 * en la primera posición de un ArrayList de datos String.
	 */
public class Ejercicio2 {

	public static void insertar (String newcolor, ArrayList colores) {
		colores.add(0, newcolor);
		System.out.println ("Los nuevos colores de mi nueva tabla son: ");
		for ( int i = 0 ; i < colores.size (); i++) {
			System.out.println (colores.get(i));
		}	
	}
	public static void main  (String [] args) {
		Scanner enter = new Scanner (System.in);
		ArrayList <String> colores = new ArrayList<String>();
		colores.add ("Amarillo ");
		colores.add ("Rojo ");
		colores.add ("Verde ");
		colores.add ("Azul ");
		colores.add ("Violeta ");
		colores.add ("Naranja ");
		colores.add ("Añil ");
		System.out.println ("Los colores de mi tabla son : ");
		for (int i = 0 ; i < colores.size (); i++) {
			System.out.println (colores.get(i));
		}
		System.out.println ("Introduce un nuevo color: ");
		String newcolor = enter.nextLine (); 
		insertar (newcolor, colores);
			
	}
}

	

