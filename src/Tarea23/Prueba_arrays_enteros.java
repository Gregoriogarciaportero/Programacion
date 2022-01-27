package Tarea23;

import java.util.ArrayList;


public class Prueba_arrays_enteros {

	public static void main(String[] args) {
		ArrayList <Integer> tablaEnteros = new ArrayList <Integer> ();
		for (int i= 0 ; i <= 6000; i++) {
			tablaEnteros.add(i);
		}
		for (int i =0 ; i<100;i++) { 
				System.out.print (tablaEnteros.get(i));
		}
		for (int num : tablaEnteros) {
			System.out.print(num);
		}

	}

}
