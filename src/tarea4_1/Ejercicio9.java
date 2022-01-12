package tarea4_1;

import java.util.Scanner;

public class Ejercicio9 {
	/* Pre:..
	 * Post: Escribe un programa Java que pregunte al usuario por 10 números enteros y
	 * muestre por pantalla el número total de veces que el usuario ha introducido el 0, 
	 * el número total de enteros mayores que 0 introducidos y el número total de 
	 * enteros menores que 0 introducidos.
	 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		int ceros = 0;		// Declaro las variables contadores
		int pos = 0;
		int neg = 0;
		for (int i=0; i<10; i++) { // Bucle para solicitar 10 enteros
			System.out.println("Introduce un numero entero: ");
			int num=enter.nextInt ();
			if (num>0) { //Actualizo contador positivos
				pos++;
			} else if (num<0) { //Actualizo contador negativos
				neg++;
			} else { //Actualizo contador ceros
				ceros++;
			}	
		}  // Imprimo por pantalla el valor de los contadores
		System.out.println("El numero de ceros introcidos es: " + ceros);  
		System.out.println("El numero de positivos introcidos es: " + pos);
		System.out.println("El numero de negativos intrucidos es: " + neg);
		enter.close();
	}

}
