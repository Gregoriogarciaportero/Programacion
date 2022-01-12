package Tarea11_repaso_gregorio;

import java.util.Scanner;
	/*
	 * Pre:..
	 * Post:..Escribe un programa Java que indique si dos Strings son rotaci�n
	 *		  entre ellos.
	 *
	 *	 	 1� String: Hola
	 * 		 2� String: aloH
	 *		 �SON ROTACI�N!
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
		System.out.println ( " 1� String: "+a);
		System.out.println ( " 2� String: "+b);
		if (cierto) {
			System.out.println ("� SON ROTACION !");
		} else {
			System.out.println (" NO SON ROTACI�N");
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
		System.out.println ( " 1� String: "+a);
		System.out.println ( " 2� String: "+b);
		if (cierto) {
			System.out.println ("� SON ROTACION !");
		} else {
			System.out.println ("� NO SON ROTACI�N !");
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
