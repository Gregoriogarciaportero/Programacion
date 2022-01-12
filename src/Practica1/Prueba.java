package Practica1;

public class Prueba {
	

/*
Jugador [] jugadoresEquipo1 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo1[0] = new Jugador ("A1", 1, 4, 1, 4);
jugadoresEquipo1[1] = new Jugador ("B1", 2, 7, 0, 0);
jugadoresEquipo1[2] = new Jugador ("C1", 3, 4, 1, 2);
jugadoresEquipo1[3] = new Jugador ("D1", 4, 6, 2, 1);
jugadoresEquipo1[4] = new Jugador ("E1", 5, 45, 3, 1);
jugadoresEquipo1[5] = new Jugador ("F1", 6, 3, 4, 0);
jugadoresEquipo1[6] = new Jugador ("G1", 7, 5, 0, 0);
jugadoresEquipo1[7] = new Jugador ("H1", 8, 3, 0, 0);
jugadoresEquipo1[8] = new Jugador ("J1", 9, 4, 3, 2);
jugadoresEquipo1[9] = new Jugador ("K1", 10, 8, 2, 0);
jugadoresEquipo1[10] = new Jugador ("L1", 11, 56, 4, 0);
//Datos de los jugadores del Equipo2
Jugador [] jugadoresEquipo2 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo2[0] = new Jugador ("A2", 1, 4, 1, 4);
jugadoresEquipo2[1] = new Jugador ("B2", 2, 7, 0, 0);
jugadoresEquipo2[2] = new Jugador ("C2", 3, 4, 2, 2);
jugadoresEquipo2[3] = new Jugador ("D2", 4, 6, 2, 1);
jugadoresEquipo2[4] = new Jugador ("E2", 5, 45, 3, 1);
jugadoresEquipo2[5] = new Jugador ("F2", 6, 3, 4, 0);
jugadoresEquipo2[6] = new Jugador ("G2", 7, 5, 0, 0);
jugadoresEquipo2[7] = new Jugador ("H2", 8, 3, 0, 0);
jugadoresEquipo2[8] = new Jugador ("J2", 9, 4, 3, 2);
jugadoresEquipo2[9] = new Jugador ("K2", 10, 8, 2, 0);
jugadoresEquipo2[10] = new Jugador ("L2", 11, 57, 4, 0);
//Datos de los jugadores del Equipo3
Jugador [] jugadoresEquipo3 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo3[0] = new Jugador ("A3", 1, 4, 1, 4);
jugadoresEquipo3[1] = new Jugador ("B3", 2, 7, 0, 0);
jugadoresEquipo3[2] = new Jugador ("C3", 3, 4, 3, 2);
jugadoresEquipo3[3] = new Jugador ("D3", 4, 6, 2, 1);
jugadoresEquipo3[4] = new Jugador ("E3", 5, 45, 3, 1);
jugadoresEquipo3[5] = new Jugador ("F3", 6, 3, 4, 0);
jugadoresEquipo3[6] = new Jugador ("G3", 7, 5, 0, 0);
jugadoresEquipo3[7] = new Jugador ("H3", 8, 3, 0, 0);
jugadoresEquipo3[8] = new Jugador ("J3", 9, 4, 3, 2);
jugadoresEquipo3[9] = new Jugador ("K3", 10, 8, 2, 0);
jugadoresEquipo3[10] = new Jugador ("L3", 11, 58, 4, 0);
//Datos de los jugadores del Equipo4
Jugador [] jugadoresEquipo4 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo4[0] = new Jugador ("A4", 1, 4, 1, 4);
jugadoresEquipo4[1] = new Jugador ("B4", 2, 7, 0, 0);
jugadoresEquipo4[2] = new Jugador ("C4", 3, 4, 4, 2);
jugadoresEquipo4[3] = new Jugador ("D4", 4, 6, 2, 1);
jugadoresEquipo4[4] = new Jugador ("E4", 5, 45, 3, 1);
jugadoresEquipo4[5] = new Jugador ("F4", 6, 3, 4, 0);
jugadoresEquipo4[6] = new Jugador ("G4", 7, 5, 0, 0);
jugadoresEquipo4[7] = new Jugador ("H4", 8, 3, 0, 0);
jugadoresEquipo4[8] = new Jugador ("J4", 9, 4, 3, 2);
jugadoresEquipo4[9] = new Jugador ("K4", 10, 8, 2, 0);
jugadoresEquipo4[10] = new Jugador ("L4", 11, 59, 4, 0);
//Datos de los jugadores del Equipo5
Jugador [] jugadoresEquipo5 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo5[0] = new Jugador ("A5", 1, 4, 1, 4);
jugadoresEquipo5[1] = new Jugador ("B5", 2, 7, 0, 0);
jugadoresEquipo5[2] = new Jugador ("C5", 3, 4, 5, 2);
jugadoresEquipo5[3] = new Jugador ("D5", 4, 6, 2, 1);
jugadoresEquipo5[4] = new Jugador ("E5", 5, 45, 3, 1);
jugadoresEquipo5[5] = new Jugador ("F5", 6, 3, 4, 0);
jugadoresEquipo5[6] = new Jugador ("G5", 7, 5, 0, 0);
jugadoresEquipo5[7] = new Jugador ("H5", 8, 3, 0, 0);
jugadoresEquipo5[8] = new Jugador ("J5", 9, 4, 3, 2);
jugadoresEquipo5[9] = new Jugador ("K5", 10, 8, 2, 0);
jugadoresEquipo5[10] = new Jugador ("L5", 11, 60, 4, 0);
//Datos de los jugadores del Equipo6
Jugador [] jugadoresEquipo6 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo6[0] = new Jugador ("A6", 1, 4, 1, 4);
jugadoresEquipo6[1] = new Jugador ("B6", 2, 7, 0, 0);
jugadoresEquipo6[2] = new Jugador ("C6", 3, 4, 6, 2);
jugadoresEquipo6[3] = new Jugador ("D6", 4, 6, 2, 1);
jugadoresEquipo6[4] = new Jugador ("E6", 5, 45, 3, 1);
jugadoresEquipo6[5] = new Jugador ("F6", 6, 3, 4, 0);
jugadoresEquipo6[6] = new Jugador ("G6", 7, 5, 0, 0);
jugadoresEquipo6[7] = new Jugador ("H6", 8, 3, 0, 0);
jugadoresEquipo6[8] = new Jugador ("J6", 9, 4, 3, 2);
jugadoresEquipo6[9] = new Jugador ("K6", 10, 8, 2, 0);
jugadoresEquipo6[10] = new Jugador ("L6", 11, 61, 4, 0);
//Datos de los jugadores del Equipo7
Jugador [] jugadoresEquipo7 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo7[0] = new Jugador ("A7", 1, 4, 1, 4);
jugadoresEquipo7[1] = new Jugador ("B7", 2, 7, 0, 0);
jugadoresEquipo7[2] = new Jugador ("C7", 3, 4, 7, 2);
jugadoresEquipo7[3] = new Jugador ("D7", 4, 6, 2, 1);
jugadoresEquipo7[4] = new Jugador ("E7", 5, 45, 3, 1);
jugadoresEquipo7[5] = new Jugador ("F7", 6, 3, 4, 0);
jugadoresEquipo7[6] = new Jugador ("G7", 7, 5, 0, 0);
jugadoresEquipo7[7] = new Jugador ("H7", 8, 3, 0, 0);
jugadoresEquipo7[8] = new Jugador ("J7", 9, 4, 3, 2);
jugadoresEquipo7[9] = new Jugador ("K7", 10, 8, 2, 0);
jugadoresEquipo7[10] = new Jugador ("L7", 11, 60, 4, 0);
//Datos de los7 jugadores del Equipo8
Jugador [] jugadoresEquipo8 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo8[0] = new Jugador ("A8", 1, 4, 1, 4);
jugadoresEquipo8[1] = new Jugador ("B8", 2, 7, 0, 0);
jugadoresEquipo8[2] = new Jugador ("C8", 3, 4, 8, 2);
jugadoresEquipo8[3] = new Jugador ("D8", 4, 6, 2, 1);
jugadoresEquipo8[4] = new Jugador ("E8", 5, 45, 3, 1);
jugadoresEquipo8[5] = new Jugador ("F8", 6, 3, 4, 0);
jugadoresEquipo8[6] = new Jugador ("G8", 7, 5, 0, 0);
jugadoresEquipo8[7] = new Jugador ("H8", 8, 3, 0, 0);
jugadoresEquipo8[8] = new Jugador ("J8", 9, 4, 3, 2);
jugadoresEquipo8[9] = new Jugador ("K8", 10, 8, 2, 0);
jugadoresEquipo8[10] = new Jugador ("L8", 11, 59, 4, 0);

//Datos de los jugadores del Equipo9
Jugador [] jugadoresEquipo9 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo9[0] = new Jugador ("A9", 1, 4, 1, 4);
jugadoresEquipo9[1] = new Jugador ("B9", 2, 7, 0, 0);
jugadoresEquipo9[2] = new Jugador ("C9", 3, 4, 7, 2);
jugadoresEquipo9[3] = new Jugador ("D9", 4, 6, 2, 1);
jugadoresEquipo9[4] = new Jugador ("E9", 5, 45, 3, 1);
jugadoresEquipo9[5] = new Jugador ("F9", 6, 3, 4, 0);
jugadoresEquipo9[6] = new Jugador ("G9", 7, 5, 0, 0);
jugadoresEquipo9[7] = new Jugador ("H9", 8, 3, 0, 0);
jugadoresEquipo9[8] = new Jugador ("J9", 9, 4, 3, 2);
jugadoresEquipo9[9] = new Jugador ("K9", 10, 8, 2, 0);
jugadoresEquipo9[10] = new Jugador ("L9", 11, 58, 4, 0);

//Datos de los jugadores del Equipo10
Jugador [] jugadoresEquipo10 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo10[0] = new Jugador ("A10", 1, 4, 1, 4);
jugadoresEquipo10[1] = new Jugador ("B10", 2, 7, 0, 0);
jugadoresEquipo10[2] = new Jugador ("C10", 3, 4, 6, 2);
jugadoresEquipo10[3] = new Jugador ("D10", 4, 6, 2, 1);
jugadoresEquipo10[4] = new Jugador ("E10", 5, 45, 3, 1);
jugadoresEquipo10[5] = new Jugador ("F10", 6, 3, 4, 0);
jugadoresEquipo10[6] = new Jugador ("G10", 7, 5, 0, 0);
jugadoresEquipo10[7] = new Jugador ("H10", 8, 3, 0, 0);
jugadoresEquipo10[8] = new Jugador ("J10", 9, 4, 3, 2);
jugadoresEquipo10[9] = new Jugador ("K10", 10, 8, 2, 0);
jugadoresEquipo10[10] = new Jugador ("L10", 11, 57, 4, 0);		
//Datos de los jugadores del Equipo11
Jugador [] jugadoresEquipo11 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo11[0] = new Jugador ("A11", 1, 4, 1, 4);
jugadoresEquipo11[1] = new Jugador ("B11", 2, 7, 0, 0);
jugadoresEquipo11[2] = new Jugador ("C11", 3, 4, 5, 2);
jugadoresEquipo11[3] = new Jugador ("D11", 4, 6, 2, 1);
jugadoresEquipo11[4] = new Jugador ("E11", 5, 45, 3, 1);				
jugadoresEquipo11[5] = new Jugador ("F10", 6, 3, 4, 0);
jugadoresEquipo11[6] = new Jugador ("G11", 7, 5, 0, 0);
jugadoresEquipo11[7] = new Jugador ("H11", 8, 3, 0, 0);
jugadoresEquipo11[8] = new Jugador ("J11", 9, 4, 3, 2);
jugadoresEquipo11[9] = new Jugador ("K11", 10, 8, 2, 0);
jugadoresEquipo11[10] = new Jugador ("L11", 11, 56, 4, 0);	
//Datos de los jugadores del Equipo12
Jugador [] jugadoresEquipo12 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo12[0] = new Jugador ("A12", 1, 4, 1, 4);
jugadoresEquipo12[1] = new Jugador ("B12", 2, 7, 0, 0);
jugadoresEquipo12[2] = new Jugador ("C12", 3, 4, 5, 2);
jugadoresEquipo12[3] = new Jugador ("D12", 4, 6, 2, 1);
jugadoresEquipo12[4] = new Jugador ("E12", 5, 45, 3, 1);				
jugadoresEquipo12[5] = new Jugador ("F10", 6, 3, 4, 0);
jugadoresEquipo12[6] = new Jugador ("G12", 7, 5, 0, 0);
jugadoresEquipo12[7] = new Jugador ("H12", 8, 3, 0, 0);
jugadoresEquipo12[8] = new Jugador ("J12", 9, 4, 3, 2);
jugadoresEquipo12[9] = new Jugador ("K12", 10, 8, 2, 0);
jugadoresEquipo12[10] = new Jugador ("L12", 11, 55, 4, 0);	
//Datos de los jugadores del Equipo13
Jugador [] jugadoresEquipo13 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo13[0] = new Jugador ("A13", 1, 4, 1, 4);
jugadoresEquipo13[1] = new Jugador ("B13", 2, 7, 0, 0);
jugadoresEquipo13[2] = new Jugador ("C13", 3, 4, 4, 2);
jugadoresEquipo13[3] = new Jugador ("D13", 4, 6, 2, 1);
jugadoresEquipo13[4] = new Jugador ("E13", 5, 45, 3, 1);				
jugadoresEquipo13[5] = new Jugador ("F10", 6, 3, 4, 0);
jugadoresEquipo13[6] = new Jugador ("G13", 7, 5, 0, 0);
jugadoresEquipo13[7] = new Jugador ("H13", 8, 3, 0, 0);
jugadoresEquipo13[8] = new Jugador ("J13", 9, 4, 3, 2);
jugadoresEquipo13[9] = new Jugador ("K13", 10, 8, 2, 0);
jugadoresEquipo13[10] = new Jugador ("L13", 11, 54, 4, 0);		
//Datos de los jugadores del Equipo14
Jugador [] jugadoresEquipo14 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo14[0] = new Jugador ("A14", 1, 4, 1, 4);
jugadoresEquipo14[1] = new Jugador ("B14", 2, 7, 0, 0);
jugadoresEquipo14[2] = new Jugador ("C14", 3, 4, 3, 2);
jugadoresEquipo14[3] = new Jugador ("D14", 4, 6, 2, 1);
jugadoresEquipo14[4] = new Jugador ("E14", 5, 45, 3, 1);				
jugadoresEquipo14[5] = new Jugador ("F10", 6, 3, 4, 0);
jugadoresEquipo14[6] = new Jugador ("G14", 7, 5, 0, 0);
jugadoresEquipo14[7] = new Jugador ("H14", 8, 3, 0, 0);
jugadoresEquipo14[8] = new Jugador ("J14", 9, 4, 3, 2);
jugadoresEquipo14[9] = new Jugador ("K14", 10, 8, 2, 0);
jugadoresEquipo14[10] = new Jugador ("L14", 11, 53, 4, 0);		
//Datos de los jugadores del Equipo15
Jugador [] jugadoresEquipo15 = new Jugador [jugadoresMaxEquipo];
jugadoresEquipo15[0] = new Jugador ("A15", 1, 4, 1, 4);
jugadoresEquipo15[1] = new Jugador ("B15", 2, 7, 0, 0);
jugadoresEquipo15[2] = new Jugador ("C15", 3, 4, 2, 2);
jugadoresEquipo15[3] = new Jugador ("D15", 4, 6, 2, 1);
jugadoresEquipo15[4] = new Jugador ("E15", 5, 45, 3, 1);				
jugadoresEquipo15[5] = new Jugador ("F10", 6, 3, 4, 0);
jugadoresEquipo15[6] = new Jugador ("G15", 7, 5, 0, 0);
jugadoresEquipo15[7] = new Jugador ("H15", 8, 3, 0, 0);
jugadoresEquipo15[8] = new Jugador ("J15", 9, 4, 3, 2);
jugadoresEquipo15[9] = new Jugador ("K15", 10, 8, 2, 0);
jugadoresEquipo15[10] = new Jugador ("L15", 11, 52, 4, 0);	
*/
	
			





}
