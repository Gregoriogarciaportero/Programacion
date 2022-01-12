package Tarea6_string;

import java.util.Scanner;

/*
	 * Pre:..
	 * Post: Escribe un programa Java que muestre por pantalla las potencias de n^1
	 *		 hasta n^4 de los números desde 1 hasta n, donde n es un número entero
	 *		 escrito por el usuario.
	 */

public class Ejeercicio5 {	
	
	/* Pre: .. 
	 * Post: Este método calcula las potencias hasta la cuarta del numero 
	 * 		 que le es enviado desde el main. Las imprime en la misma linea y 
	 * 		 al salir del método hace un salto de linea.
	 */
	public static void potencia (int a) {
		int resultado=1;
		for (int i=0; i<4; i++) {
			resultado=resultado*a;
			System.out.print(resultado+"   ");
		}
		System.out.println("");
		a=a+1;
	}
	
	/* Pre:
	 * Post: El método void contiene un bucle para ir enviando al metodo potencia
	 * 		 numero a numero hasta que llega al numero introducido por el usuario.
	 */
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce un número entero por teclado: ");
		int num = enter.nextInt ();
		for (int i=0; i<num; i++) {
			potencia (i+1);
		}
		enter.close();	
	}
}
