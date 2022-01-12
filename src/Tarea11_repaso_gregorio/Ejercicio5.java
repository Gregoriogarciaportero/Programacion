package Tarea11_repaso_gregorio;

import java.util.Scanner;

	/*
	 * Pre:..
	 * Post: Escribe un programa Java que dado un String, elimine de este los
	 *		 caracteres “b” y “ac”.
	 */
public class Ejercicio5 {
	
	public static void eliminarCaracter (String palabra) {
		int longA = palabra.length ();
		String [] nuevaPalabra = new String [longA];
		int j=0;
		for (int i =0; i<longA; i++) {
			if (i<longA-1) {
				if ((palabra.charAt(i)!='b') && (palabra.charAt(i)!='a')){
					nuevaPalabra[j] = Character.toString(palabra.charAt(i));
					j++;
				} else if(palabra.charAt(i)=='a'&& palabra.charAt(i+1)!='c') {
					nuevaPalabra[j] = Character.toString(palabra.charAt(i));
					j++;
				} else if (palabra.charAt(i) =='a' && palabra.charAt(i+1) =='c' ){
					i=i+1;
				}
			}
			if (i==(longA-1)) {
				if (palabra.charAt(i)!='b' && palabra.charAt(i)!='c'&& palabra.charAt(i-1)!='a') {
					nuevaPalabra[j] = Character.toString(palabra.charAt(i));
				}
			}
		}
		for (int k = 0; k<nuevaPalabra.length; k++ ) {
			System.out.println (nuevaPalabra[k]);
		}
		
	}
		
	
				
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Introduzca una palabra que empieze por b y termine en ac: ");
		String palabra = enter.nextLine ();
		eliminarCaracter (palabra);
		enter.close ();
	}

}
