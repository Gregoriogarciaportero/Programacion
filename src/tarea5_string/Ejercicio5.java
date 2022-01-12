package tarea5_string;

import java.util.Scanner;

public class Ejercicio5 {
	/* Pre:...
	 * Post: Implementa un programa Java que solicite al usuario una cadena de
	 *       caracteres (String) y muestre por pantalla el número de veces que
	 *       aparece la sub-cadena “aaa” dentro de dicho String.
	 *		 Ej: usuario introduce “aabaabaababababaa” –> el resultado debe ser:
	 *		 “Número de veces que aparece aa: 4”
	 */
	public static int rastrear (String palabra) { //Metodo para buscar los grupos de (aaa)
		int numveces=0; //declaro la variable contador "aaa"
		int i=0;
		while ( i<palabra.length()-2) { //Bucle que rastrea hasta que se termina el tamaño de la cadena
			String subcadena = ("aaa"); //grupo a buscar en la variable string cadena
			String substring = palabra.substring (i, i+3); //grupo de la cadena a comparar con (aaa)
			if (substring.equals(subcadena)) { //condicion el grupo substring lo comparo 
				numveces++; // si el substring que comparo es igual a "aaa", sumo uno	
			}
			i++; //actualizo a la variable iteracion 
		}
		return (numveces); //devuelvo la variable contador
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce una cadena de 10 caracteres: ");
		String cadena = enter.nextLine (); // Declaro la variable String de la cadena introducida
		System.out.println ("El numero de veces que aparece (aaa) es: "+ rastrear (cadena)); //Llamo al metodo al imprimir
		enter.close();
		}	
}
