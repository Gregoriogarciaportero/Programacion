package Tarea24_ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

	/* Pre:..
	 * Post: Implementa un programa Java que actualice el valor de
	 * un elemento específico de un ArrayList de datos String.
	 */
public class Ejercicio4 {
	public static void main (String [] args) {
		Scanner enter = new Scanner (System.in);
		ArrayList <String> colores = new ArrayList<String>();
		colores.add (" Amarillo ");
		colores.add (" Rojo "); 
		colores.add ("Verde");
		colores.add ("Azul");
		colores.add ("Violeta");
		colores.add ("Naranja");
		colores.add ("Añil");
		System.out.println ("Los colores de mi tabla son : ");
		for (int i = 0 ; i < colores.size (); i++) {
			System.out.println (colores.get(i));
		}
		System.out.println ("Introduce el nuevocolor para insertar en la tabla de colores: ");
		String newcolor = enter.nextLine ();
		System.out.println ("Introduce el color por el que quieres sustituir: ");
		String eliminarcolor = enter.nextLine ();
		
		for (int i = 0 ; i < colores.size (); i++) {
			// Con el comando .trim no tiene en cuenta los espacios en blanco del String
			if (colores.get(i).trim().equalsIgnoreCase (eliminarcolor.trim())) {
				 
				 colores.remove (i);
				 colores.add(i,newcolor);
			}
		}
		System.out.println ("Los nuevos colores de la tabla son: ");
		for (int i = 0 ; i < colores.size (); i++) {
			System.out.println (colores.get(i));
		}
		enter.close();
	}
}
