package Tarea11_repaso_gregorio;

import java.util.Scanner;

	/*
	 * Pre: ...
	 * Post: Escribe un programa Java que pregunte al usuario por dos
	 *		 Strings, y compruebe si el primero de ellos contiene al segundo. 
	 */
public class Ejercicio3 {
	
	public static void comparar (String a, String b) {
		boolean cierto=true;
		int longB = b.length();
		int contador = 0;
		for (int i = 0 ; i<b.length () ; i++ ) {
		 	for (int j = contador; j<a.length(); j++) {
		 		//if (b.charAt(i)==a.charAt(j)) {
		 		if (b.substring(i,i+1).equals(a.substring(j,j+1))) {	
		 			contador = contador + 1;
		 			break;
		 		}
	 		}
		}
		if (contador==longB) {
		 	System.out.print("La palabra "+a+ " SI contiene a "+b);
		 } else {
			System.out.print("La palabra "+a+ " NO contiene a " +b);
		 }
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduce el nombre de dos ciudades españolas: ");
		String palabra1 = enter.nextLine ();
		String palabra2 = enter.nextLine ();
		comparar ( palabra1, palabra2);
		enter.close();

	}

}
