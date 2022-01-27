package Tarea25_ejercicio3;

public class Persona {
	private String nombre;
	private String dni;
	
	// Constructor de la clase Persona.
		public Persona (String nombre ,  String dni) {
			this.nombre = nombre;
			this.dni = dni;	
		}
		
		// Metodos get & set Nombre
		public String getNombre() {
			return nombre;
		}
		public void setNombre (String nombre) {
			this.nombre = nombre;
		}
		
		// Metodos get & set DNI
		public String getDni() {
			return dni;
		}
		public void setDni (String dni) {
			this.dni = dni;
		}
		// Metodo toString de la clase Persona.
		@Override
		public String toString() {
			return "Nombre = " + nombre + " --- DNI Goles = " + dni;
		}
	}
	
	
	
	

