package Tarea21;

import java.util.Scanner;

	/*
	 * Pre:..
	 * Post: Crea una clase llamada Cuenta que tendrá los siguientes
	 * atributos: titular y cantidad (puede tener decimales). El titular será
	 * obligatorio y la cantidad es opcional. Crea dos constructores que
	 * cumpla lo anterior. Crea sus métodos get, set y toString.
	 * Tendrá dos métodos especiales:
	 * Metodo ingresar: (double cantidad): se ingresa una cantidad a la cuenta,
	 * si la cantidad introducida es negativa, no se hará nada.
	 * Metodo retirar: (double cantidad): se retira una cantidad a la cuenta, si
	 * restando la cantidad actual a la que nos pasan es negativa, la
	 * cantidad de la cuenta pasa a ser 0.
	 */
public class Ejercicio1 {
	
	/*public static void ingresar (double cantidad, int dni) {
		Scanner enter = new Scanner (System.in);
		double nuevaCantidad = cantidad;
		if (cantidad>=0) {
			
		} else {
			while (cantidad<=0) {
				System.out.print("Teclee nuevamente el importe a ingresar en la cuenta: ");
				nuevaCantidad = enter.nextDouble ();
			}
		}
		Cliente.setcantidad(nuevaCantidad);
	}*/
	
	/*public static void retirar (double cantidad, int dni) {
		if (cantidad<Ejercicio1Cuenta) {
			System.out.print("Teclee nuevamente el importe a retirar en la cuenta,"
					+ "su saldo es de : " + cliente.getCantidad);
		} else {
			while (cantidad<=0) {
				
			}
		}
		Ejercicio1Cuenta Cliente = new Ejercicio1Cuenta (titular, cantidad);
	}*/
		
	
	public static void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		System.out.println("Teclee el nombre de titular de la cuenta bancaria: ");
		String titular = enter.nextLine ();
		System.out.println("Teclee el DNI del titular de la cuenta sin letra: ");
		int dni = enter.nextInt ();
		System.out.println("Teclee el nombre de password de seguridad ");
		String password = enter.nextLine ();
		Cuenta Cliente = new Cuenta (titular, dni);
		System.out.println(" ¿ Que necesita hacer ingresar o retirar efectivo ? ");
		System.out.println (" Para ingresar introduzca un 1, para retirar introduzca un 2 y para salir introduzca el 0");
		int opcion = enter.nextInt ();
		System.out.println(" Introduzca la cantidad deseada ");
		double cantidad = enter.nextDouble ();
		
		if (opcion==1) {
			ingresar (cantidad, dni);
		} if (opcion ==2) {
			retirar (cantidad, dni);
		} else {
			System.out.println ( " Termino el programa, gracias por utilizar nuestro servicio");
		
		
		}
			
		}
		
		
		String nuevoNombre = entrada.next();
		
	
			Cuenta cliente = new Cuenta("Alvaro", 20000);
			cliente.ingresar(15000);
			System.out.println(cliente.toString());
			cliente.retirar(5000);
			System.out.println(cliente.toString());
			cliente.retirar(50000);
			System.out.println(cliente.toString());
			
			Cuenta cliente2 = new Cuenta("Alberto");
			System.out.println(cliente2.toString());
		}
	}
		System.out.println("El nuevo nombre es: " + estudiante.getNombre())
		
		
		enter.close();
	}

}
