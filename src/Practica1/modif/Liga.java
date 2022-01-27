package Practica1.modif;

public class Liga {
	protected String nombre;
	protected Equipo [] clasificacion;
	
	//Constructor de la clase Liga
	public Liga (String nombre, Equipo [] clasificacion) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
	}
	
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
	
	public void ordenarEquiposPorPuntos () {
		/* Primer bucle para recorrer el array que contiene los equipos.
		 * En este buclelimito el recorrido a .length-2 ya que empiezo en 
		 * a comparar desde la segunda celda del array en el segundo bucle.
		 */
		for (int i=0; i<=clasificacion.length-2; i++) { 
			// Declaro una variable para fijar el primer objeto del array
			int menor=i;
			/* Segundo bucle para recorrer el array a partir del segundo
			 * objeto (i+1) y lo voy comparando. Si se cumple la condicion del (if)
			 * que es la comparación de puntos que tiene el equipo,
			 * entonces actualizo el valor de menor al encontrado (menor=j) 
			 */
			for (int j=i+1; j<=clasificacion.length-1; j++) {
				if (clasificacion[j].puntos > clasificacion[menor].puntos) {
					menor=j;
				}
			}
			/* 
			 * Creo una variable de la clase equipo para hacer el cambio de 
			 * posicion en el vector donde se almacenan los equipos de la liga.
			 * Y a continuacíon hago el cambio, ya que no puede realizarse
			 * directamente.
			 */
			Equipo aux = clasificacion[i];
			clasificacion[i] = clasificacion[menor];
			clasificacion[menor]= aux;
		}
		//Bucle para imprimir los todos equipos ordenados. 
		for (int i = 0; i<clasificacion.length; i++) { 
			System.out.println(clasificacion[i].toString());
		}
	}
	
	
	/*
	 * Pre:...
	 * Post: Este método es similar al explicado anteriormente. Se utiliza para
	 * ordenar los jugadores que componen la Liga, pero por el atributo "goles".
	 * Se envia al método el array llamado "jugadoresEquiposLiga" de la clase Jugador.
	 * El desarrollo (ordenar)es similar al anterior metodo, pero en este caso se
	 * ordena la tabla segun el atributo "goles" del jugador.
	 */
	public void ordenarJugadoresPorGoles () {
		Jugador [] tablaGolesJugadores  = new Jugador [165]; 
		int contador = 0;
		for ( int i = 0; i < clasificacion.length; i++ ) {
			Equipo e = clasificacion[i];
			for (int j = 0; j < e.getJugadores().length; j++ ) {
				tablaGolesJugadores[contador]= e.getJugadores()[j];
				contador++;
			}
		}
		for (int i=0; i<=tablaGolesJugadores.length-2; i++) {
			int menor=i;
			for (int j=i+1; j<=tablaGolesJugadores.length-1; j++) {
				if (tablaGolesJugadores[j].getGoles() > tablaGolesJugadores[menor].getGoles()) {
					menor=j;
				}
			}
			Jugador aux = tablaGolesJugadores[i];
			tablaGolesJugadores[i] = tablaGolesJugadores[menor];
			tablaGolesJugadores[menor]= aux;
		}
		//Bucle para imprimir los 5 primeros jugadores ordenados. 
		for (int i = 0; i<5; i++) { 
			System.out.println(tablaGolesJugadores[i].toString());
		}	
	}
	
	
	/*
	 * Pre:...
	 * Post: Este método es similar al explicado al del primer lugar. Se utiliza para
	 * ordenar los jugadores que componen la Liga pero por el atributo "tarjetasRojas".
	 * Se envia al método el array llamado "jugadoresEquiposLiga" de la clase Jugador.
	 * El desarrollo (ordenar)es similar al anterior metodo, pero en este caso se
	 * ordena la tabla segun el atributo "tarjetasRojas" del jugador.
	 */
	public void ordenarJugadoresPorTarjetasRojas () {
		Jugador [] tablaTarjetasRojas  = new Jugador [165];
		int contador = 0;
		for ( int i = 0; i < clasificacion.length; i++ ) {
			Equipo e = clasificacion[i];
			for (int j = 0; j < e.getJugadores().length; j++ ) {
				tablaTarjetasRojas[contador]= e.getJugadores()[j];
			contador++;
			}
		}
		for (int i=0; i<=tablaTarjetasRojas.length-2; i++) {
			int menor=i;
			for (int j=i+1; j<=tablaTarjetasRojas.length-1; j++) {
				if (tablaTarjetasRojas[j].getTarjetasRojas() > tablaTarjetasRojas[menor].getTarjetasRojas()) {
					menor=j;
				}
			}
			Jugador aux = tablaTarjetasRojas[i];
			tablaTarjetasRojas[i] =tablaTarjetasRojas[menor];
			tablaTarjetasRojas[menor]= aux;
		}
		//Bucle para imprimir los 5 primeros jugadores ordenados. 
		for (int i = 0; i<5; i++) { 
			System.out.println( " Nombre = " + tablaTarjetasRojas[i].nombre + 
					" ------" + " Expulsiones = "  + tablaTarjetasRojas[i].tarjetasRojas);
		}
	}
	
		
	/*
	 * Pre:...
	 * Post: Este método es similar al explicado al del primer lugar. Se utiliza para
	 * ordenar los equipos que componen la Liga pero por el atributo "goles".
	 * Se envia al método el array llamado "equiposPrimeraDivision" de la clase Equipo.
	 * El desarrollo (ordenar)es similar al anterior metodo, pero en este caso se
	 * ordena la tabla segun el atributo ""goles" del equipo.
	 */
	public void ordenarEquiposPorGoles ( ) {
		for (int i=0; i<=clasificacion.length-2; i++) {
			int menor=i;
			for (int j=i+1; j<=clasificacion.length-1; j++) {
				if (clasificacion[j].golesAFavor > clasificacion[menor].golesAFavor) {
					menor=j;
				}
			}
			Equipo aux = clasificacion[i];
			clasificacion[i] = clasificacion[menor];
			clasificacion[menor]= aux;
		}
		for (int i = 0; i<3; i++) { 
			System.out.println( " Nombre = " + clasificacion[i].nombre + "------" + " Goles a favor = "  + clasificacion[i].golesAFavor);
		}
	}
}
