package Tarea21;

public class Ejercicio3 {

	public static void main(String[] args) {
		Lavadora lavadora1 = new Lavadora ();
		System.out.println(lavadora1.toString());
		
		lavadora1.setCarga(40);
		System.out.println(lavadora1.toString());
		
		lavadora1.setPeso(50);
		System.out.println(lavadora1.toString());
		
		Electrodomestico electrodomestico1 = new Electrodomestico ();
		Electrodomestico electrodomestico2 = new Electrodomestico (500 , 45);
		Electrodomestico electrodomestico3 = new Electrodomestico (150 , 21, "rojo", "c");
		System.out.println(lavadora1.toString());
	}
}


	


