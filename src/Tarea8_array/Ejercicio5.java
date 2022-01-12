package Tarea8_array;

import java.util.Scanner;

	/*
	 * Pre:..
	 * Post: Implementa un m�todo Java llamado mayorYmenor, el cual
	 *		 recibe como par�metro una tabla de Strings y muestra por pantalla el
	 *		 String con mayor longitud y el String con menor longitud.
	 */
public class Ejercicio5 {

	/*
	 * Pre: ..
	 * Post: Este m�todo cuenta los caracteres de una celda de una array.
	 * A la vez va guardado la posici�n de la palabra con m�s o menos 
	 * caracteres para imprimirla al finalizar.
	 */
	public static void mayorYmenor (String [] tabla) {
		int mayor = tabla[0].length();
		int menor = tabla[0].length();
		int posMayor=0;
		int posMenor=0;
		
		for (int i =0; i<tabla.length; i++) {
			int length = tabla[i].length();
			if (length >= mayor) { //Condici�n del valor analizado sea mayor que el acumulado
				mayor = tabla[i].length();
				posMayor=i;
			}else if (length <= menor) { //Condici�n del valor analizado sea menor que el acumulado
				menor = tabla[i].length();
				posMenor=i;
			}
		}
		System.out.println("La ciudad con el nombre m�s largo es: "+tabla[posMayor]);
		System.out.println("La ciudad con el nombre m�s corto es: "+tabla[posMenor]);
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce el nombre de seis provincias de Espa�a: ");
		String [] tabla = new String [6];
		for (int i =0; i<tabla.length; i++) {
			tabla[i]=enter.nextLine();
		}
		mayorYmenor (tabla);
		enter.close ();
	}

}
