package ficheros_20220127;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class Ficheros {

	public static void main (String [] args) {
		try {
			Formatter f = new Formatter ("C:\\Users\\Docente\\Documents\\Carpeta Formatter\\ejemplo.txt");
			f.format("hola mundo");
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
