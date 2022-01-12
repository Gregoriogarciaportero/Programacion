package tarea2;

import java.util.Scanner;

public class Ejercicio8 {
	/** 
	 * Pre:
	 * Post: Escribe un programa Java que pregunte al usuario por 10 n�meros enteros y 
	 * muestre por pantalla el n�mero mayor y el menor de todos los introducidos
	 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in); //Creaci�n de un objeto Scanner//
		int contador = 1;
		System.out.println("Introduce un n�mero entero: "); 
		int mayor=enter.nextInt(); 
		int menor=mayor;
		while (contador<10) {
			System.out.println("Introduce otro n�mero entero: "); 
			int num=enter.nextInt();
			if (num>=mayor){
				mayor=num;
			} else if (num<=menor) { /** Usar else if para ahorrar tiempo en ejecuci�n ya que la 
										* ejecuc�on no entra.
										*/
				menor=num;
			}
			contador=contador+1;
		}
		System.out.println("El numero mayor de los 10 numeros enteros introducidos es: " + mayor);                                                      
	    System.out.println("El numero menor de los 10 numeros enteros introducidos es: " + menor);
	    enter.close ();
	}
}
