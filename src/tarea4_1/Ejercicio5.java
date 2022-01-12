package tarea4_1;

import java.util.Scanner;

public class Ejercicio5 {
	/* Pre:...
	 * Post: 5. Escribe un programa Java que muestre los números pares entre 0 y 100
	 */
	public static void par (int a) { //metodo para imprimir por pantalla
		if (a%2==0) {
			System.out.println("El número "+a+ " es par.");
		}
	}
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce un numero entero por teclado:");
		int num1 = enter.nextInt ();
		System.out.println("Introduce otro numero entero por teclado:");
		int num2 = enter.nextInt ();
		if (num1<num2) { //Condicion si el primer valor es menor que el segundo
			for (int i=num1; i<=num2; i++) { //bucle con el rango entre num1 y num2
			par (i); //Invoco al metodo par para imprimir
			}
		}else { //Condicion si el primer valor es mayor que el segundo
			for (int i=num2; i<=num1; i++) {
				par (i); //Invoco al metodo par para imprimir
			}
		}
		enter.close();
		}	
	}
