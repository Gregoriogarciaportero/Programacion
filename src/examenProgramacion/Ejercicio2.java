package examenProgramacion;

	/* 
	 * Pre: ....
	 * Post:  Este programa muestra por pantalla todos la fechas de una tabla.
	 * Tanto las que son correctas como las que no, según el formato de fecha dd/mm/aaaa.
	 * Siendo dd numeros del 1 al 31, incluidos.
	 * Siendo mm numeros del 1 al 12, incluidos.
	 * siendo aaaa cualquier numero de 4 cifras.
	 * Observacion: solo el anyo bisiesto tiene 29 dias.
	 * Finalmente se imprimen todas fechas indicando cuales son correctas y cuales no.
	 */
public class Ejercicio2 {
		
	/*
	 * Pre:..
	 * Post: método que muestra por pantalla las fechas almacenadas en la lista
	 * [listaFechas] en formato "dd/mm/aaaa", seguidas de "OK" si 
	 * son validas, o de "ERROR" si no lo son.
	 */
	public static void comprobarFechas(String[] t) {
		boolean fechaValida= true;
		boolean anoBisiesto = true;
		for (int i=0; i<t.length;i++) {
				String diastring = t[i].substring (0, 2);
				int dia = Integer.parseInt(diastring);
				String messtring = t[i].substring (3, 5);
				int mes = Integer.parseInt(messtring);
				String anostring = t[i].substring (6,10);
				int ano = Integer.parseInt(anostring);
				fechaValida = esValido (dia, mes, ano);
				if (fechaValida==true) {
					System.out.println (dia+"/"+mes+"/"+ano+ " -> OK ");
				}else {
					System.out.println (dia+"/"+mes+"/"+ano+ " -> ERROR ");
				}
			
			}
		}
			
		

	
	/*
	 * Pre:..
	 * Post: metodo que devuelve [true] si y solo si la fecha formada por
	 * el [anyo], [mes], [dia] pasados como parametro es valida, es decir,
	 * es una fecha de nuestro calendario.
	 */
	private static boolean esValido (int dia, int mes, int ano) {
		boolean cierto = true;
		boolean anoBisiesto = true;
		anoBisiesto = esBisiesto (ano);
		if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && ( ano >= 1900  && ano <= 2100)) {
			
			cierto = true;
		
		} else {
			cierto=false;
		}
		return cierto;
		}
		
	/*
	 * Pre: ---
	 * Post: devuelve [true] sí y solo sí el [ano] pasado como
	 * parámetro es bisiesto. En caso contrario, devuelve [false].
	 */
		private static boolean esBisiesto(int ano) {
			if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
				return true;
			else
				return false;
		}
		
		public static void main (String[] args) {
			String[] t = {"28/02/1995", "28/03/2010", 
					"32/12/1995", "02/01/2019", "29/02/2024"};
			comprobarFechas(t);
			
		}
	}
	
	
	
	
	
	
		
		
		
		
		

