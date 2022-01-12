package tarea2;

public class Ejercicio3 {
	/** 3. Escribe un programa Java que te muestre únicamente la suma de los números enteros entre 50 y 100 (ambos incluidos)
	 */
	public static void main (String [] args) {
		int i=50; //declaro la variable con valor inicial 50//
		int suma=i+1; //declaro la variable suma la cual ire actualizando dentro del bucle.//
		while (i<=100) { //
			suma=suma+i;
			i=i+1;
		}
		System.out.println (suma);
	}
}
