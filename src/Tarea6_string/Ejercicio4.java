package Tarea6_string;


	/* Pre:..
	 * Post: Este programa muestra el siguiente patrón (hasta 7, tal
	 * cual se muestra en el ejemplo). Pista: debes utilizar 3 bucles.
	 * 1******
	 * 12*****
	 * (...)
	 * 1234567
	 */

public class Ejercicio4 {
	
	/*
	 * Pre:..
	 * Post: En el método void se han creado tres bucles.
	 * 		 El primero se encarga de establecen las lineas
	 * 		 El segundo imprime los numeros en la misma linea
	 * 		 El tercero imprime los asteriscos en la misma linea
	 */
	public static void main (String[] args) {
		for (int i=1; i<=7; i++) {
			for (int in=1;in<=i;in++ ) {
			System.out.print(in);
			}
			for(int in=i; in<7; in++) {
			System.out.print("*");
			}				
			System.out.println("");
		}		
	}
}

	


