package tarea4;

import java.util.Scanner;

public class Ejercicio3 {
/*
 * Implementa un programa Java que lea n�meros hasta que se teclee uno
 * negativo. Al final debe mostrar cu�ntos n�meros se han introducido.
 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("Introduce un numero por teclado: ");
		double num= enter.nextDouble ();
		int contador = 0;
		if (num >= 0) { //condici�n para entrar
			while (num >= 0) {		 //bucle condici�n para iterar que el numero introducido sea >= que cero 	
				if (num >= 0) {
					System.out.println("Introduzca un nuevo numero.");					
					num= enter.nextDouble ();
					contador= contador+1;
				}
			}
		System.out.println("Termino el programa por introducir un numero negativo (" + num + ")"); //informacion que da el programa al terminar
		System.out.println(" Hasta la interrupci�n, usted a introducido "+contador+ " numeros");  
		System.out.println("Si lo desea, vuelva a ejecutar el programa."); 
		enter.close();
		} 			
	}
}
	


