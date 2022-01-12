package tarea5_string;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Pre: 
	 * Post: Implementa un programa Java que acepte 4 enteros por parte del usuario
	 *       y muestre por la pantalla la palabra “Igual” si los 4 enteros son iguales.
	 */
	public static int solicitar() { //metodo para solicitar numeros al usuario
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce un numero entero por teclado");
		int a=enter.nextInt();
		return (a);	
	}
	public static void main(String[] args) {
		int a = solicitar (); //declaro las variables a comparar y invoco al método
		int b = solicitar ();
		int c = solicitar ();
		int d = solicitar ();
		if (a==b && b==c && c==d) { //condicion para imprimir. Deben ser iguales 
			System.out.println("Los numeros introducidos son iguales.");
		} else { //impresion en el caso de que no seann iguales
			System.out.println("los numeros introducidos no son iguales.");
		}
	}		
}	

