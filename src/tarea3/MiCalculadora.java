package tarea3;

import java.util.Scanner;

public class MiCalculadora {
	/** 
	 * Pre:...
	 * Post: Implementa un programa Java que te muestre por pantalla el siguiente menú de acciones:	
	¡Bienvenidos a mi primera calculadora!
	1.- Sumar
	2.- Restar
	3.- Multiplicar
	4.- Dividir
	El usuario deberá indicarle al programa qué operación es la que desea realizar, utilizando el
	código numérico asignado a cada una de las acciones (1, 2, 3 o 4), y posteriormente deberá
	indicarle nuevamente al programa que dos números utilizará para dicha operación.
	Os adjunto en esta tarea un archivo que muestra un ejemplo de cómo debería funcionar vuestro
	programa. Espero que os sirva de ayuda ;)
	Acordaros que os pido que useis la clase Scanner, nuevos métodos para cada una de las acciones,
	y empeceis a probar el funcionamiento de las condiciones en Java (If, else if, else).
	 */
	public static void menu () {
		System.out.println("¡Bienvenidos a mi calculadora!");
		System.out.println("Introduce un valor del menu.");
		System.out.println("1.- Sumar");
		System.out.println("2.- Restar");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
	}	
	public static double sumar (double a, double b) { //método de la operacion sumar //
		return a + b;
	}
	public static double restar (double a, double b) { //método de la operacion restar //
		return a - b;
	}
	public static double multiplicar (double a, double b) { //método de la operacion multiplicar //
		return a * b;
	}
	public static double dividir (double a, double b) { //método de la operacion dividir //
		return a / b;
	}
	public static void main (String [] args) {
		Scanner enter = new Scanner (System.in);
		menu(); //llamo al metodo menu para mostrar por pantalla el indice de la calculadora //
		int eleccion = enter.nextInt (); // declaro la variable y le asigno el valor introducido por el usuario //
		while (eleccion< 1 || eleccion >4) { /**bloqueo la ejecución del código para numeros introducidos por
		* el usuario distintos de 1,2,3 y 4, mediante el bucle while.
		* */
			System.out.print("Introduce un número válido del menu: "); // solicito un nuevo numero al usuario //
			eleccion = enter.nextInt (); /** reasigno valor a la variable eleccion, saliendo del bucle cuando
			* el usuario introduce cualquier valor del indice, es decir, 1,2,3 o 4.
			*/
		}
		System.out.println("Introduce dos numeros: "); /** Una vez que el codigo sigue ejecutandose al salir del
		* bucle, el programa solicita dos numeros al usuario.
		*/
		double num1=enter.nextDouble (); // Declaro la primera variable //
		double num2=enter.nextDouble (); // Declaro la segundo variable //
		if (eleccion==1) {		/** Inpongo la primera condicion si el valor de eleccion es 1 para llamar al
			* metodo suma y hacer la operación suma de los numeros. 
			*/
			System.out.println("La suma de esos numeros es: " + sumar (num1,num2));
		}else if (eleccion==2) { // Impongo la segunda condicion para hacer la operacion resta. //
			System.out.println("La resta de esos números es: " + restar (num1,num2));
		}else if (eleccion==3) { //Impongo la tercera condición para haceer la operación multilpicación //
			System.out.println("La multiplicación de esos números es: " + multiplicar (num1,num2));
		} else if (eleccion==4) { //Impongo la cuarta condicion para hacer la operación división. //
			System.out.println("La división de esos números es: " + dividir (num1,num2)); 
		}
		enter.close ();
	}
}
	

