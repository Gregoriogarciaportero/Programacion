package Tarea21;

public class Lavadora extends Electrodomestico {
	
	private double carga;

	
	// Constructor por defecto
	public Lavadora () {
		super ();
		this.carga = 5.0;
	}
	
	// Constructor con el precio y peso. El resto de atributos por defecto
	public Lavadora (double precioBase , double peso) {
		super (precioBase, peso);
		this.carga = 5.0;
		
	}	
	
	// Constructor con la carga y el resto atributos herederos
	public Lavadora (double precioBase, double peso, String color, String consumoEnergetico,
			 double carga) {
		super (precioBase, peso, color, consumoEnergetico );
		this.carga = carga;
	}	

	public double getCarga() {
		return carga;
	}
	public void setCarga (double carga) {
		this.carga = carga;
		precioFinal(consumoEnergetico, peso, precioBase);
	}
	
	/* Pre:..
	 * Post: Metodo para actualizar el precioBase de electrodomestico
	 * en el caso de que la carga de la lavadora sea superior a 30 kg.
	 */
	@Override
	public double precioFinal(String consumoEnergetico, double peso, double precioBase) {
		
		//super.precioFinal (); Te evitas copiar lo de abajo
		
		int incrementoPreciosConsumoEnergetico [] = { 100, 80, 60, 50, 30, 10 };
		String letrasConsumoEnergetico [] = {"a" , "b" , "c" , "d" , "f"};
		for (int i = 0; i<letrasConsumoEnergetico.length; i++) {
			if (consumoEnergetico.equalsIgnoreCase(letrasConsumoEnergetico[i])){
				precioBase = precioBase + incrementoPreciosConsumoEnergetico[i];
				break;
			}
		}
		double escalaPesos [] = {0, 20, 50, 80};
		int incrementoPreciosPeso [] = { 10, 50, 80, 100 };
		for (int i=0; i < escalaPesos.length-1; i++) {
			if (peso > escalaPesos[i] && peso < escalaPesos[i+1]) {
				precioBase = precioBase + incrementoPreciosPeso [i];
				break;
			}
				
		}
		if (carga>30) {
			precioBase= precioBase + 50;
		}
		return precioBase;
	}
	@Override
	public String toString() {
		return "Lavadora " + "\nPrecio= " + precioBase + "\ncolor = " + color + "\nConsumo Energetico = "+ consumoEnergetico +
				" \nPeso = " + peso + " \nCarga = " + carga;
	}
}
