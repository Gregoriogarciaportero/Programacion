package ficheros_20220127;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
 /*
  Implementa un programa Java que solicite al usuario (hasta que este escriba 
  la palabra fin) números enteros o cadenas de caracteres (1 sola palabra) de 
  forma constante, siguiendo este funcionamiento:
	
¡Bienvenido al programa de escritura sobre ficheros de texto!
Indique la ruta del fichero a escribir: /Ficheros/fichero1.txt
-------------------------------------------------------------------------------------------------
Introduzca lo que desea escribir: 3456
El número entero 3456 se ha escrito correctamente en el fichero /Ficheros/fichero1.txt
Introduzca lo que desea escribir: "Hola"
La cadena de caracteres "Hola" se ha escrito correctamente en el fichero /Ficheros/fichero1.txt
Introduzca lo que desea escribir: fin
¡El programa ha finalizado! ¡Hasta luego!

Cuando el usuario introduce un número entero, se debe escribir la siguiente línea de texto en el fichero:
- Número entero introducido por el usuario: 3456

Cuando el usuario introduce una cadena de caracteres, se debe escribir la siguiente línea de texto en el fichero:
- Cadena de caracteres introducida por el usuario: "Hola"


¡CONSEJO!: para saber si un String en realidad es un número entero, implementa una nueva función "isInteger(String numero)" que devuelva true si y sólo si [numero] es un entero. Utiliza el método Integer.parseInt() de Java.
*/
public class Ejercicio1_20220126 {
	public static boolean isInteger(String str) {
		 try {
		        Double.parseDouble(str);
		        return true;
		 }catch(NumberFormatException e) {
		        return false;
		 }
	}
	
	public static void main (String [] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println ("¡Bienvenido al programa de escritura sobre ficheros de texto!");
		System.out.println ("Indique la ruta del fichero a escribir:");
		String ruta = enter.next ();
		try {
			Formatter f1 = new Formatter (ruta);
			System.out.println("-------------------------------------------------------------------------------------------------");
			while (true) {
				System.out.println("Introduzca una palabra: ");
				String texto = enter.next ();
				if (texto.equalsIgnoreCase("fin")) {
					System.out.println("¡El programa ha finalizado! ¡Hasta luego!");
					break;
				}
				if (!isInteger (texto)) {
					
					System.out.println("La cadena de caracteres " + texto + " se ha escrito correctamente en el fichero. " + ruta);
				} else {
					System.out.println("El número entero " + texto + " se ha escrito correctamente en el fichero: " + ruta);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
	}
}
