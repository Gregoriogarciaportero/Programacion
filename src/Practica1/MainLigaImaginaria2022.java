package Practica1;

import java.util.Scanner;

	/*
	 * Pre:...
	 * Post:  Programa que genera una Liga de futbol imaginaria y cuando se
	 * ejecuta el programa se muestra por pantalla un meno para dar informacion
	 * sobre valores de la Liga.
	 */

public class MainLigaImaginaria2022 {
	
	/* 
	 * Pre:..
	 * Post: Este método ordena los objetos de la clase Equipo, es decir, los
	 * equipos que componen el campeonato de futbol.
	 * Se envia al método el array llamada "equiposPrimeraDivision" de la clase Equipo.
	 */
	public static void ordenarEquiposPorPuntos ( Equipo [] equiposPrimeraDivision) {
		/* Primer bucle para recorrer el array que contiene los equipos.
		 * En este buclelimito el recorrido a .length-2 ya que empiezo en 
		 * a comparar desde la segunda celda del array en el segundo bucle.
		 */
		for (int i=0; i<=equiposPrimeraDivision.length-2; i++) { 
			// Declaro una variable para fijar el primer objeto del array
			int menor=i;
			/* Segundo bucle para recorrer el array a partir del segundo
			 * objeto (i+1) y lo voy comparando. Si se cumple la condicion del (if)
			 * que es la comparación de puntos que tiene el equipo,
			 * entonces actualizo el valor de menor al encontrado (menor=j) 
			 */
			for (int j=i+1; j<=equiposPrimeraDivision.length-1; j++) {
				if (equiposPrimeraDivision[j].puntos > equiposPrimeraDivision[menor].puntos) {
					menor=j;
				}
			}
			/* 
			 * Creo una variable de la clase equipo para hacer el cambio de 
			 * posicion en el vector donde se almacenan los equipos de la liga.
			 * Y a continuacíon hago el cambio, ya que no puede realizarse
			 * directamente.
			 */
			Equipo aux = equiposPrimeraDivision[i];
			equiposPrimeraDivision[i] = equiposPrimeraDivision[menor];
			equiposPrimeraDivision[menor]= aux;
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
	public static void ordenarJugadoresPorGoles ( Jugador [] jugadoresEquiposLiga) {
		for (int i=0; i<=jugadoresEquiposLiga.length-2; i++) {
			int menor=i;
			for (int j=i+1; j<=jugadoresEquiposLiga.length-1; j++) {
				if (jugadoresEquiposLiga[j].goles > jugadoresEquiposLiga[menor].goles) {
					menor=j;
				}
			}
			Jugador aux = jugadoresEquiposLiga[i];
			jugadoresEquiposLiga[i] = jugadoresEquiposLiga[menor];
			jugadoresEquiposLiga[menor]= aux;
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
	public static void ordenarJugadoresPorTarjetasRojas ( Jugador [] jugadoresEquiposLiga) {
		for (int i=0; i<=jugadoresEquiposLiga.length-2; i++) {
			int menor=i;
			for (int j=i+1; j<=jugadoresEquiposLiga.length-1; j++) {
				if (jugadoresEquiposLiga[j].tarjetasRojas > jugadoresEquiposLiga[menor].tarjetasRojas) {
					menor=j;
				}
			}
			Jugador aux = jugadoresEquiposLiga[i];
			jugadoresEquiposLiga[i] = jugadoresEquiposLiga[menor];
			jugadoresEquiposLiga[menor]= aux;
			
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
	public static void ordenarEquiposPorGoles ( Equipo [] equiposPrimeraDivision) {
		for (int i=0; i<=equiposPrimeraDivision.length-2; i++) {
			int menor=i;
			for (int j=i+1; j<=equiposPrimeraDivision.length-1; j++) {
				if (equiposPrimeraDivision[j].golesAFavor > equiposPrimeraDivision[menor].golesAFavor) {
					menor=j;
				}
			}
			Equipo aux = equiposPrimeraDivision[i];
			equiposPrimeraDivision[i] = equiposPrimeraDivision[menor];
			equiposPrimeraDivision[menor]= aux;
			
		}
	}
	
	/*
	 * METODO MAIN DEL PROGRAMA
	 */
	public static void main (String[] args) {
		
		// Numero máximo de jugadores por equipo.
		int jugadoresMaxEquipo=11; 
		// Número maximo de equipos en la competicion .
		int equiposMaxLiga=15;
		
		/* 
		 * Se crea el array jugadoresEquipoLiga de tamaño informado por el enunciado,
		 * es decir, 165 jugadores participan en la Liga de Futbol.
		 */
		Jugador [] jugadoresEquiposLiga = new Jugador [jugadoresMaxEquipo*equiposMaxLiga];
		 
		/*
		 * Los datos de los jugadores necesarios para ser dados de alta son:
		 *  nombre, dorsal, goles, tarjetas rojas y amarillas.
		 *  Los datos de los 11 primeros jugadores son:
		 */
		jugadoresEquiposLiga[0] = new Jugador ("A1", 1, 4, 1, 4);
		jugadoresEquiposLiga[1] = new Jugador ("B1", 2, 7, 0, 0);
		jugadoresEquiposLiga[2] = new Jugador ("C1", 3, 4, 1, 2);
		jugadoresEquiposLiga[3] = new Jugador ("D1", 4, 6, 2, 1);
		jugadoresEquiposLiga[4] = new Jugador ("E1", 5, 45, 3, 1);
		jugadoresEquiposLiga[5] = new Jugador ("F1", 6, 3, 4, 0);
		jugadoresEquiposLiga[6] = new Jugador ("G1", 7, 5, 0, 0);
		jugadoresEquiposLiga[7] = new Jugador ("H1", 8, 3, 0, 0);
		jugadoresEquiposLiga[8] = new Jugador ("J1", 9, 4, 3, 2);
		jugadoresEquiposLiga[9] = new Jugador ("K1", 10, 8, 2, 0);
		jugadoresEquiposLiga[10] = new Jugador ("L1", 11, 56, 4, 0);
		/* 
		 * Se almacenan los 11 primeros jugadores en un array de la clase Jugador
		 * al que se llama "jugadoresEquipo1"
		 */
		Jugador [] jugadoresEquipo1 =  {jugadoresEquiposLiga[0], jugadoresEquiposLiga[1], 
				jugadoresEquiposLiga[2], jugadoresEquiposLiga[3], jugadoresEquiposLiga[4],
				jugadoresEquiposLiga[5],jugadoresEquiposLiga[6],jugadoresEquiposLiga[7], 
				jugadoresEquiposLiga[8],jugadoresEquiposLiga[9],jugadoresEquiposLiga[10]};
		
		/*
		 * Igualmente se hace con los demas jugadores hasta llegar a los 165.
		 * Se van almacenando en arrays para luego poder asignarlos a la clase de cada
		 * equipo.
		 */
		jugadoresEquiposLiga[11] = new Jugador ("A2", 1, 4, 1, 4);
		jugadoresEquiposLiga[12] = new Jugador ("B2", 2, 7, 0, 0);
		jugadoresEquiposLiga[13] = new Jugador ("C2", 3, 4, 2, 2);
		jugadoresEquiposLiga[14] = new Jugador ("D2", 4, 6, 2, 1);
		jugadoresEquiposLiga[15] = new Jugador ("E2", 5, 45, 3, 1);
		jugadoresEquiposLiga[16] = new Jugador ("F2", 6, 3, 4, 0);
		jugadoresEquiposLiga[17] = new Jugador ("G2", 7, 5, 0, 0);
		jugadoresEquiposLiga[18] = new Jugador ("H2", 8, 3, 0, 0);
		jugadoresEquiposLiga[19] = new Jugador ("J2", 9, 4, 3, 2);
		jugadoresEquiposLiga[20] = new Jugador ("K2", 10, 8, 2, 0);
		jugadoresEquiposLiga[21] = new Jugador ("L2", 11, 57, 4, 0);
		Jugador [] jugadoresEquipo2 = {jugadoresEquiposLiga[11], jugadoresEquiposLiga[12], 
				jugadoresEquiposLiga[13], jugadoresEquiposLiga[14],jugadoresEquiposLiga[15],
				jugadoresEquiposLiga[16],jugadoresEquiposLiga[17],jugadoresEquiposLiga[18],
				jugadoresEquiposLiga[19],jugadoresEquiposLiga[20],jugadoresEquiposLiga[21]};
				
		jugadoresEquiposLiga[22] = new Jugador ("A3", 1, 4, 1, 4);
		jugadoresEquiposLiga[23] = new Jugador ("B3", 2, 7, 15, 0);
		jugadoresEquiposLiga[24] = new Jugador ("C3", 3, 4, 3, 2);
		jugadoresEquiposLiga[25] = new Jugador ("D3", 4, 6, 2, 1);
		jugadoresEquiposLiga[26] = new Jugador ("E3", 5, 45, 3, 1);
		jugadoresEquiposLiga[27] = new Jugador ("F3", 6, 3, 4, 0);
		jugadoresEquiposLiga[28] = new Jugador ("G3", 7, 5, 0, 0);
		jugadoresEquiposLiga[29] = new Jugador ("H3", 8, 3, 0, 0);
		jugadoresEquiposLiga[30] = new Jugador ("J3", 9, 4, 3, 2);
		jugadoresEquiposLiga[31] = new Jugador ("K3", 10, 8, 2, 0);
		jugadoresEquiposLiga[32] = new Jugador ("L3", 11, 58, 4, 0);
		Jugador [] jugadoresEquipo3 = {jugadoresEquiposLiga[22], jugadoresEquiposLiga[23], 
				jugadoresEquiposLiga[24],jugadoresEquiposLiga[25],jugadoresEquiposLiga[26],
				jugadoresEquiposLiga[27],jugadoresEquiposLiga[28],jugadoresEquiposLiga[29],
				jugadoresEquiposLiga[30],jugadoresEquiposLiga[31],jugadoresEquiposLiga[32]};		
		
		jugadoresEquiposLiga[33] = new Jugador ("A4", 1, 4, 1, 4);
		jugadoresEquiposLiga[34] = new Jugador ("B4", 2, 7, 0, 0);
		jugadoresEquiposLiga[35] = new Jugador ("C4", 3, 4, 3, 2);
		jugadoresEquiposLiga[36] = new Jugador ("D4", 4, 6, 2, 1);
		jugadoresEquiposLiga[37] = new Jugador ("E4", 5, 45, 3, 1);
		jugadoresEquiposLiga[38] = new Jugador ("F4", 6, 3, 4, 0);
		jugadoresEquiposLiga[39] = new Jugador ("G4", 7, 5, 0, 0);
		jugadoresEquiposLiga[40] = new Jugador ("H4", 8, 3, 0, 0);
		jugadoresEquiposLiga[41] = new Jugador ("J4", 9, 4, 3, 2);
		jugadoresEquiposLiga[42] = new Jugador ("K4", 10, 8, 2, 0);
		jugadoresEquiposLiga[43] = new Jugador ("L4", 11, 58, 4, 0);
		Jugador [] jugadoresEquipo4 = {jugadoresEquiposLiga[33], jugadoresEquiposLiga[34],
				jugadoresEquiposLiga[35],jugadoresEquiposLiga[36],jugadoresEquiposLiga[37],
				jugadoresEquiposLiga[38],jugadoresEquiposLiga[39],jugadoresEquiposLiga[40],
				jugadoresEquiposLiga[41],jugadoresEquiposLiga[42],jugadoresEquiposLiga[43]};		
		
		jugadoresEquiposLiga[44] = new Jugador ("A5", 1, 4, 1, 4);
		jugadoresEquiposLiga[45] = new Jugador ("B5", 2, 7, 0, 0);
		jugadoresEquiposLiga[46] = new Jugador ("C5", 3, 4, 5, 2);
		jugadoresEquiposLiga[47] = new Jugador ("D5", 4, 6, 2, 1);
		jugadoresEquiposLiga[48] = new Jugador ("E5", 5, 45, 3, 1);
		jugadoresEquiposLiga[49] = new Jugador ("F5", 6, 3, 4, 0);
		jugadoresEquiposLiga[50] = new Jugador ("G5", 7, 5, 0, 0);
		jugadoresEquiposLiga[51] = new Jugador ("H5", 8, 3, 0, 0);
		jugadoresEquiposLiga[52] = new Jugador ("J5", 9, 4, 3, 2);
		jugadoresEquiposLiga[53] = new Jugador ("K5", 10, 8, 2, 0);
		jugadoresEquiposLiga[54] = new Jugador ("L5", 11, 60, 4, 0);
		Jugador [] jugadoresEquipo5 = {jugadoresEquiposLiga[44], jugadoresEquiposLiga[45], 
				jugadoresEquiposLiga[46],jugadoresEquiposLiga[47],jugadoresEquiposLiga[48],
				jugadoresEquiposLiga[49],jugadoresEquiposLiga[50],jugadoresEquiposLiga[51],
				jugadoresEquiposLiga[52],jugadoresEquiposLiga[53],jugadoresEquiposLiga[54]};	
		
		jugadoresEquiposLiga[55] = new Jugador ("A6", 1, 4, 1, 4);
		jugadoresEquiposLiga[56] = new Jugador ("B6", 2, 7, 0, 0);
		jugadoresEquiposLiga[57] = new Jugador ("C6", 3, 4, 6, 2);
		jugadoresEquiposLiga[58] = new Jugador ("D6", 4, 6, 20, 1);
		jugadoresEquiposLiga[59] = new Jugador ("E6", 5, 45, 3, 1);
		jugadoresEquiposLiga[60] = new Jugador ("F6", 6, 3, 4, 0);
		jugadoresEquiposLiga[61] = new Jugador ("G6", 7, 5, 0, 0);
		jugadoresEquiposLiga[62] = new Jugador ("H6", 8, 3, 0, 0);
		jugadoresEquiposLiga[63] = new Jugador ("J6", 9, 4, 3, 2);
		jugadoresEquiposLiga[64] = new Jugador ("K6", 10, 8, 2, 0);
		jugadoresEquiposLiga[65] = new Jugador ("L6", 11, 61, 4, 0);
		Jugador [] jugadoresEquipo6 = {jugadoresEquiposLiga[55], jugadoresEquiposLiga[56], 
				jugadoresEquiposLiga[57],jugadoresEquiposLiga[58],jugadoresEquiposLiga[59],
				jugadoresEquiposLiga[60],jugadoresEquiposLiga[61],jugadoresEquiposLiga[62],
				jugadoresEquiposLiga[63],jugadoresEquiposLiga[64],jugadoresEquiposLiga[65]};
		
		jugadoresEquiposLiga[66] = new Jugador ("A7", 1, 4, 1, 4);
		jugadoresEquiposLiga[67] = new Jugador ("B7", 2, 7, 0, 0);
		jugadoresEquiposLiga[68] = new Jugador ("C7", 3, 4, 7, 2);
		jugadoresEquiposLiga[69] = new Jugador ("D7", 4, 66, 2, 1);
		jugadoresEquiposLiga[70] = new Jugador ("E7", 5, 45, 3, 1);
		jugadoresEquiposLiga[71] = new Jugador ("F7", 6, 3, 4, 0);
		jugadoresEquiposLiga[72] = new Jugador ("G7", 7, 5, 0, 0);
		jugadoresEquiposLiga[73] = new Jugador ("H7", 8, 3, 0, 0);
		jugadoresEquiposLiga[74] = new Jugador ("J7", 9, 4, 3, 2);
		jugadoresEquiposLiga[75] = new Jugador ("K7", 10, 8, 2, 0);
		jugadoresEquiposLiga[76] = new Jugador ("L7", 11, 60, 4, 0);
		Jugador [] jugadoresEquipo7 = {jugadoresEquiposLiga[66], jugadoresEquiposLiga[67], jugadoresEquiposLiga[68]
				,jugadoresEquiposLiga[69],jugadoresEquiposLiga[70],jugadoresEquiposLiga[71],jugadoresEquiposLiga[71],
				jugadoresEquiposLiga[72],jugadoresEquiposLiga[73],jugadoresEquiposLiga[74],jugadoresEquiposLiga[75]};	
		
		jugadoresEquiposLiga[77] = new Jugador ("A8", 1, 4, 1, 4);
		jugadoresEquiposLiga[78] = new Jugador ("B8", 2, 7, 0, 0);
		jugadoresEquiposLiga[79] = new Jugador ("C8", 3, 4, 8, 2);
		jugadoresEquiposLiga[80] = new Jugador ("D8", 4, 6, 2, 1);
		jugadoresEquiposLiga[81] = new Jugador ("E8", 5, 45, 3, 1);
		jugadoresEquiposLiga[82] = new Jugador ("F8", 6, 3, 4, 0);
		jugadoresEquiposLiga[83] = new Jugador ("G8", 7, 5, 0, 0);
		jugadoresEquiposLiga[84] = new Jugador ("H8", 8, 3, 0, 0);
		jugadoresEquiposLiga[85] = new Jugador ("J8", 9, 4, 3, 2);
		jugadoresEquiposLiga[86] = new Jugador ("K8", 10, 8, 2, 0);
		jugadoresEquiposLiga[87] = new Jugador ("L8", 11, 59, 4, 0);
		Jugador [] jugadoresEquipo8 = {jugadoresEquiposLiga[77], jugadoresEquiposLiga[78], 
				jugadoresEquiposLiga[79],jugadoresEquiposLiga[80],jugadoresEquiposLiga[81],
				jugadoresEquiposLiga[82],jugadoresEquiposLiga[83],jugadoresEquiposLiga[84],
				jugadoresEquiposLiga[85],jugadoresEquiposLiga[86],jugadoresEquiposLiga[87]};	
		
		jugadoresEquiposLiga[88] = new Jugador ("A9", 1, 4, 1, 4);
		jugadoresEquiposLiga[89] = new Jugador ("B9", 2, 7, 0, 0);
		jugadoresEquiposLiga[90] = new Jugador ("C9", 3, 4, 7, 2);
		jugadoresEquiposLiga[91] = new Jugador ("D9", 4, 6, 2, 1);
		jugadoresEquiposLiga[92] = new Jugador ("E9", 5, 45, 3, 1);
		jugadoresEquiposLiga[93] = new Jugador ("F9", 6, 3, 4, 0);
		jugadoresEquiposLiga[94] = new Jugador ("G9", 7, 5, 0, 0);
		jugadoresEquiposLiga[95] = new Jugador ("H9", 8, 3, 0, 0);
		jugadoresEquiposLiga[96] = new Jugador ("J9", 9, 4, 3, 2);
		jugadoresEquiposLiga[97] = new Jugador ("K9", 10, 8, 2, 0);
		jugadoresEquiposLiga[98] = new Jugador ("L9", 11, 58, 4, 0);
		Jugador [] jugadoresEquipo9 = {jugadoresEquiposLiga[88], jugadoresEquiposLiga[89], 
				jugadoresEquiposLiga[90],jugadoresEquiposLiga[91],jugadoresEquiposLiga[92],
				jugadoresEquiposLiga[93],jugadoresEquiposLiga[94],jugadoresEquiposLiga[95],
				jugadoresEquiposLiga[96],jugadoresEquiposLiga[97],jugadoresEquiposLiga[98]};	
		
		jugadoresEquiposLiga[99] = new Jugador ("A10", 1, 4, 1, 4);
		jugadoresEquiposLiga[100] = new Jugador ("B10", 2, 7, 0, 0);
		jugadoresEquiposLiga[101] = new Jugador ("C10", 3, 4, 6, 2);
		jugadoresEquiposLiga[102] = new Jugador ("D10", 4, 6, 2, 1);
		jugadoresEquiposLiga[103] = new Jugador ("E10", 5, 45, 3, 1);
		jugadoresEquiposLiga[104] = new Jugador ("F10", 6, 3, 4, 0);
		jugadoresEquiposLiga[105] = new Jugador ("G10", 7, 5, 0, 0);
		jugadoresEquiposLiga[106] = new Jugador ("H10", 8, 3, 0, 0);
		jugadoresEquiposLiga[107] = new Jugador ("J10", 9, 69, 3, 2);
		jugadoresEquiposLiga[108] = new Jugador ("K10", 10, 8, 2, 0);
		jugadoresEquiposLiga[109] = new Jugador ("L10", 11, 57, 4, 0);	
		Jugador [] jugadoresEquipo10 = {jugadoresEquiposLiga[99], jugadoresEquiposLiga[100], 
				jugadoresEquiposLiga[101],jugadoresEquiposLiga[102],jugadoresEquiposLiga[103],
				jugadoresEquiposLiga[104],jugadoresEquiposLiga[105],jugadoresEquiposLiga[106],
				jugadoresEquiposLiga[107],jugadoresEquiposLiga[108],jugadoresEquiposLiga[109]};
		
		jugadoresEquiposLiga[110] = new Jugador ("A11", 1, 4, 1, 4);
		jugadoresEquiposLiga[111] = new Jugador ("B11", 2, 7, 0, 0);
		jugadoresEquiposLiga[112] = new Jugador ("C11", 3, 4, 5, 2);
		jugadoresEquiposLiga[113] = new Jugador ("D11", 4, 6, 2, 1);
		jugadoresEquiposLiga[114] = new Jugador ("E11", 5, 45, 3, 1);				
		jugadoresEquiposLiga[115] = new Jugador ("F11", 6, 3, 4, 0);
		jugadoresEquiposLiga[116] = new Jugador ("G11", 7, 5, 17, 0);
		jugadoresEquiposLiga[117] = new Jugador ("H11", 8, 3, 0, 0);
		jugadoresEquiposLiga[118] = new Jugador ("J11", 9, 4, 3, 2);
		jugadoresEquiposLiga[119] = new Jugador ("K11", 10, 8, 2, 0);
		jugadoresEquiposLiga[120] = new Jugador ("L11", 11, 56, 4, 0);	
		Jugador [] jugadoresEquipo11 = {jugadoresEquiposLiga[110], jugadoresEquiposLiga[111], 
				jugadoresEquiposLiga[112],jugadoresEquiposLiga[113],jugadoresEquiposLiga[114],
				jugadoresEquiposLiga[115],jugadoresEquiposLiga[116],jugadoresEquiposLiga[117],
				jugadoresEquiposLiga[118],jugadoresEquiposLiga[119],jugadoresEquiposLiga[120]};
		
		jugadoresEquiposLiga[121] = new Jugador ("A12", 1, 4, 1, 4);
		jugadoresEquiposLiga[122] = new Jugador ("B12", 2, 7, 0, 0);
		jugadoresEquiposLiga[123] = new Jugador ("C12", 3, 4, 5, 2);
		jugadoresEquiposLiga[124] = new Jugador ("D12", 4, 6, 2, 1);
		jugadoresEquiposLiga[125] = new Jugador ("E12", 5, 45, 3, 1);				
		jugadoresEquiposLiga[126] = new Jugador ("F10", 6, 3, 4, 0);
		jugadoresEquiposLiga[127] = new Jugador ("G12", 7, 5, 0, 0);
		jugadoresEquiposLiga[128] = new Jugador ("H12", 8, 63, 0, 0);
		jugadoresEquiposLiga[129] = new Jugador ("J12", 9, 4, 3, 2);
		jugadoresEquiposLiga[130] = new Jugador ("K12", 10, 8, 2, 0);
		jugadoresEquiposLiga[131] = new Jugador ("L12", 11, 55, 4, 0);
		Jugador [] jugadoresEquipo12 = {jugadoresEquiposLiga[121], jugadoresEquiposLiga[122], jugadoresEquiposLiga[123]
				,jugadoresEquiposLiga[124],jugadoresEquiposLiga[125],jugadoresEquiposLiga[126],jugadoresEquiposLiga[127],
				jugadoresEquiposLiga[128],jugadoresEquiposLiga[129],jugadoresEquiposLiga[130],jugadoresEquiposLiga[131]};
		
		jugadoresEquiposLiga[132] = new Jugador ("A13", 1, 4, 1, 4);
		jugadoresEquiposLiga[133] = new Jugador ("B13", 2, 7, 0, 0);
		jugadoresEquiposLiga[134] = new Jugador ("C13", 3, 4, 4, 2);
		jugadoresEquiposLiga[135] = new Jugador ("D13", 4, 6, 2, 1);
		jugadoresEquiposLiga[136] = new Jugador ("E13", 5, 45, 3, 1);				
		jugadoresEquiposLiga[137] = new Jugador ("F10", 6, 3, 4, 0);
		jugadoresEquiposLiga[138] = new Jugador ("G13", 7, 5, 0, 0);
		jugadoresEquiposLiga[139] = new Jugador ("H13", 8, 3, 0, 0);
		jugadoresEquiposLiga[140] = new Jugador ("J13", 9, 4, 3, 2);
		jugadoresEquiposLiga[141] = new Jugador ("K13", 10, 8, 2, 0);
		jugadoresEquiposLiga[142] = new Jugador ("L13", 11, 54, 4, 0);		
		Jugador [] jugadoresEquipo13 = {jugadoresEquiposLiga[132], jugadoresEquiposLiga[133], 
				jugadoresEquiposLiga[134],jugadoresEquiposLiga[135],jugadoresEquiposLiga[136],
				jugadoresEquiposLiga[137],jugadoresEquiposLiga[138],jugadoresEquiposLiga[139],
				jugadoresEquiposLiga[140],jugadoresEquiposLiga[141],jugadoresEquiposLiga[142]};
		
		jugadoresEquiposLiga[143] = new Jugador ("A14", 1, 4, 1, 4);
		jugadoresEquiposLiga[144] = new Jugador ("B14", 2, 7, 0, 0);
		jugadoresEquiposLiga[145] = new Jugador ("C14", 3, 4, 3, 2);
		jugadoresEquiposLiga[146] = new Jugador ("D14", 4, 6, 2, 1);
		jugadoresEquiposLiga[147] = new Jugador ("E14", 5, 45, 3, 1);				
		jugadoresEquiposLiga[148] = new Jugador ("F10", 6, 3, 4, 0);
		jugadoresEquiposLiga[149] = new Jugador ("G14", 7, 5, 0, 0);
		jugadoresEquiposLiga[150] = new Jugador ("H14", 8, 3, 0, 0);
		jugadoresEquiposLiga[151] = new Jugador ("J14", 9, 4, 3, 2);
		jugadoresEquiposLiga[152] = new Jugador ("K14", 10, 8, 2, 0);
		jugadoresEquiposLiga[153] = new Jugador ("L14", 11, 53, 4, 0);
		Jugador [] jugadoresEquipo14 = {jugadoresEquiposLiga[143], jugadoresEquiposLiga[144], 
				jugadoresEquiposLiga[145],jugadoresEquiposLiga[146],jugadoresEquiposLiga[147],
				jugadoresEquiposLiga[148],jugadoresEquiposLiga[149],jugadoresEquiposLiga[150],
				jugadoresEquiposLiga[151],jugadoresEquiposLiga[152],jugadoresEquiposLiga[153]};
		
		jugadoresEquiposLiga[154] = new Jugador ("A15", 1, 4, 1, 4);
		jugadoresEquiposLiga[155] = new Jugador ("B15", 2, 7, 0, 0);
		jugadoresEquiposLiga[156] = new Jugador ("C15", 3, 4, 2, 2);
		jugadoresEquiposLiga[157] = new Jugador ("D15", 4, 6, 2, 1);
		jugadoresEquiposLiga[158] = new Jugador ("E15", 5, 45, 3, 1);				
		jugadoresEquiposLiga[159] = new Jugador ("F10", 6, 3, 4, 0);
		jugadoresEquiposLiga[160] = new Jugador ("G15", 7, 5, 0, 0);
		jugadoresEquiposLiga[161] = new Jugador ("H15", 8, 3, 0, 0);
		jugadoresEquiposLiga[162] = new Jugador ("J15", 9, 4, 3, 2);
		jugadoresEquiposLiga[163] = new Jugador ("K15", 10, 8, 2, 0);
		jugadoresEquiposLiga[164] = new Jugador ("L15", 11, 52, 4, 0);	
		Jugador [] jugadoresEquipo15 = {jugadoresEquiposLiga[154], jugadoresEquiposLiga[155], 
				jugadoresEquiposLiga[156],jugadoresEquiposLiga[157],jugadoresEquiposLiga[158],
				jugadoresEquiposLiga[159],jugadoresEquiposLiga[160],jugadoresEquiposLiga[161],
				jugadoresEquiposLiga[162],jugadoresEquiposLiga[163],jugadoresEquiposLiga[164]};
		
		/*
		 * Se crea el array "equiposPrimeraDivision" de la clase Equipo.
		 * El cual almacenará los equipos que componen la Liga de futbol.
		 */
		Equipo equiposPrimeraDivision [] = new Equipo [equiposMaxLiga];
		
		/*
		 * Los datos necesarios para dar de alta un equipo son:
		 * Nombre, estadio, año fundacion, partidos ganados,
		 * partidos perdidos, partidos empatados.
		 * Además se le asignan los jugadores, por ejemplo "jugadoresEquipo1", 
		 * que pertenecen a cada equipo.
		 * Anteriormente ya se habia asignado cada jugador al vector de jugadores
		 * de cada equipo. 
		 * dfasfadsfadsf
		 * asfasfsafa
		 * fasfasf
		 */
		equiposPrimeraDivision[0] = new Equipo ("FC1", " Estadio1 ", 1900, jugadoresEquipo1, 19, 6 , 3);
		equiposPrimeraDivision[1] = new Equipo ("FC2", " Estadio2", 1905, jugadoresEquipo2, 18, 6, 4);
		equiposPrimeraDivision[2] = new Equipo ("FC3", " Estadio3 ", 1910, jugadoresEquipo3, 17, 5 , 6);	
		equiposPrimeraDivision[3] = new Equipo ("FC4", " Estadio4 ", 1915, jugadoresEquipo4, 20, 5 , 6);
		equiposPrimeraDivision[4] = new Equipo ("FC5", " Estadio5 ", 1915, jugadoresEquipo5, 15, 5 , 8);
		equiposPrimeraDivision[5] = new Equipo ("FC6", " Estadio6", 1925, jugadoresEquipo6, 14, 5, 9); 
		equiposPrimeraDivision[6] = new Equipo ("FC7", " Estadio7", 1930, jugadoresEquipo7, 23, 5, 0);
		equiposPrimeraDivision[7] = new Equipo ("FC8", " Estadio8", 1935, jugadoresEquipo8, 17, 5, 16);
		equiposPrimeraDivision[8] = new Equipo ("FC9", " Estadio9", 1940, jugadoresEquipo9, 20, 5, 3);
		equiposPrimeraDivision[9] = new Equipo ("FC10", " Estadio10", 1945, jugadoresEquipo10, 15, 0, 13);
		equiposPrimeraDivision[10] = new Equipo ("FC11", " Estadio11", 1950, jugadoresEquipo11, 19, 5, 4);
		equiposPrimeraDivision[11] = new Equipo ("FC12", " Estadio12", 1955, jugadoresEquipo12, 8, 5, 15);
		equiposPrimeraDivision[12] = new Equipo ("FC13", " Estadio13", 1960, jugadoresEquipo13, 7, 5, 16);
		equiposPrimeraDivision[13] = new Equipo ("FC14", " Estadio14", 1970, jugadoresEquipo14, 6, 5, 17);
		equiposPrimeraDivision[14] = new Equipo ("FC15", " Estadio15", 1975, jugadoresEquipo15, 22, 5, 1);
	
		/*
		 * Se crea el menu que solicita el enunciado del ejercicio. Para que el 
		 * usuario elija una opción propuesta. 
		 */
		Scanner enter =new Scanner (System.in);
		System.out.println (" Bienvenido a la Liga de Futbol Imaginaria"
				+ " del curso 1º de DAM Salesianos");
		System.out.println ("-------------------------------------------------");
		System.out.println ( " Elija una de las siguientes opciones ");
		System.out.println ( " 1. Visualizar la clasificación de la Liga ordenada por puntos. ");
		System.out.println ( " 2. Visualizar los 5 máximos goleadores de la Liga. ");
		System.out.println ( " 3. Visualizar los 5 jugadores de la Liga con más expulsiones. ");
		System.out.println ( " 4. Obtener los 3 equipos más goleadores de la Liga. ");
		int opcion = enter.nextInt ();
		
		// Bucle que permite al usuario ejecutar el programa  entre 4 opciones.
		while (opcion !=1 && opcion !=2 && opcion !=3 && opcion !=4) {
			System.out.println ( " Por favor, vuelva a introducir una opcion correcta del menu ");
			System.out.println ("-------------------------------------------------");
			System.out.println ( " Elija una de las siguientes opciones ");
			System.out.println ( " 1. Visualizar clasificación ordenada por puntos. ");
			System.out.println ( " 2. Visualizar los 5 máximos goleadores. ");
			System.out.println ( " 3. Visualizar los 5 jugadores con más expulsiones. ");
			System.out.println ( " 4. Obtener los 3 equipos más goleadores. ");
			opcion = enter.nextInt ();
		}
		/*
		 * La opción 1 del menu, imprime por pantalla la clasificacion por 
		 * equipos ordenados de mayor a menor.
		 * De cada equipo se imprime el nombre, puntos, partidos ganados, 
		 * empatados, perdidos y goles a favor.  
		 */
		if (opcion == 1 ) {
			// Llamada al metodo ordenar por "puntos" los objetos de la clase Equipo.
			ordenarEquiposPorPuntos (equiposPrimeraDivision);
			//Bucle para imprimir los todos equipos ordenados. 
			for (int i = 0; i<equiposPrimeraDivision.length; i++) { 
				System.out.println(equiposPrimeraDivision[i].toString());
			} 
			
		/*
		 * La opción 2 del menu, imprime por pantalla los 5 jugadores con más goles.
		 * Muestra el nombre de los jugadores y sus goles, ordenados 
		 * de mayor a menor.
		 */		
		}  else if (opcion == 2 ) {
			// Llamada al metodo ordenar por atributo "goles" los objetos de la clase Jugador.
			ordenarJugadoresPorGoles (jugadoresEquiposLiga);
			//Bucle para imprimir los 5 primeros jugadores ordenados. 
			for (int i = 0; i<5; i++) { 
				System.out.println(jugadoresEquiposLiga[i].toString());
			}	
			
		/*
		 * La opción 3 del menu, imprime por pantalla los 5 jugadores con más expulsiones
		 * o tarjetas rojas. Muestra el nombre del jugador y el numero
		 * de expulsiones de mayor a menor.
		 */
		} else if ( opcion == 3 ) {
			// Llamada al metodo ordenar por atributo "tarjetasRojas" los objetos de la clase Jugador
			ordenarJugadoresPorTarjetasRojas (jugadoresEquiposLiga);
			//Bucle para imprimir los 5 primeros jugadores ordenados. 
			for (int i = 0; i<5; i++) { 
				System.out.println( " Nombre = " + jugadoresEquiposLiga[i].nombre + 
						" ------" + " Expulsiones = "  + jugadoresEquiposLiga[i].tarjetasRojas);	
			} 
			
		/*
		 * La opción 4 del menu, imprime por pantalla el nombre de los 3 equipos
		 * más goleadores. Muestra el nombre del equipo y sus goles,
		 * ordenados de mayor a menor.
		 */	
		} else if (opcion == 4 ) {
			// Llamada al metodo ordenar por atributo "golesAFavor" los objetos de la clase Equipo
			ordenarEquiposPorGoles (equiposPrimeraDivision);
			//Bucle para imprimir los 3primeros equipos ordenados. 
			for (int i = 0; i<3; i++) { 
				System.out.println( " Nombre = " + equiposPrimeraDivision[i].nombre + "------" + " Goles a favor = "  + equiposPrimeraDivision[i].golesAFavor);
			}
		}
		enter.close ();
	}
	
}
	
	
