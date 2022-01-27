package Tarea23;

import java.util.ArrayList;

public class Prueba_arrayList_objetos {
	
	public static void main(String[] args) {
		ArrayList <Coche> ventas = new ArrayList<Coche> ();
		Coche c1 = new Coche ( "4567Y", "amarillo", 5);
		ventas.add(c1);
		Coche c2 = new Coche ( "2334R", "rojo", 4);
		ventas.add(c2);
		Coche c3 = new Coche ( "2322R", "verde", 5);
		ventas.add(c3);
		Coche c4 = new Coche ( "4434R", "azul", 4);
		ventas.add(c4);
		
			
		for (int i= 0 ; i<ventas.size (); i++) {
			if ( ventas.get(i).getColor().equalsIgnoreCase("Rojo") &&
					ventas.get(i).getNumPuertas() == 4 ) {
				System.out.println (ventas.get(i).toString());
			}
		}
	}
}


	

