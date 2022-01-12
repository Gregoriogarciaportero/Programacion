package Tarea10_tabla_multid;

import java.util.Scanner;

	/* Pre: ...
	 * Post: Tenemos la siguiente tabla multidimensional, la cual almacena
	 *		 por cada una de sus filas el salario trimestral de cada uno de los
	 *		 empleados de la empresa:
	 *		 int salarios[][] = { {700, 900, 1300} , {1000, 950, 1080}, {1300, 930, 1200} }
	 *		 A su vez, disponemos también de una tabla empleados, con los nombres
	 *		 de los trabajadores:
	 *		 String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende"}
	 *		 Implementa un programa Java que muestre por pantalla lo siguiente:
	 *
	 *		 Javier Marías -> 700 + 900 + 1300 = 2900€
	 *		 Antonio Muñoz -> 1000 + 950 + 1080 = 3030€
	 *		 Isabel Allende -> 1300 + 930 + 1200 = 3430€
	 */


public class Ejercicio1 {

	/*
	 * Pre:..
	 * Post: Método que utilizo para imprimir las celdas del array y tabla
	 * En el primer bucle imprimo los nombres seguidos de los valores de las 
	 * filas de la tabla de salario. 
	 */
	public static void imprimirSalarios (String [] a, int [][] b) {
			
		
		for (int j=0; j<b.length; j++) {
				System.out.print (a[j]+ " -> ");
				int suma = 0;
				for (int k=0; k<b[j].length;k++) {
					System.out.print(b[j][k]);
					if (k<b.length-1) {
						System.out.print(" + ");
					}
					suma = suma + b[j][k];
				
				}
				System.out.print(" = ");
				System.out.println ( suma );
		}
	}
	
	public static void main(String[] args) {
		Scanner enter=new Scanner (System.in);
		int salarios [][] = { {700, 900, 1300}, {1000, 950, 1080}, {1300, 930, 1200} };
		String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende"};
		imprimirSalarios (empleados, salarios);
		enter.close();
	}

}
