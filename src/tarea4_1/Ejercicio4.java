package tarea4_1;

import java.util.Scanner;


public class Ejercicio4 {
	/* Pre:..
	 * Post: 4. Escribe un programa Java que pregunte al usuario por 2 números, 
	 * y te muestre por pantalla todos los números situados entre ambos
	 */
	public static void mostrar (int a) { //Metodo para imprimir por pantalla
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Scanner enter=new Scanner (System.in);
		System.out.println ("Introduce un numero entero por teclado, por favor: ");
		int num1=enter.nextInt ();
		System.out.println("Introduce otro número entero por teclado:");
		int num2=enter.nextInt ();
		for (int i=num1+1; i<num2; i++) { //Bucle con rango entre los valores introducidos
			mostrar (i); //Invoco al metodo mostrar
		}
		enter.close();
	} 
}
