package Tarea21;

public class Electrodomestico {

	protected double precioBase;
	protected String color;
	protected String consumoEnergetico;
	protected double peso;
	
	//Constructor por defecto
	public Electrodomestico (){
		this.precioBase = 100;
		this.peso = 5.0;
		this.color="blanco";
		this.consumoEnergetico = "F";		
	}
	
	//Constructor con precio y peso, el resto atributos por defecto.
	public Electrodomestico (double precioBase , double peso) {
		this.precioBase = precioFinal (consumoEnergetico, peso, precioBase);
		this.peso = peso;
		this.color="blanco";
		this.consumoEnergetico = "F";
	}
	
	//Constructor con todos atributos solicitados
	public Electrodomestico (double precioBase , double peso ,
			String color, String consumoEnergetico) {
		this.precioBase = precioFinal (consumoEnergetico, peso, precioBase);
		this.peso = peso;
		this.color = comprobarColor (color);
		this.consumoEnergetico = comprobarConsumoEnergetico (consumoEnergetico);
	}
	
	
	// Metodos get de todos los atributos.
	
	public double getPrecioBase () {
		return precioBase;
	}
	public void setPrecioBase (double precioBase) {
		this.precioBase = precioBase;
	}
	
	public double getPeso () {
		return peso;
	}
	public void setPeso (double peso) {
		this.peso = peso;
		precioFinal(consumoEnergetico, peso, precioBase);
	}
	
	public String getColor () {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getConsumoEnergetico () {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	
	
	/* Pre:..
	 * Post: Metodo que comprueba que so la letra introducida en el
	 * atributo consumoEnergetico esta incluida en el array letrasConsumoEnergetico.
	 */
	public String comprobarConsumoEnergetico (String consumoEnergetico) {
		if (!consumoEnergetico.equalsIgnoreCase("a") && 
			!consumoEnergetico.equalsIgnoreCase("b") &&
			!consumoEnergetico.equalsIgnoreCase("c") &&
			!consumoEnergetico.equalsIgnoreCase("d")) {
				consumoEnergetico =("f"); // Utilizar (=) no es una comparacion
		}
		
		// bucle que recorre el array de letras permitidas
	
		/*for (int i=0 ; i < letrasConsumoEnergetico.length ; i++) {
			if (consumoEnergetico.equalsIgnoreCase(letrasConsumoEnergetico[i])) {
				break;
		} else {
			consumoEnergetico.equals("F");
			}
		} */
		return consumoEnergetico;	
	}
	
	/* Pre:..
	 * Post: Metodo que permite asignar solamente colores establecidos
	 * segun el array colores
	 */ 
	 
	public String comprobarColor (String color) {
		String colores [] = { "blanco", " negro" , "rojo" , "azul" ,"gris" };
		for (int i=0 ; i < colores.length ; i++) {
			if (color.equalsIgnoreCase(colores[i])) {
				break;
		} else {
			consumoEnergetico.equals("blanco");
			}
		} 
		return color;
	}
	
	/*
	 * Pre:..
	 * Post: Metodo que incrementa el precio base en función de la letra de 
	 * consumo energetico y del peso del producto.
	 */
	public double precioFinal(String consumoEnergetico, double peso, double precioBase) {
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
		return precioBase;
	}
	
	public String toString() {
		return "Electrodomestico " + "\nPrecio= " + precioBase + "\ncolor = " + color + "\nConsumo Energetico = "+ consumoEnergetico +
				" \nPeso = " + peso ;
	
	
	}
}	
	
	

