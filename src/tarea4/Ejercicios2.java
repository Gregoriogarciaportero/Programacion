package tarea4;

import java.util.Scanner;

public class Ejercicios2 {
	/* Pre:...
	 * Post: Implementa un programa Java que lea un número real (decimales) e
		indique si es positivo o negativo. El proceso se repetirá hasta que se
		introduzca un 0.
	 *
	 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce un numero por teclado: ");
		double num= enter.nextDouble (); //Declaro la variable y le doy valor introducido por teclado
		while (num!=0) {	// bucle si es num es distinto a cero	
			if (num > 0) { //si es positivo informa por pantalla que es positivo
			System.out.println("El numero introducido " + num + "es positivo.");
			} else  {//si es positivo informa por pantalla que es negativo
				System.out.println("El numero introducido " + num + "es negativo." );					
			}
			System.out.println("Introduce otro numero por teclado:"); //solicita otro numero
			num= enter.nextDouble ();
		} // información al salir del bucle por introducir un cero
		System.out.println("Termino el programa por introducir el " + num + ". Si lo desea, vuelva a ejecutar el programa."); 
		enter.close();
	} 			
}


	


