package tarea5_string;

import java.util.Scanner;

public class Ejercicio10 {

		/* Pre:..
		 * Post: Implementa un programa Java muestre por pantalla la suma de los dígitos
		 *       de un número entero. Ej: 23 -&gt; 2 + 3 = 5
		 * 
		 */
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ( "Introduce un numero entero de varias cifras: ");
		String nums = enter.nextLine(); //Leo el numero como una variable String
		int i = 0;
		int suma = 0;
		while (i<nums.length()) { //El bucle lee el string desde el principio y va sumando los digitos 
			String num = nums.substring(i, i+1 ); // Si i=0, entonces num=primer numero 
			int num1 = Integer.parseInt(num); // Convierte el caracter a numero 
			suma=suma+num1; //acumulo las sumas
			i++;	
		}
		System.out.println(suma); //muestro por pantalla
		enter.close();	
	}
}
