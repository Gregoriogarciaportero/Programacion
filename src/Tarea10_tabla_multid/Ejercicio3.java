package Tarea10_tabla_multid;

import java.util.Scanner;

	/*
	 * Pre:..
	 * Post: Implementa un método Java llamado “modificar” que, dado una tabla
	 *		 multidimensional y un entero positivo, multiplique todos los elementos
	 *		 de dicha tabla por el entero dado. Al finalizar la operación, deberás
	 *		 mostrar el resultado de final de la tabla en el método main.
	 */
public class Ejercicio3 {
	
	/* 
	 * Pre:..
	 * Post: El método multiplica cada celda de la matriz por un numero.
	 * 		 Recorre la tabla con 2 bucles (fila - columna)
	 */
	public static int [][] modificar (int [][] a, int b){
		for (int i = 0; i < a.length ; i++) {
			for (int j = 0 ; j < a[i].length ; j++) {
				a[i][j]= (a [i][j])*b;
			}			
		}
		return a;
	}
	public static void main (String  [] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce un numero entero por teclado: ");
		int num=enter.nextInt();
		int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		tabla = modificar (tabla, num );
		for (int i = 0; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla[i].length ; j++) {
				System.out.print (tabla[i][j]+" ");
			}
			System.out.println (" ");
		}			
		enter.close ();
	    }
	}

;