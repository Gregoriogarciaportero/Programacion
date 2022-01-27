package Tarea23;

import java.util.ArrayList;
import java.util.Scanner;

/*
	 * Pre:..
	 * Post:Implementa un programa Java que muestre por pantalla
	 * el valor de un elemento específico (debes indicar el índice) de un
	 * ArrayList de datos String.
	 */

	public class Ejercicio3 {
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
		
		
		
	}
