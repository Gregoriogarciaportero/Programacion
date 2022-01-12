package Tarea11_repaso_gregorio;

import java.util.Scanner;
	/*
	 * Pre:..
	 * Post: Escribe un programa Java que compare dos enteros
	 *		 1º entero: 25
	 *		 2º entero: 39
	 *		 25 != 39
	 *		 25 < 39
	 *		 25 <= 39
	 */
public class Ejercicio9 {
	
	public static void comparar (int a, int b) {
		System.out.println ("1º entero: " + a);
		System.out.println ("2º entero: " + b);
		if (a != b) {
			System.out.println ( a + " != "+ b);	
			if (a < b) {
				System.out.println (a +" < " + b);
				if (a <= b ) {
					System.out.println (a + " <= " + b);
				}
			}
			else if(b < a) {
				System.out.println (b +" < " + a);
				if (b <= a ) {
					System.out.println (b + " <= " + a);
				}
			} else {
				System.out.println ( a + " != "+ b);
				System.out.println (a + " <= " + b);
				System.out.println (a + " <= " + b);
			}
		}
	}
	public static void main(String[] args) {
		Scanner enter= new Scanner (System.in);
		System.out.println(" Introduce dos enteros por teclado");
		int entero1 = enter.nextInt ();
		int entero2 = enter.nextInt ();
		comparar (entero1, entero2);
		enter.close();
	}

}
