package Tarea23;

public class Coche {
	protected String matricula;
	protected String color;
	protected int numPuertas;
	
	public Coche (String matricula , String color , int numPuertas) { 
		this.matricula = matricula;
		this.color = color;
		this.numPuertas = numPuertas; 
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	@Override
	public String toString() {
		return " Coche -> { " + color + " " + matricula + " " + numPuertas + " } ";
	}
	
}
