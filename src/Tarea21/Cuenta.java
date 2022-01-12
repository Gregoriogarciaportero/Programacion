package Tarea21;

public class Cuenta {
		private int codigoCliente;
		private String titular;
		private int dni;
		private double cantidad;
		private String password;
		
		// constructor 1
		public Cuenta (String titular, int dni, double cantidad, String password ) {
			this.codigoCliente = codigoCliente;
			this.titular = titular;
			this.dni= dni;
			this.cantidad = cantidad;
			this.password = password;
		}
		
		// constructor 2
		public Cuenta (String titular) {
			this.titular = titular ;
			this.dni = dni;
			this.cantidad = 0;
		}
		
		// Atributo codigoCuenta
		public int getCodigoCliente() {
			return codigoCliente;
		}
		
		public void setCodigoCliente(int codigoCliente) {
			this.codigoCliente = codigoCliente;
		}
		
		public String getTitular() {
			return titular;
		}
		
		public void setTitular(String titular) {
			this.titular = titular;
		}

		public int getDni() {
			return dni;
		}
		
		public void setDni(int dni) {
			this.dni = dni;
		}
		
		
		public double getCantidad() {
			return cantidad;
		}
		
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		
		public String getPassword() {
			return password;
		}
		
		public void setPassword(String password) {
			this.password = password;
			
	//	public void mostradEjercicio1Cuenta( titular, ) {
		//	System.out.println("Titular: " + titular);
			//System.out.println("DNI: " + dni);
			// System.out.println("Cantidad: " + cantidad);	
		//}
}
		
	
		//this.cantidad = this.cantidad +cantidad;
		
		//this.cantidad - cantidad < 0
		
		// public String 
		public void ingresar(double cantidad) {
			if(cantidad > 0) {
				this.cantidad = this.cantidad + cantidad;
			} else {
				System.out.println("La cantidad es negativa");
			}
		}
		
		public void retirar(double cantidad) {
			if(this.cantidad - cantidad < 0) {
				this.cantidad = 0;
			} else {
				this.cantidad = this.cantidad - cantidad;
			}
		}
		
		@Override
		public String toString() {
			return "Titular = " + titular + "\nCantidad = " + cantidad;
		}
	}