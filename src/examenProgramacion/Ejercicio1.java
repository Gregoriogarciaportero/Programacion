package examenProgramacion;

import java.util.Scanner;

	/* Pre:..
	 * Post: Este programa solicita al usuario una tabla de enteros,
	 * de longitud definida por el usuario y mayor que cero.
	 * Tambien solicita al usuario los numeros mejores (mayores) que quiere imprimir
	 * por pantalla. 
	 */
public class Ejercicio1 {

	/* Pre:..
	 * Post: Este metodo ordena los valores de la tabla de mayor a menor
	 * e imprime por pantalla los valores mas altos que solicita el usuario.
	 */
	public static void mejores (int a [], int b) {
		int aux=0;
		for(int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i]<a[j]) {
					aux=a[i];
					a[i]=a[j];
					a[j]=aux;
				}
			}
		}
		System.out.println("----------- MEJORES M =" + b + " ----------" );
		for(int i=0; i<b; i++) {
			if (i<b) {
				System.out.println (a[i] + " ");
			
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce el numero máximo de numeros que vas a introducir");
		int n= enter.nextInt();
		int [] tabla = new int [n]; 
		for (int i=0; i<tabla.length; i++) {
			System.out.println ("Introduce un numero entero");
			tabla[i]= enter.nextInt();
		}
		System.out.println("Introduce la cantidad de numeros mayores que quieres imprimir por pantalla");
		int m=enter.nextInt ();
		System.out.println("--------------- LISTA--------------");
		for (int i=0; i<tabla.length; i++) {
			System.out.println (" "+ tabla [i]);
		}
		if (m<n) {
			mejores (tabla, m);
		} else { 
			System.out.println("Por favor, vuelva a introducir la cantidad de numeros a mostrar");
			m= enter.nextInt();
		}
		enter.close();
	}

}
