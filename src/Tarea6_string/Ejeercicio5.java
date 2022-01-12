package Tarea6_string;

import java.util.Scanner;

/*
	 * Pre:..
	 * Post: Escribe un programa Java que muestre por pantalla las potencias de n^1
	 *		 hasta n^4 de los n�meros desde 1 hasta n, donde n es un n�mero entero
	 *		 escrito por el usuario.
	 */

public class Ejeercicio5 {	
	
	/* Pre: .. 
	 * Post: Este m�todo calcula las potencias hasta la cuarta del numero 
	 * 		 que le es enviado desde el main. Las imprime en la misma linea y 
	 * 		 al salir del m�todo hace un salto de linea.
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
	 * Post: El m�todo void contiene un bucle para ir enviando al metodo potencia
	 * 		 numero a numero hasta que llega al numero introducido por el usuario.
	 */
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce un n�mero entero por teclado: ");
		int num = enter.nextInt ();
		for (int i=0; i<num; i++) {
			potencia (i+1);
		}
		enter.close();	
	}
}
