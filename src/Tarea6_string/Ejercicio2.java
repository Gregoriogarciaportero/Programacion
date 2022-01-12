package Tarea6_string;

import java.util.Scanner;

public class Ejercicio2 {

		/* Pre: ..
		 * Post: Escribe un programa Java que muestre los números del 1 al 110, con 11
		 *       números por línea. El programa deberá escribir por pantalla “Coza” en
		 *		 lugar de los números múltiplos de 3, “Loza” en lugar de los números
		 *       múltiplos de 5, “Woza” en lugar de los números múltiplos de 7 y
		 *       “CozaLoza” en lugar de los números múltiplos de 3 y 5. El resultado debe
		 *       ser similar al siguiente:
		 *		 1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
		 *       Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
		 *		 23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
		 *		 ......
		 */
	
	/* Pre:..
	 * Post: Este metodo recibe el numero que hay que analizar
	 * y estudia si es divisor de 3 y 5, 3 y 7, 7, 5 o 3.
	 * En caso afirmativo cambia el numero por una cadena de 
	 * caracteres y si no lo es de ninguno, entonces
	 * devuelve el numero para su impresion.
	 */
	public static String primo (int a) {
		
		String sustituir= String.valueOf(a);
		if (a%3==0 && a%5==0) {
			sustituir = "cozaloza";
		} else if (a%3==0 && a%7==0) {
			sustituir = "cozawoza";
		} else if (a%5==0 && a%7==0){
			sustituir = "lozaworza";
		} else if (a%3==0) {
			sustituir = "coza";
		} else if (a%5==0) {
			sustituir = "loza";
		} else if (a%7==0) {
			sustituir = "woza";
		} return (sustituir);
	}
	
	
	public static void main (String[] args) {
		Scanner enter = new Scanner (System.in);
		for (int i = 1; i <= 110 ; i++) {
				System.out.print(primo(i)+" ");	
				if (i%11==0) {
					System.out.println();
			}
		}
		enter.close();
	}
}
