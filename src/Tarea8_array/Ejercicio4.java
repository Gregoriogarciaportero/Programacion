package Tarea8_array;

import java.util.Scanner; 
	/* 
	 * Pre: ...
	 * Post:Implementa un método Java llamado copiarTabla, el cual
	 *		recibe como parámetro una tabla de Strings, y devuelve una nueva tabla
	 *		con los elementos en orden inverso.
	 */
public class Ejercicio4 {

	/* 
	 * Pre:..
	 * Post: Este método da por ejemplo el valor de la primera celda de la tablaInv, el valor de 
	 *  	 de la última celda de una tabla. De esta manera lo hacemos para las demas celdas
	 */
	public static String [] copiarTabla (String [] tablaColor, String[] tablaInv){
		for (int i = 0; i<tablaColor.length; i++) {
			tablaInv[i]=tablaColor[(tablaColor.length-i)-1];
		}
		return tablaInv;
	}
	
	/*
	 * Pre:..
	 * Post: Este método solo imprime las dos tablas
	 */
	public static void imprimir (String [] tablaColor, String [] tablaInv) {
		for (int i=0; i<tablaColor.length;i++) {
			System.out.print(tablaColor[i]+"  ");
		}
		System.out.println ("");
		for (int j=0; j<tablaInv.length;j++) {
			System.out.print (tablaInv[j]+"  ");
		}
	}
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce 6 nombres de colores: ");
		String [] tablaColor = new String [6];
		for (int i=0; i<tablaColor.length; i++) {
			tablaColor[i]=enter.nextLine ();
		}
		String [] tablaInv = new String [tablaColor.length];
		copiarTabla (tablaColor, tablaInv);
		imprimir (tablaColor, tablaInv);
		enter.close();
	}

}
