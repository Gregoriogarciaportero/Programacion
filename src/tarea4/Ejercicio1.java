package tarea4;

import java.util.Scanner;

public class Ejercicio1 {
	/* Pre:..
	 * Post: Implementa un programa Java que lea un número real (decimales) y
		muestre su cuadrado. Repetir el proceso hasta que se introduzca un
		número negativo.
	 */
	public static double cuadrado (double a) { //Metodo para hacer el cuadrado de un numero
		return a*a;
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce un numero positivo por teclado: ");
		double num = enter.nextDouble ();
		if (num>0) { //condicion si el numero introducido es mayor que cero
			System.out.println("El cuadrado del numero: " + num+ "es: " + cuadrado(num));  //imprime el cuadrado del numero introducido
			while (num>0) { //bucle que termina cuando el numero introducido es igual o menor que cero
				System.out.println("Introduce un numero por teclado: ");
				double num1=enter.nextDouble ();				
				if (num1 > 0) {
					double num2 = cuadrado (num1);
					System.out.println("El cuadrado del numero: " + num1+ "es: " + num2);
				} else if (num1==0) {
					System.out.println("El cuadrado de nada es nada, entiendes o no? Termino el programa, gracias.");					
				} else if (num1 < 0) {
					System.out.println("Se termino el programa por introducir un numero negativo. Gracias. ");
				}
				num=num1;
			}
		} else {
			System.out.println("Si lo desea, vuelva a ejecutar el programa."); //mensaje de que termina el programa
		} enter.close();
	}
}


