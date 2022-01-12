package Tarea21;

public class Television extends Electrodomestico{

	private double resolucion;
	private boolean sintonizador;
	
	
	// Constructor por defecto
	public Television (double pulgadas, boolean sintonizador) {
		super();
		this.resolucion = 20.0;
		this.sintonizador = false;
	}
	
	// Constructor con el precio y peso. El resto de atributos por defecto
	public Television (double precioBase , double peso, double resolucion,
		boolean sintonizador) {
		super (precioBase, peso);
		this.resolucion = 20.0;
		this.sintonizador = false;
		
	}
	
	// Constructor con resolcion y sintonizador y el resto atributos herederos.
	public Television (double precioBase, double peso, String color, String consumoEnergetico,
			double resolucion, boolean sintonizador) {
		super (precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
	public double getResolcion() {
		return resolucion;
	}
	public void setResolucion (double resolucion) {
		this.resolucion = resolucion;
	}
	
	public boolean getSintonizador() {
		return sintonizador;
	}
	public void setSintonizador (boolean Sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	
	// super.precioFinal () { evita copiar el metodo entero de la clase madre.
	public double precioFinal(double resolucion, boolean sintonizador) {
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
		if (resolucion>40) {
			precioBase= precioBase + (0.3*precioBase);
		}
		if (!sintonizador) {
			precioBase = precioBase + 50;
		}
		return precioBase;
	}
	
}

