package Tarea6_string;

import java.util.Scanner;

public class Ejercicio3 {

	/* Pre:
	 * Post: Escribe un programa Java que solicite al usuario un entero N y
	 * escriba el siguiente patr�n por pantalla:
	 * Enter an integer from 3 to 10: 7
	 * *******
	 * ******
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 */
	
	public static void main(String[] args) {
		Scanner enter=new Scanner(System.in);
		System.out.println("Introduzca un entero, entre 5 y 20, para empezar la impresi�n: ");
		int a = enter.nextInt ();
		for(int i=a; i>0; i--) { 
			/* Bucle que controla las lineas de impresi�n
			 * va restando del caracter a hast llegar a una.
			 */
			for (int ii =0; ii<i; ii++) {
			/*  Bucle para empezar con una linea con (a) caracteres
			 * e ir restando hasta llegar a 1 caracter 
			 */
				System.out.print("*");
			}
			System.out.println("");
		}
		enter.close();
	}
}
