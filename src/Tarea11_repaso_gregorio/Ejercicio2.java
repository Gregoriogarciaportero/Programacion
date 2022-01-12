package Tarea11_repaso_gregorio;

import java.util.Scanner;

/*
	 * Pre:..
	 * Post: Escribe un programa Java que pregunte al usuario por dos
	 *		 Strings, y devuelva la concatenación de ambos.
	 */
public class Ejercicio2 {
	
	public static void concatenar (String a, String b) {
		int longA = a.length ();
		int longB = b.length ();
		int longC = longA + longB;
		String C = a+b;
		System.out.print(C);
	}
		
	

	public static void main(String[] args) {
		Scanner enter=new Scanner (System.in);
		System.out.println("Introduce el nombre de dos ciudades españolas: ");
		String palabra1 = enter.nextLine ();
		String palabra2 = enter.nextLine ();
		concatenar (palabra1, palabra2);
		enter.close();

	}

}
