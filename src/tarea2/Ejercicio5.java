package tarea2;

public class Ejercicio5 {
	/** 
	 * Post: Escribe un programa Java que muestre los números pares entre 0 y 100
	 */
	public static void main (String [] args) {
		int i=0; //declaro la variable
		while (i<100) { 
			if(i%2==0) { //para saber si un numero es par dividir por cero.
				System.out.println(i);
				i++; //actualizo la variable incrementando en 2 unidades
			}
		}
	}
}
