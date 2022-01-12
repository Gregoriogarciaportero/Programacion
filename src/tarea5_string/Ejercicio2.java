package tarea5_string;

import java.util.Scanner;

public class Ejercicio2 {
	/* Pre:..
	 * Post: Implementa un programa Java que solicite al usuario dos números reales
	 *	 y muestre TRUE o FALSE dependiendo de si ambos están entre 0.0 y 1.0.
	 */
	public static void main(String[] args) {
		Scanner enter=new Scanner (System.in); 
		System.out.println ("Introduce dos numeros por teclado ");
		double num1= enter.nextDouble();
		double num2= enter.nextDouble();
		if (num1>0 && 1>num1 && num2>0 && 1>num2) { //condicion para mostrar "true"
			System.out.println("True");
		} else  {
			System.out.println("False");
		}
		enter.close();
	}

}
