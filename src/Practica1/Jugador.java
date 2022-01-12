package Practica1;

public class Jugador {
	
	//Atributos de la clase Equipo.
	protected String nombre;
	protected int dorsal;
	protected int goles;
	protected int tarjetasRojas;
	protected int tarjetasAmarillas;
	
	// Constructor de la clase Jugador.
	public Jugador (String nombre ,  int dorsal , int goles, 
			int tarjetasRojas, int tarjetasAmarillas) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles; 
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	
	// Metodos get & set Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	// Metodos get & set Dorsal
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal (int dorsal) {
		this.dorsal = dorsal;
	}
	
	// Metodos get & set Goles
	public int getGoles( int goles) {
		return goles;
	}
	public void setGoles (int goles) {
		this.goles = goles;	
	}

	// Metodos get & set TarjetasRojas
	public int getTarjetasRojas ( int tarjetasRojas) {
		return tarjetasRojas;
		}
	public void setTarjetasRojas (int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;	
	}
	
	// Metodos get & set TarjetasAmarillas
	public int getTarjetasAmartillas ( int tarjetasAmarillas) {
		return tarjetasAmarillas;
	}
	public void setTarjetasAmarillas (int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;	
	}
	
	// Metodo toString de la clase Jugador.
	@Override
	public String toString() {
		return "Nombre = " + nombre + " --- Goles = " + goles;
	}
}
