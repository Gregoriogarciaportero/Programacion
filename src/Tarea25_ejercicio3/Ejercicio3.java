package Tarea25_ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;

	/* Pre:
	 * Post Ejercicio 1: En un puesto fronterizo recogemos diariamente la información
		referente al tránsito de personas. Para una persona nos interesa almacenar
		su DNI y nombre completo.
		Se pide diseñar una aplicación que presente las siguientes opciones:
			1. Paso de frontera.
			2. Mostrar todas las personas.
			3. Búsqueda por nombre.
			4. Búsqueda por DNI.
			5. Salir
		
	 */
public class Ejercicio3 {
	
	public static void mostrarMenu () {
		System.out.println(" Introduce un numero de la opcion elegida");
		System.out.println("1. Paso de frontera. ");
		System.out.println("2. Mostrar todas las personas. ");
		System.out.println("3. Busqueda por nombre. ");
		System.out.println("4. Busqueda por DNI. ");
		System.out.println("5. Salir. ");
		System.out.println("");
		
	}
	

	public static void main (String args []) {
		ArrayList <Persona> numeroPuesto = new ArrayList <Persona>();
		//Persona [] ciudadano = new Persona [1000];
		Scanner enter = new Scanner (System.in);
		mostrarMenu ();
		int opcion = enter.nextInt (); 
		//int contadorCiudadanos=0;
		while (opcion != 5 ) {
			
			if (opcion == 1) {
			/* La opción 1 se recogen los datos de la persona que transita a
			 * través de la frontera (se añade una nueva persona al ArrayList 
			 * de tránsito).
			 */ 
			enter.nextLine();
			System.out.println ("Introduzca los datos del ciudadano que va a pasar.");
			System.out.println ("Nombre: ");
			String nombre = enter.nextLine ();
			System.out.println ("DNI: ");
			String dni = enter.nextLine ();
			Persona ciudadanos  = new Persona (nombre, dni);	
			numeroPuesto.add(ciudadanos);
			
			} else if (opcion == 2 ) {
			/*
			 * La opción 2, muestra la información de todas las personas que 
			 * han pasado por la frontera.
			 */
				enter.nextLine();
				System.out.println ("Los ciudadanos que han cruzado la frontera son : ");
				for (int i = 0 ; i < numeroPuesto.size (); i++) {
					System.out.println ("Nombre: " + numeroPuesto.get(i).getNombre() + "  DNI: " +
					numeroPuesto.get(i).getDni());
				}
			
			} else if (opcion == 3) {
			/*
			 * La opción 3, muestra toda informacion del ciudadano introduciendo su nombre.
			 */
				enter.nextLine();
				System.out.println ("Introduce el NOMBRE del ciudadano que quiere obtener información: ");
				String consultaNombre = enter.nextLine ();
				for (int i = 0 ;i < numeroPuesto.size (); i++) {
					if (numeroPuesto.get(i).getNombre().equalsIgnoreCase(consultaNombre)) {
						System.out.println ("Nombre: " + numeroPuesto.get(i).getNombre() + "  DNI: " + 
						numeroPuesto.get(i).getDni());
					}
				}
				
			} else if (opcion == 4) {
			
			/*
			 * La opción 4, introducimos el DNI de una
			 * persona de la que obtendremos toda su información. 
			 */
				enter.nextLine();
				System.out.println ("Introduce el DNI del ciudadano del que quiere obtener información: ");
				String consultaDni = enter.nextLine ();
				for (int i = 0 ;i < numeroPuesto.size (); i++) {
					if (numeroPuesto.get(i).getDni().equalsIgnoreCase(consultaDni)) {
						System.out.println ("Nombre: " + numeroPuesto.get(i).getNombre() + "  DNI: " + 
						numeroPuesto.get(i).getDni());
					
					}
				}
				
			}
					
			mostrarMenu ();
			opcion = enter.nextInt (); 
		}
		System.out.println ("Ha salido de la aplicacion.");
		enter.close();
	}
}


