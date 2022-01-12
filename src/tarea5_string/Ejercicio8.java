package tarea5_string;

import java.util.Scanner;

public class Ejercicio8 {
	/* Pre:..
	 * Post: Implementa un programa Java que genere números randoms entre N y M
	 *  	 (incluidos). Los valores de N y M son números enteros introducidos por el usuario. 
	 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce dos numeros enteros: ");
		int M = enter.nextInt (); //Declaro la variable del limite inferior
		int N = enter.nextInt (); //Declaro la variable del limite superior
		int x= (int)Math.floor(Math.random()* ( N - M +1) + M); //Crea un numero aleatorio entre N y M, incluidos
		System.out.println ("El número aleatorio es : "+x); 
		enter.close ();
	}
}
