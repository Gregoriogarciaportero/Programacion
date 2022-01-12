package Tarea10_tabla_multid;


import java.util.Scanner;
	/*
	 * Pre:..
	 * Post: Utilizando las mismas tablas del ejercicio anterior,
	 *		 implementa un programa Java que ordene los salarios de cada uno de los
	 *		 empleados de mayor a menor, y los muestre ordenados por pantalla de la
	 *		 siguiente forma:
	 *		 Ejemplo:
	 * 		 Javier Marías -> 700 / 900 / 1300
	 *		 Antonio Muñoz -> 950 / 1000 / 1080
	 *		 Isabel Allende -> 930 / 1200 / 1300
	 */
public class Ejercicio2 {
	
	/*
	 * Pre:..
	 * Post: El método ordena de menor a mayor los valores de cada fila de la matriz. 
	 */
	public static int [][] ordenar (int [][] b) {
		int menor; // Creo un variable para almacenar el dato que cumple la condicion del (if).
		for (int i= 0; i<b.length; i++) { //Primer (for) del Bucle que fija la fila de trabajo del metodo
			for (int j=0; j<b[i].length; j++) { // Segundo (for) que actualiza los valores de las celdas de la matriz
				for (int k = j+1; k < b[i].length; k++) { 
					/* Tercer (for) que recorre la fila comparando las celdas
				     * empieza en i,j+1 ya que el valor de i,j es el primero a comparar
				     * Si entra al bucle la variable (menor) la actualizo para poder cambiar el valor de
				     * la celda i,j
				     * Sustituyo el valor en la posición ij donde encuentro el menor ik.
				     * Sustituyo el valor en la posición ij 
				     */
					if (b[i][j] > b[i][k]) { 
						menor = b[i][k];
						b[i][k]= b[i][j];
						b[i][j] = menor;
					}
		        }
			}		
		}
		return b;
	}
		
		/*
		 * Pre:.. 
		 * Post: Método que imprime el nombre y los datos de cada fila.
		 */
	
	public static void imprimirSalarios (String [] a, int [][] c ) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " -> ");
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]);
				if ( j<c.length-1 ) {
					System.out.print(" , ");
				}
			}
			System.out.println (" ");
		}
	}
			

	public static void main(String[] args) {
		Scanner enter=new Scanner (System.in);
		int salarios [][] = { {700, 100, 400}, {1000, 750, 890}, {1300, 1530, 1200} };
		String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende"};
		int [][] tablaOrdenada = new int [3][3];
		tablaOrdenada = ordenar (salarios);
		imprimirSalarios (empleados, tablaOrdenada );
		enter.close();
		}

	}


