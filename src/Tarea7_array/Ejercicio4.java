package Tarea7_array;

import java.util.Scanner;

public class Ejercicio4 {

		/* Pre:..
		 * Post:Implementa un programa Java con un m�todo llamado
		 *      indexContains(String[] tabla, String cadena) que devuelva el �ndice de la
		 *		tabla cuyo valor es igual al valor de �cadena�. En caso de no haber ning�n
		 *		valor igual, devuelve -1
		 */
	
	public static int indexContains ( String [] tabla, String cadena) {
		
		// M�todo que compara el valor de (cadena) con los valores de (tabla)  
		int indice = 0;    // Declaro la variable a devolver por el m�todo.
		
		// El bucle hace el recorrido en la tabla desde su primera celda hasta el final.
		for (int i =0; i<tabla.length; i++) {
			if (tabla[i].equals(cadena)) { // Condici�n para cambiar el valor de la var. indice
				indice = i+1;
			} else { // Cambio del valor de la variable indice en el caso de no haber ning�n valor igual
				indice = -1;
			}
		}
		return indice ;
	}
	
	public static void main(String [] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("      INDICE DE LOS ALIMENTOS" +"\n"+ "\n"+ "1. frutas"+
		"\n"+ "2. carnes "+"\n"+ "3. legumbres");
		System.out.println ("");
		System.out.println ("Introduce el nombre del tema al que quieres acceder: ");
		String cadena = enter.nextLine();
		String tabla [] = new String [3]; // Creo la tabla con los valores de las celdas.
		tabla[0] = "frutas"; 
		tabla[1] = "carnes";
		tabla[2] = "legumbres";
		// Imprimo por pantalla el resultado del metodo
		System.out.println ( "El tema elegido corresponde al punto: " + indexContains (tabla, cadena));
		enter.close();
	}

}
