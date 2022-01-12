package Tarea1;

public class Ejercicio3 {
	/** Este ejercicio implementa un programa Java que muestre por pantalla el resultado de
		las siguientes operaciones:
		a. -5 + 8 * 6
		b. (55+9) % 9
		c. 20 + -3*5 / 8
	 */
	public static void calculadora () {
		double a = -5;
		double b = 8 ;
		double c = 6;
		double d = a + b * c;
		double e = (55+9) % 9;
		double f= 20 + -3*5 / 8; 
		System.out.println ("La operacion matemática (-5 + 8 * 6) es : " + d);
		System.out.println ("El resto de (55+9)%9 es: " + e);
		System.out.println ("La operación matemática 20+(-3)*5/8 es: " + f);
	}
	public static void main (String [] args) {
		calculadora ();
	}
}
