package Tarea8_array;

import java.util.Scanner;

	/*
	 * Pre:..
	 * Post: Este ejercicio implementa un método Java llamado estadisticasTabla, el
	 *		 cual recibe una tabla de enteros y muestra por pantalla: el número de
	 *		 enteros positivos, el número de enteros negativos, el número de 0s, el
	 * 		 número de enteros pares y el número de enteros impares.
	 */
public class Ejercicio3 {

	/*
	 * Pre:..
	 * Post: Este método analiza la tabla y la va recorriendo incrementando 
	 * los contadores si el numero es de un tipo u otro.
	 */
	public static void estadisticaTabla (int [] tabla) {
		int contadorPositivos=0;
		int contadorCeros=0;
		int contadorNegativos=0;
		int contadorPares=0;
		int contadorImpares=0;
		for (int i=0; i<tabla.length; i++) {
			if (tabla[i]>0) {
				contadorPositivos = contadorPositivos + 1;
			} else if (tabla[i]==0) {
				contadorCeros = contadorCeros + 1;
			} else {
				contadorNegativos = contadorNegativos + 1;
			}
		}
		for (int j=0; j<tabla.length; j++) {
			if (tabla[j]!=0) {
				if (tabla[j]%2 == 0 ) {
					contadorPares = contadorPares + 1;
				} else {
					contadorImpares = contadorImpares + 1;
				}
			}
		}
		System.out.println ("El numero de positivos es: "+contadorPositivos);
		System.out.println ("El numero de negativos es: "+contadorNegativos);
		System.out.println ("El numero de ceros es: "+contadorCeros);
		System.out.println ("El numero de pares es: "+contadorPares);
		System.out.println ("El numero de impares es: "+contadorImpares);
	}	
		
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Introduce 20 numeros enteros del 1 al 20, para completar la tabla."
				+ "Pueden  ser numeros positivos, ceros, negativos, pares e impares.");
		int [] tabla = new int [20];
			for (int i=0; i<20; i++) {
			tabla[i]  = enter.nextInt ();
			}	
		for (int i=0; i<tabla.length; i++) {
			System.out.print ("   "+tabla[i]);
			
		}
		System.out.println ("");
		estadisticaTabla (tabla);
		enter.close ();
	}

}
