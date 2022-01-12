package Tarea10_tabla_multid;

	/* Pre:..
	 * Post: Tenemos la siguiente tabla:
	 *		 String nombres[] = {"Pepe","Juan","Mar�a","Antonio", "Luisa"};
	 *		 Implementa un programa Java que ordene la tabla anterior
	 *	 	 alfab�ticamente, y muestre el resultado final por pantalla.
	 */

public class Ejercicio5 {
	
	/* Pre:..
	 * Post: Este m�todo ordena los nombres de la tabla unidimensional
	 */
	
	public static void ordenar (String a []) {
			//Bucle que fija la posici�n i
			for(int i=0;i<(a.length);i++){
				//Bucle que toma una posici�n j=i+1
				for(int j=i+1;j<a.length;j++){
					/* Bucle que compara alfab�ticamente los dos valores de strig
					 * Si empieza con una letra de alfabeto menor entonces es
					 * se pone en una posici�n adelantada o anterior
					 */
					
					if(a[i].compareToIgnoreCase(a[j])>0){
                            /* Intercambiamos valores j en i , i en j
                             * me apoyo en una variable auxiliar
                             */ 
						String variableauxiliar=a[i];
                        a[i]=a[j];
                        a[j]=variableauxiliar;
                        }
                    }
				}
		imprimir (a);		
	}
	
	/* 
	 * M�todo que imprime la tabla
	 */
	
	public static void imprimir (String b []) {
		System.out.print("La tabla ordenada es: ");
		for(int i=0;i<(b.length);i++){
                    System.out.print( b[i]+", ");
		}
	}

	public static void main(String[] args) {
		String nombres[] = {"Pepe","Juan","Mar�a","Antonio", "Luisa", "Gregorio", "Esteban", "Zatrustegui"};
		ordenar (nombres);
	}

}
