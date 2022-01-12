package tarea2;

public class Ejercicio6 {
	/** 
	 * Pre: Escribe un programa Java que muestre los números impares entre 0 y 100
	 * Post: 
	 */
	public static void main (String [] args) {
		int i=1;
		while (i<100) {
			if(i%2!=0) {  /**La condicion es que si el resto es distinto de cero al dividir entre 2,// 
							   entonces es un numero par **/ 
				System.out.println(i);
			} else	{
				System.out.println(""); //dejo un espacio entre los números impresos.
			}
			i++;
		}
	}
		
}
