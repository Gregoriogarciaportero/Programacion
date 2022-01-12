package Tarea11_repaso_gregorio;

import java.util.Scanner;

	/*
	 * Pre:..
	 * Post: Escribe un programa Java que pregunte al usuario por dos
	 *		 Strings y los compare lexicográficamente. Dos Strings son 
	 *		 lexicográficamente iguales si tienen la misma longitud y 
	 *		 contienen los mismos caracteres en las mismas posiciones.
	 */

	
	


public class Ejercicio1 {
	
	public static void comparar (String a, String b, int c) {
		boolean cierto=true;
		for (int i = 0 ; i<c; i++ ) {
			String caracterA = a.substring(i);
			String caracterB = b.substring(i);
			
			if (cierto) {
				if (caracterA.equals(caracterB)) {
				} else {
					cierto=false;
					System.out.println("Las ciudades introducidas NO son iguales.");
					break;
				}	
			}
		}
		if (cierto) {	
		System.out.print("Las ciudades introducidas SI son iguales.");
		}
	}	

	public static void main(String[] args) {
		Scanner enter=new Scanner (System.in);
		System.out.println("Introduce el nombre de dos ciudades españolas: ");
		String palabra1 = enter.nextLine ();
		String palabra2 = enter.nextLine ();
		int longPalabra1 = palabra1.length();
		int longPalabra2 = palabra2.length();
		if (longPalabra1==longPalabra2) {
			comparar (palabra1, palabra2, longPalabra1);
		} else {
			System.out.print (" Las ciudades introducidas NO son iguales.");
		}
		
		enter.close();
	}

}
