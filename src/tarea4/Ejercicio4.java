package tarea4;

import java.util.Scanner;

public class Ejercicio4 {
	/* Pre:...
	 * Post: ¡IMPLEMENTA TU PRIMER JUEGO!
	 *  Realiza un programa Java que adivine el número. El programa generará un número aleatorio
	 *  entre 0 y 20 (usando Math.random()) y luego irá pidiendo números al usuario indicando 
	 *  “mayor” o “menor” según sea mayor o menor con respecto al número generado aleatoriamente. 
	 *  El proceso termina cuando el usuario acierta, y deberá mostrar un mensaje de felicitaciones
	 *   junto al número de intentos que ha necesitado el usuario. 
	 */
	public static void main(String[] args) {
		int contador=1; //variable intentos
		int min = 0;
		int max = 20;
		int x= (int)Math.floor(Math.random()* ( min - (max+1)) + (max)); //Crea un numero aleatoria
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce un numero por teclado entre 0  y 20: "); //solicita numero al usuario
		int num= enter.nextInt ();
		while (num!=x) { //condicion para entrar al bucle si numero introducido es distinto al aleatorio
			if (num<x) { //condicion  si num es menor que el introducido
				System.out.println("El numero introducido es menor al numero que debe adivinar");
			}else if (num>x){ // condicion si num es mayor al introducido
				System.out.println("El numero introducido es mayor al numero que debe adivinar");
			}
			System.out.println("El introduzca otro numero, por favor");				
			num = enter.nextInt ();
			contador=contador+1;
		}
		System.out.println ("¡¡¡¡ Enhorabuena !!!! \nEl numero introducido es el correcto. "); 
		System.out.println("Le ha costado adivinarlo " +contador+ " intentos");
		enter.close(); 
		
	}		
}
