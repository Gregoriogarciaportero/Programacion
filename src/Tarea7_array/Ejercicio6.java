package Tarea7_array;

import java.util.Scanner;

public class Ejercicio6 {

		/* Pre: ...
		 * Post: Implementa un programa Java con un método llamado
		 *		 insertElement(int[] tabla, int num, int index) que devuelve “tabla”,
		 *		 insertando el valor de “num” en el índice “index” pasado por parámetro.
		 *		 Como ya conocemos, las tablas tienen una longitud máxima que se indica
		 *		 al crearlas. Por lo tanto, para añadir este nuevo elemento deberemos
		 *		 desplazar el resto una posición hacia abajo.Es decir, si queremos 2
		 * 		 almacenar num=2 en index=3, los elementos en la posición desde 3 hasta
		 *		 tabla.length deberán desplazarse para dejar hueco al nuevo elemento.
		 */
	
	public static int [] insertElement (int [] tabla, int num, int index) {
		/* Método que modifica la tabla segun el requisito del problema, es decir.
		 * Al final he creado una tabla nueva, pero se puede hacer directamente en la tabla facilitada
		 * desde el metodo void.
		 * El metodo adelanta los numeros una posicion en el array desde el valor facilitado por la
		 * variable "index" (incluido).
		 * Despues actualizo la posicion index por el valor de la variable "num"
		 * y como he creado otra tabla tambien copio los valores que que están por debajo del valor "index"
		 */
		
		int [] tabla2 = new int [tabla.length];  //Creo la nueva tabla
		for (int i = tabla.length-1; i>=index ; i--) { //Creo un bucle desde el la (longitud-1) hasta el valor del index.
			/*
			 * Aunque ya te contaré en clase, aqui creo una variable de iteracion para la tabla2.
			 * Ya se que es totalmente innecesario pero he estado 3 horas con este ejercicio
			 * y el error estaba en el comando (int i = tabla.length-1) no habia restado (-1).
			 * Pero lo dicho, te explico en clase el ejercicio. 
			 */
			int it = i-1; 
			tabla2[i] = tabla[it];
		}
		tabla2[index]=num;
		for (int i = 0; i<index; i++ ) {
			tabla2[i] = tabla[i];
		}
		return tabla2;
	}
	
	public static void main(String[] args) {
		Scanner enter=new Scanner(System.in);
		System.out.println("Introduce el tamaño máximo del indice de la tabla: ");
		int tamanyo_tabla= enter.nextInt (); 
		int [] tabla = new int [tamanyo_tabla]; // Creo la tabla que envío al metodo
		int it = 0;
		while (it<tabla.length) { //Creo un bucle para solicitar al usuario los valores de la tabla
			System.out.println("Introduce numeros para completar la tabla del indice");
				tabla[it]=enter.nextInt ();
				it=it + 1;
		}
		System.out.println("Perfecto. Esta es la tabla (indice) que has completado: ");
		for (int i = 0; i<tabla.length ; i++) {
			System.out.println (" En la posicion " + (i+1) + " esta el " + tabla[i]);
		}
		int ite=0;
		while ( ite >= 0) { // Bucle infinito hasta introducir un numero negativo
			System.out.println ("Ahora vamos a modificar la tabla creada");
			System.out.println ("Introduce un nuevo numero entero y la posicion donde quieres que se ubique en la tabla, del 1 al : "+ (tabla.length+1));
			int num = enter.nextInt();
			int index = enter.nextInt ();
			index = index -1;
			tabla = insertElement (tabla, num, index); // Llamo al metodo 
			for (int i=0; i<tabla.length; i++) { // Recorro el array e imprimo
				System.out.println (" La informacion de la nueva tabla es: " + tabla [i]);
			}
			ite = ite +1;			
		}
		enter.close ();
	}

}
