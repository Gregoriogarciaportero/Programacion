package Tarea21;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private double altura;
	
	/* Constructor con todos los atributos como parámetro:
	 * nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
	 */
	public Persona (String nombre, int edad, String dni, String sexo,  double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "";
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	// Contructor con atributos parametros nombre, edad y sexo, el resto por defecto.
	public Persona (String nombre, int edad, String sexo) { 
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "";
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}
	//Constructor con todos los atributos por defecto
	public Persona () { 
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = "";
		this.peso = 0;
		this.altura = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad () {
		return edad;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public String dni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni; 
	}
	
	public String getSexo( String sexo) {
		return sexo;
	}
		
	public void setSexo(String sexo) {
		this.sexo = sexo;	
	}
	
	public double peso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso; 
	}
	
	public double altura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura; 
	}
	
	
	/* Pre:..
	 * Post: este métido calculara si la persona esta en su peso ideal
	 *	 (peso en kg/(altura^2  en m)), si esta fórmula devuelve un
	 * 	  valor menor que 20, la función devuelve un -1, si devuelve
	 *	  un número entre 20 y 25 (incluidos), significa que esta por
	 * 	  debajo de su peso ideal la función devuelve un 0  y si 
	 *	  devuelve un valor mayor que 25 significa que tiene
	 * 	  sobrepeso, la función devuelve un 1.
	 */
	
	public int calcularIMC (double peso, double altura ) {
		double imc = peso / (altura*altura);
		int escala = 0;
		// Si escala = -1 -> esta debajo de su peso ideal
		if (imc < 20) {
			escala=-1;
		// Si escala = 0 -> esta en su peso ideal
		} else if (20 <= imc && imc <=25) {
			escala = 0 ;
		// Si escala = 1 -> esta en sobrepeso
		} else {
			escala = 1;
		}
		return escala;
	}
	
	/* Pre:..
	 * Post: Metodo que indica si es mayor de edad, devuelve un booleano.
	 * 		True = es mayor de edad
	 * 		False = NO es maypor de edad
	 */
	public boolean esMayorDeEdad (int edad) {
		boolean mayorEdad = true;
		if (edad < 18) {
			mayorEdad = false;
		}
		return mayorEdad;
	}
	
	/*
	 * Pre:..
	 * Post:comprobarSexo(String sexo): comprueba que el sexo
	 *	  introducido es correcto. Si no es correcto, será H.
	 *	  No es visible al exterior.
	 */
	private String comprobarSexo (String sexo) {
		//String hombre = "H";
		//String mujer = "M";
		if (!sexo.equals("M")) {
			sexo = "H";
		}
		return sexo;
	}
	
	/*
	 * Pre:..
	 * Post: Método que devuelve toda la información del objeto.
	 */
	
	@Override
	public String toString() {
		return " Nombre = " + nombre + " Edad = " + edad + " DNI = " + dni + 
				" Sexo = " + sexo + " Peso = "+ peso + " Altura = "+ altura;
	}
	
	/* 
	 * Pre:..
	 * Post:  generaDNI(): genera un número aleatorio de 8 cifras,
	 *	  genera a partir de este su número su letra
	 *	  correspondiente. Este método será invocado cuando se construya el objeto.
	 */
	public String generarDNI() {
		String dni ="";
		int dniMinimo=10000000;
		int dniMaximo=99999999;
		int numDni = (int)Math.floor(Math.random()* ( dniMaximo - dniMinimo +1) + dniMinimo);    
	    String cadenadni= String.valueOf(numDni);
		String [] tablaletraDni = new String [23];
		tablaletraDni [0]="T"; tablaletraDni [1]="R";tablaletraDni [2]="W";
		tablaletraDni [3]="A";tablaletraDni [4]="G";tablaletraDni [5]="M";
		tablaletraDni [6]="Y";tablaletraDni [7]="F";tablaletraDni [8]="P";
		tablaletraDni [0]="D";tablaletraDni [0]="X";tablaletraDni [0]="B";
		tablaletraDni [0]="N";tablaletraDni [0]="J";tablaletraDni [0]="Z";
		tablaletraDni [0]="S";tablaletraDni [0]="Q";tablaletraDni [0]="V";
		tablaletraDni [0]="H";tablaletraDni [0]="L";tablaletraDni [0]="C";
		tablaletraDni [0]="K";tablaletraDni [0]="E";
		// Calculo resto del  
		int resto = numDni % 23;
		String letra = tablaletraDni[resto]; 
		dni = ("cadenadni"+"letra");
		
		char letraDni = calculaLetra (numDni);
		String dni2=cadenadni+letraDni;
		//convertir a String letraDni
		return dni;
	}
	
	public char calculaLetra (int dni) { 
	    String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE"; 
	    int modulo= dni % 23; 
	    char letra = juegoCaracteres.charAt(modulo); 
	    return letra; 
	}
}


