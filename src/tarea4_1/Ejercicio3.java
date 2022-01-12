package tarea4_1;

import java.util.Scanner;

public class Ejercicio3 {
	/* Pre:....
	 * Post: Escribe un programa Java que te muestre únicamente la suma de los 
	 * números enteros entre 50 y 100 (ambos incluidos)
	 */

	public static void main(String[] args) {
		Scanner enter= new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		int min=enter.nextInt();
		System.out.println("Introduce otro numero: ");
		int max=enter.nextInt();
		int suma=min;
		if (min<max) { //C
			for (int i = min+1; i <= max ; i++) { // Bucle para que sume entre los valores min y max, si min es mayor a min
				suma=suma+i;
			}
		}else {
			for (int i = max+1; i <= min ; i++) { // Bucle para que sume entre los valores max y min, siempre que sea mayor min
				suma=suma+i;
			}
		}
		System.out.println("La suma de los numeros enteros entre " + min + " y " + max +"  ambos inclusive, es: "+ suma);
		enter.close();
	}	
}

	
		

