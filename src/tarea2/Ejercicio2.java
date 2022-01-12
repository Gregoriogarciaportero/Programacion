package tarea2;

public class Ejercicio2 {
 
	/**2. Escribe un programa Java que te muestre los números enteros entre 50 y 100 (ambos incluídos)
	 */
	public static void main (String [] args) {
		int i=50;
		while (i<=100) { //El bucle actualizara la variable a la vez que la va imprimiendo.
			System.out.println(i);
			i=i+1;
		}
	}
}
