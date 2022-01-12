package Tarea9_corregir_examenes;

import java.util.Scanner;
	
/* Pre:..
	 * Post: Programa que sirve para corregir exámenes.
	 * Solicita al usuario una entradas por teclado y proporciona
	 * al profesor en numero de respuestas correctas del test y el 
	 * porcentaje de las acertadas sobre el total.
	 */
public class Ejercicio_corregir_examenes {
	
	/* Pre: ..
	 * Post: este método solicita al usuario el numero de preguntas total del examen.
	 */
	public static int solicita_numpreguntas () {
		Scanner enter = new Scanner (System.in);
		System.out.println (" !!! Bienvenido al programa que te ayudará a corregir exámenes !!!");
		System.out.println ( " ¿Cuantas preguntas quieres que tenga el examen? (de 2 a 10, inclusives)  ");
		int tam_tabla= enter.nextInt ();
		while (tam_tabla<=1 || tam_tabla>10) {
			System.out.println("Por favor introduzca un numero de preguntas entre 2 y 10, inclusives: ");
			tam_tabla=enter.nextInt();
		}
		return tam_tabla;
	}
	
	/* Pre:..
	* Post: este método solicita al usuario las respuestas CORRECTAS del examen.
	* En caso de que la entrada sea distinto de (a, b, c), entonces vuelve a solicitar entrada
	*/
	public static  String [] respuestas_correctas (String [] tabla ) {
		for (int i =0; i<tabla.length; i++) {
			Scanner enter = new Scanner (System.in);
			System.out.println ("Introduce la respuesta correcta a la pregunta "+(i+1));
			System.out.println ("Por favor, elija entre las opciones: a, b, c: ");
			tabla[i]=enter.nextLine ();
			while (!tabla[i].equals("a") && !tabla[i].equals("b") && !tabla[i].equals("c")){
				System.out.println("Por favor, vuelva a introducir un valor correcto: a, b o c ");
				tabla[i]=enter.nextLine();
			}	
		}
		return tabla;
	}
	
	/* Pre:..
	 * Post: este método imprime por pantalla las respuestas CORRECTAS del examen que 
	 * se han introducido previamente.
	 */	
	public static void imprimir_examen (String [] tabla) {
		System.out.println ("Las respuestas correctas del examen son las siguientes:");
		int i=0;
		while (i<tabla.length) {
			System.out.println ( "La pregunta correcta del examen nº "+(i+1) + "  es la opcion: " +tabla[i]);
			i++;
		}
	}
	
	 
	/* Pre:..
	 * Post: este método pregunta al usuario las preguntas del examen 
	 * 		 y cumplimenta un vector con los opciones introducidas.
	 */	
	public static String [] examen_alumno ( String [] b) {
		Scanner enter = new Scanner (System.in);
		for (int i = 0; i<b.length; i++) {
			System.out.println("Dada una pregunta cualquiera...");
			System.out.println("Elija entre tres opciones: a, b, c");
			System.out.println("Por favor, introduzca la respuesta de la pregunta: "+(i+1));
			b [i] = enter.nextLine ();	
			while (!b[i].equals("a") && !b[i].equals("b") && !b[i].equals("c")){
				System.out.println("Por favor, vuelva a introducir un valor correcto: a, b o c ");
				b[i]=enter.nextLine();
			}
		}
		return b;
	}
 
	/* Pre:..
	 * Post: este método recibe un vector de suma de resultados en donde se acumularan
	 * las respuestas corretas del examen. 
	 * Hace una compración entre el vector de respuetas correctas con el vector de resultados dell examen
	 * realizado por el alumnos.
	 */ 
	public static int [] calculo_respuestas_correctas (int [] suma_respuestas, String [] a, String [] b) {
		
		 for (int i = 0 ; i<a.length; i++ ) {
			if (a[i].equals(b[i])) {
				suma_respuestas [i]= suma_respuestas[i]+1;
			}
		 }
		 return suma_respuestas;	 
	 }	
	 
	/* Pre:..
	 * Post: este método imprime el numero TOTAL de aciertos de cada pregunta del examen.
	 */
	public static void imprimir_correctas (int [] a) {
		
		 System.out.println("El número de respuestas correctas de cada pregunta es: "); 
		 for (int i = 0; i<a.length ; i++) {
		  	System.out.println("De la pregunta "+(i+1)+" el numero total de aciertos es: " + a[i] );
		 } 
	 }
	 
	/* Pre:..
	* Post: este método imprime el numero total de aciertos en porcentaje de cada pregunta del examen.
	*/ 
	public static void imprimir_porcentajes (int [] a, int b) {
		 System.out.println("El porcentaje de respuestas correctas de cada pregunta es: "); 
		  	for (int i = 0; i<a.length ; i++) {
		  	System.out.println("De la pregunta "+(i+1)+" el porcentaje de acierto es: " + (a[i]*100)/b +  " %.");
		  	} 
	 }
	
	 /* Pre:.. 
	  * Post: es el método principal de la clase en donde se desarrolla el códido principal.
	  */
	 public static void main(String[] args) {
		
		Scanner enter = new Scanner (System.in);
		String [] tabla = new String [solicita_numpreguntas ()];
		int [] suma_respuestas= new int [tabla.length]; // tabla donde se acumulan las respuestas acertadas de todos los examenes
		respuestas_correctas (tabla); 
		imprimir_examen (tabla);
		boolean hacer_examen = true;
		int contador_while = 0; //contador que cuenta los intentos o examanes realizados.
		/*
		 * Bucle que pregunta al usuario si desea realizar un nuevo examen.
		 * Para confirmar debe introducir por teclado (si) y para salir del programa
		 * debe introducir por teclado (no).
		 */
		while (hacer_examen) {
			System.out.println (" ¿Quiere empezar a cumplimentar un examen? responda: (si) o (no)");
			String opcion_alumno = enter.nextLine();
			//Condicion para ejecutar el programa y el usuario pueda hacer un examen
			if (opcion_alumno.equals ("si")){
				String [] respuestas_alumno = new String [tabla.length];
				examen_alumno (respuestas_alumno);  //Vector donde se acumulan las respuestas del usuario
				suma_respuestas= calculo_respuestas_correctas (suma_respuestas, tabla, respuestas_alumno);
				contador_while = contador_while + 1; //Antes de salir y hacer un nuevo examen actualizo el contador
			}else {
				hacer_examen=false;
			} 
		}	
		  System.out.println (" ¡¡¡ Finalizo el programa de correccion de examenes !!! "); 
		  System.out.println ("");
		  imprimir_correctas (suma_respuestas);
		  System.out.println ("");
		  imprimir_porcentajes (suma_respuestas, contador_while);
	}
}                		




