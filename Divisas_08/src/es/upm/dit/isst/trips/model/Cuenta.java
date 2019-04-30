package es.upm.dit.isst.trips.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Id;


public class Cuenta implements Serializable {
	
	// Primary key
		@Id
		private int numeroCuenta;
		
		private Collection<Monedero> monederos;
		private Collection<Operacion> historial;
		
		private int tarjeta;
	
	
		public Cuenta(int numeroCuenta, int tarjeta) {
			
			this.numeroCuenta = numeroCuenta;
			this.tarjeta = tarjeta;
			
			this.monederos = new ArrayList<Monedero>();
			this.historial = new ArrayList<Operacion>();
		
		}
		
		// Getters y Setters
		public int getNumeroCuenta() {
			return this.numeroCuenta;
		}
		
		public void setNumeroCuenta(int numeroCuenta) {
			this.numeroCuenta = numeroCuenta;
		}
		
		public Collection<Monedero> getMonederos() {
			return this.monederos;
		}
		
		public void setEmail(Collection<Monedero> monederos) {
			this.monederos = monederos;
		}
		
		public Collection<Operacion> getHistorialOperaciones() {
			return this.historial;
		}
		
		public void setHistorialOperaciones(Collection<Operacion> historial) {
			this.historial = historial;
		}
		
		public int getTarjeta() {
			return this.tarjeta;
		}
		
		public void setTarjeta(int tarjeta) {
			this.tarjeta = tarjeta;
		}
		
		// Funciones de Cuenta
		
		public void cleanMonederos() {
			this.monederos.clear();
		}

}
