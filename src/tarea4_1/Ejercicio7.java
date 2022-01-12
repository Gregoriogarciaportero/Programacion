package tarea4_1;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Pre:...
	 * Post: 7. Escribe un programa Java que pregunte al usuario por un número entero
	 *  y muestre por pantalla su tabla de multiplicar
	 */
	
	public static void multiplicar (int a, int b) { 
		// Metodo para sacar por pantalla la plantilla de una fila de la tabla de multiplicar
		System.out.println(b + " * " + a + " = " + a*b);
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce un número entero por teclado, para tener su tablar de multiplicar:");
		int num=enter.nextInt();
		for (int i=1; i<=10; i++ ) { //El bucle llama 10 veces al metodo multilplicar
			multiplicar (i,num);
		}enter.close();
	}
	
}
