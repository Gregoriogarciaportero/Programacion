package tarea5_string;

public class Ejercicio9 {
 
	/* Pre:...
	 * Post: Implementa un programa Java que muestre por pantalla una cara.
	 */
	public static void main(String[] args) {
		String fila1 = " +aaaaa+ ";
		String fila2 = "[| o o |]";
		String fila3 = " |  ^  | ";
		String fila4 = " +-----+ ";
		String fila5 = " ||||||| ";
		String reemplazar = fila1.replace('a', '"'); //Sustituye la "a" de la fila por las comillas
	    System.out.println(reemplazar + "\n" + fila2 + "\n" + fila3 + "\n" + fila4 + "\n" + fila5);
	   
	}
}
