package Tarea6_string;

import java.util.Scanner;

public class Ejercicio1 {

	/* Pre::..
	 * Post: El siguiente programa implementa un programa Java que le solicite al usuario 
	 * un número entero positivo y escriba dicho número con letra por pantalla. Únicamente 
	 * debe mostrar los nombres de los números del 0 al 9, el resto los mostrará con
	 * el nombre “Otros”.
	 */
	public static String caracter1 (int a) { // metodo para cambiar el valor al numero introducido 
		String numesc= "";
		if (a==0) {
			numesc="cero";
		} else if (a==1){
			numesc="uno";
		} else if (a==2){
			numesc="dos";
		} else if (a==3){
			numesc="tres";
		} else if (a==4){
			numesc="cuatro";
		} else if (a==5){
			numesc="cinco";
		} else if (a==6){
			numesc="seis";
		} else if (a==7){
			numesc="siete";
		} else if (a==8){
			numesc="ocho";
		} else if (a==9){
			numesc="nueve";
		}
		return (numesc);
	}
	
	
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println ("Introduce por teclado un numero entero positivo: ");
		int numpos = enter.nextInt();
		if (numpos>=0 && numpos<=9 ) { //condicion si en numero esta entre 0 y 9, inclusives
			System.out.println("El numero introducido es "+numpos+ " y se escribe asi, "+caracter1 (numpos));
		} else {
			System.out.println ("El numero introducido es OTRO distinto a los numeros de 0 a 9, inclusives");
		}
		
		enter.close();
	}

}
