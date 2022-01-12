package Tarea11_repaso_gregorio;

import java.util.Scanner;
	/*
	 * Pre:..
	 * Post:..Escribe un programa Java que indique si dos Strings son rotación
	 *		  entre ellos.
	 *
	 *	 	 1º String: Hola
	 * 		 2º String: aloH
	 *		 ¡SON ROTACIÓN!
	 */
public class Ejercicio6 {
	
	
	public static void rotacion (String a, String b) {

/*		boolean cierto = true;
		for(int i = 0; i < a.length (); i++) {
			if (a.charAt(i)!= b.charAt(a.length()-1-i)) {
				cierto=false;
				break;
			}
		}
		System.out.println ( " 1º String: "+a);
		System.out.println ( " 2º String: "+b);
		if (cierto) {
			System.out.println ("¡ SON ROTACION !");
		} else {
			System.out.println (" NO SON ROTACIÓN");
		}
		
		
	}*/

	
	
		boolean cierto = true;
	  	int num = a.length();
		for(int i = 0; i < a.length (); i++) {
			if (!a.substring(i,i+1).equals( b.substring(num-1-i,num-i))){
				cierto=false;
				break;
			}
		}
		System.out.println ( " 1º String: "+a);
		System.out.println ( " 2º String: "+b);
		if (cierto) {
			System.out.println ("¡ SON ROTACION !");
		} else {
			System.out.println ("¡ NO SON ROTACIÓN !");
		}
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Escribe el nombre de un pais Europeo");
		String leerDerecha= enter.nextLine();
		System.out.println("Escribe el mismo nombre del pais per al REVES");
		String leerIzquierda = enter.nextLine();
		if (leerIzquierda.length() == leerDerecha.length()) {
			rotacion (leerDerecha, leerIzquierda);
		} else {
			System.out.println ("Las palabras introducidas no contienen el mimsmo numero de caracteres ");
			System.out.println("vuelva a ejecutar el programa, por favor");
		}
	
		enter.close();
	}

}
