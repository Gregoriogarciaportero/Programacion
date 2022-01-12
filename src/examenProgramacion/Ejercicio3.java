package examenProgramacion;

import java.util.Scanner;

public class Ejercicio3 {
	
	/*
	 * Pre:..
	 * Post: Este método imprime por pantalla el salario mas alto
	 * del empleado que introduce el usuario por teclado.
	 */
	public static void maxFila (int[][] tabla, int fila) {
		int salariomayor=0;
		for (int i=fila-1; i<=fila-1; i++) {
			for (int j=0; j<tabla[i].length; j++) {
				if(tabla[i][j] > salariomayor) {
						salariomayor = tabla [i][j];
				}
			}
		}
		System.out.print ("El salario mayor del empleado " + fila + " es: " + salariomayor);
	}
	
	
	public static void main (String[] args) {
		Scanner enter = new Scanner (System.in);
		int salarios[][] = { {700, 900, 1300, 800, 790, 850} , {1000, 950, 1080, 1070, 1200, 1100}, 
			{1300, 930, 1200, 1170, 1000, 1000} , {1500, 1950, 1880, 1978, 2200, 2100} };
		System.out.println (" Introduce el numero de empleado a calcular el salario mayor, del 1 al 4: ");
		int fila= enter.nextInt ();
		maxFila (salarios, fila);
		enter.close();
	
	}

}
