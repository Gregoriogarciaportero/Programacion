package tarea4_1;

import java.util.Scanner;

public class Ejercicio6 {
	/* Pre:..
	 * Post: 6. Escribe un programa Java que muestre los números impares entre 0 y 100
	 */
	public static int solicita_num () { // Metodo que solicita un numero por teclado 
		Scanner enter=new Scanner(System.in);
		System.out.println("Introduce un numero entero cualquiera por teclado");
		int a = enter.nextInt(); 
		//enter.close ();
		return a;
	}
	
	public static void impar (int i) { //Metodo que imprime por pantalla los pares o impares 
		if (i%2!=0) {
			System.out.println ("El numero "+i+" es impar");
		} else {
			//System.out.println ("El numero "+ i + " es par");
		}
	}

	public static void main(String[] args) {
		int num1= solicita_num (); // Declaro la primera variable introducida  
		int num2= solicita_num (); // Declaro la segunda variable introducida
		if (num1<num2) { //Condicion si el primer valor introducido es menor que el segundo
			for (int i=num1;i<num2;i++) { //Bucle desde num1 hasta num2
				impar (i); //Invoco al metodo impar
			}
		} else {//Condicion si el primer valor introducido es mayor que el segundo
			for (int i=num2;i<num1;i++) { //Bucle desde num2 hasta num1
				impar (i); //Invoco al metodo impar
		}
	}
	}
} 