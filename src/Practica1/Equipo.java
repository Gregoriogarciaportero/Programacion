package Practica1;

public class Equipo {
	
	// Atributos de la clase Equipo
	protected String nombre;
	protected String estadio;
	protected int anofundacion;
	protected Jugador [] jugadores;
	protected int puntos;
	protected int partidosGanados;
	protected int partidosPerdidos;
	protected int partidosEmpatados;
	protected int golesAFavor;
	
	// Constructor de la clase Equipo
	public Equipo (String nombre , String estadio , int anofundacion , Jugador [] jugadores,
			int partidosGanados, int partidosPerdidos, int partidosEmpatados) {
		this.nombre = nombre;
		this.estadio = estadio;
		this.anofundacion = anofundacion;
		this.jugadores = jugadores;
		this.puntos = puntosCampeonato (partidosGanados, partidosEmpatados);
		this.partidosGanados = partidosGanados;
		this.partidosPerdidos = partidosPerdidos;
		this.partidosEmpatados = partidosEmpatados;
		this.golesAFavor = totalGolesEquipo (jugadores);
		}
		
	// Métodos get & set, Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
		
	// Metodos get & set, Estadio 
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio (String estadio) {
		this.estadio = estadio;
	}
		
	// Metodos get & set, Fundacion
	public int getanoFundacion( int fundacion) {
		return fundacion;
	}
	public void setanoFundacion (int fundacion) {
		this.anofundacion = anofundacion ;	
	}

	// Metodos get & set, Jugadores
	public Jugador [] getJugadores ( ) {
		return jugadores;
	}
	public void setJugadores (Jugador [] jugadores) {
		this.jugadores = jugadores;	
	}
		
	// Metodos get & set Puntos
	public int getPuntos ( int puntos) {
		return puntos;
	}
	public void setPuntos (int puntos) {
		this.puntos = puntos;	
	}	
		
	// Metodos get & set, partidosGanados
	public int getPartidosGanados ( int partidosGanados) {
		return partidosGanados;
	}
	public void setPartidosGanados (int partidosGanados) {
		this.partidosGanados = partidosGanados;	
	}
		
	// Metodos get & set, partidosPerdidos
	public int getPartidosPerdidos ( int partidosPerdidos) {
		return partidosPerdidos;
	}
	public void setPartidosPerdidos (int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;	
	}
		
	// Metodos get & set, partidosEmpatados
	public int getPartidosEmpatados ( int partidosEmpatados) {
		return partidosEmpatados;
	}
	public void setPartidosEmpatados (int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;	
	}
	
	/*
	 * Pre:...
	 * Post: Método para calcular los puntos de cada equipo,
	 * en funcion del numero de partidos ganados y empatados.
	 */
	public int puntosCampeonato (int a, int b) {
		int puntosEquipo = (a*3) + (b*1);
		return puntosEquipo;
	}
	
	/*
	 * Pre:..
	 * Post: Método para calcular los goles a favor de cada 
	 * equipo, en función de los goles que lleva cada jugador que
	 * pertenece al equipo
	 */
	public int totalGolesEquipo (Jugador [] jugadores) {
		int golestotales= 0;
		for (int i= 0; i<11; i++) { 		
			golestotales=golestotales+jugadores[i].goles;
		}
		return golestotales;
	} 
	
	/* 
	 * Pre:..
	 * Post: Metodo toString de la clase Equipo.
	 */
	@Override
	public String toString() {
		return "Nombre = " + nombre + 
				" --- Puntos = " + puntos + 
				" --- Partidos Ganados = " + partidosGanados +  
				" --- Partidos Empatados = " + partidosEmpatados + 
				" --- Partidos Perdidos = " + partidosPerdidos +
				" --- Goles a favor =  " + golesAFavor;
	}
}
