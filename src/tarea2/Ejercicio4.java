package tarea2;

import java.util.Scanner;

public class Ejercicio4 {
	/** 4. Escribe un programa Java que pregunte al usuario por 2 números, 
	 * y te muestre por pantalla todos los números situados entre ambos.
	 */
	public static void main (String [] args) {
		Scanner enter = new Scanner (System.in); //Creación de un objeto Scanner//
		System.out.println("Introduce un primer numero entero: ");
		int i =enter.nextInt ();
		System.out.println("Introduce un segundo numero entero: ");
		int j =enter.nextInt ();
		if (i<j) { //Caso que el primer numero sea menor que el segundo numero numero//
			int numero=i;
			while (numero<j-1) {
				numero=numero+1;
				System.out.println(numero);
			}
		}else { //Caso que el primer numero sea mayor que el segundo//
			int numero=j;
			while (numero<i-1) {
				numero=numero+1;
				System.out.println(numero);
		}
		enter.close();
		}
	}
}
