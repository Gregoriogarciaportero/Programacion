package Practica1;

public class Liga {
	private String nombre;
	private Equipo [] clasificacion;
	
	// Metodos get & set, Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	// Metodos get & set, Clasificacion
	public Equipo [] getClasificacion ( Equipo [] clasificacion) {
		return clasificacion;
	}
	public void setClasificacion (Equipo [] clasificacion) {
		this.clasificacion = clasificacion;	
	}
}
