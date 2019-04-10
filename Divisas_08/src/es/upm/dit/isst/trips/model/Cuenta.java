package es.upm.dit.isst.trips.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Id;


public class Cuenta implements Serializable {
	
	// Primary key
		@Id
		private int numeroCuenta;
		
		private Collection<Monedero> monederos;
		private Collection<Operacion> historial;
		
		private int tarjeta;
	
	
		public Cuenta() {
		
		}
		
		// Getters y Setters
		public int getNumeroCuenta() {
			return numeroCuenta;
		}
		
		public void setNumeroCuenta(int numeroCuenta) {
			this.numeroCuenta = numeroCuenta;
		}
		
		public Collection<Monedero> getMonederos() {
			return monederos;
		}
		
		public void setEmail(Collection<Monedero> monederos) {
			this.monederos = monederos;
		}
		
		public Collection<Operacion> getHistorialOperaciones() {
			return historial;
		}
		
		public void setHistorialOperaciones(Collection<Operacion> historial) {
			this.historial = historial;
		}

}
