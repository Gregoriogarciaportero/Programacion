package tarea4_1;

import java.util.Scanner;

public class Ejercicio8 {
	/*Pre:..
	 *Post:8. Escribe un programa Java que pregunte al usuario por 10 números enteros
	 * y muestre por pantalla el número mayor y el menor de todos los introducidos.
	 */
	public static void main(String[] args) {
		Scanner enter= new Scanner (System.in);
		int mayor=0;  //DEclaro las variables mayor y menor
		int menor=0;
		for (int i=0; i<10; i++) { //Bucle para solicitar 10 enteros
			System.out.println("Introduce un numero entero: ");
			int num=enter.nextInt(); // Declaro la variable num y acumulo el valor introducido 
			if (num>mayor) { //Actualizo la variable mayor si se cumple la condicion 
				mayor=num;
			}else { //Actualizo la variable menor su se cumple la condicion
				menor=num;
			}
		}	//Imprimo por pantalla los numeros mayor y menor introducidos
		System.out.println("El numero mayor introducido es "+mayor);
		System.out.println("El numero menor introducido es "+menor);
		enter.close();
	}
}
