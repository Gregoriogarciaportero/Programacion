package tarea5_string;

import java.util.Scanner;

public class Ejercicio11 {

	/* Pre: ...
	 * Post: Implementa un programa Java que solicite al usuario una cadena de
	*        caracteres y devuelva dicha cadena, pero al revés.
	 * 
	 */
	public static void main(String[] args) {
		Scanner enter=new Scanner(System.in);
		System.out.println( " Introduce una palabra esdrujula:");
		String palabra = enter.nextLine(); //Leo la palabra introducida 
		int i = palabra.length()-1; //restamos una unidad al tamaño de la palabra, se asume el cero
		String palabrareves = ""; //declaro la nueva variable que voy a crear al dar la vuelta
		while (i>=0) { //El bucle lee el string desde el principio 
			palabrareves = palabrareves + palabra.charAt(i); //acumulo los caracteres en la nueva var.
			i--;	
		}	
		System.out.println(palabrareves);
		enter.close();
	}	
}	
		


		
		
