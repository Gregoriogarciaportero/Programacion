package tarea2;

import java.util.Scanner;

public class Ejercicio9 {
	/**9. Escribe un programa Java que pregunte al usuario por 10 números enteros y
	 *  muestre por pantalla el número total de veces que el usuario ha introducido el 0, 
	 *  el número total de enteros mayores que 0 introducidos y
	 *  el número total de enteros menores que 0 introducidos.
	 */
	public static void main (String args[]) {
			// TODO Auto-generated method stub
			Scanner enter = new Scanner (System.in); //Creación de un objeto Scanner//
			//declaro las nuevas variables//
			int contador =1;
			int ceros = 0; 
			int mayorcero = 0;
			int menorcero = 0;
			while (contador<=10) { /**Voy actualizando las variables según el usuario va 
								      introduciendo los numeros*/
				System.out.println("Introduce un número entero: "); 
				int num=enter.nextInt ();
				if (num == 0) { //Si el numero introducido es cero lo acumulo//
					ceros = ceros + 1;
				}else if (num > 0) { //Si el numero introducido es mayor que cero lo acumulo// 
					mayorcero = mayorcero + 1;
				}else { // Si el numero introducido es menor que cero lo acumulo//
					menorcero = menorcero + 1;
				}
				contador = contador + 1;
			} 
			//Impresion por pantalla de los resultados//
			System.out.println ("El numero de ceros introducidos es: " + ceros);
			System.out.println ("El numero de enteros introducidos mayor que cero es: " + mayorcero);
			System.out.println ("El numero de enteros introducidos menor que cero es: " + menorcero);
			enter.close ();
	}
}

	