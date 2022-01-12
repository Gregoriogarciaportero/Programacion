package Tarea10_tabla_multid;

import java.util.Scanner;

	/*
	 * Pre:...
	 * Post: Tenemos la siguiente tabla multidimensional, la cual almacena
	 *		 por cada una de sus filas el número de kilogramos vendidos de peras y
	 *		 manzanas en una frutería:
	 *		 int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
	 *		 A su vez, disponemos también de una tabla alimentos, con los nombres
	 *		 de las dos frutas de temporada que estamos vendiendo:
	 *		 String frutas[] = {&quot;Pera&quot;, &quot;Manzana&quot;}
	 *		 Y una tabla con los precios de ambos alimentos:
	 *		 int precios[] = {6, 7};
	 *
	 *		 Implementa un programa Java que te muestre la suma total de los
	 *		 kilogramos vendidos de cada uno de los alimentos, y al final muestre las
	 *		 ganancias obtenidas gracias a las ventas de cada uno de ellos. El resultado
	 *		 debe ser el siguiente:
	 *
	 *		 Pera -> 64 kg x 6€ = 384€
	 *		 Manzana -> 99 kg x 7€ = 693€
	 */
public class Ejercicio4 {
	
	/* Pre: ..
	 * Post: El método muestra por pantalla datos y resultado de una manera
	 * determinada. En los bucle recorren la tabla sumando los datos de las
	 * filas. Finalmente se muestra por pantalla realizando la multiplicación.
	 */
	public static void mostrarPantalla (String [] a, int b [][], int c []) {
		
		for (int i=0; i<a.length ; i++ ) {
			int suma = 0;
			System.out.print(a[i] + " -> ");
			for (int k = 0; k<b[i].length; k++) {
				suma=suma+b[i][k];
			}
			System.out.println (suma + " kg x " + c[i]+"€ = " + suma*c[i]+"€");
		}		
	}
	
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
		String frutas[] = {"Pera","Manzana"};
		int precios[] = {6, 7};
		mostrarPantalla(frutas, kilos, precios);
		enter.close ();
	}

}
