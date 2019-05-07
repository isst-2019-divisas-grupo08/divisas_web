package es.upm.dit.isst.trips.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
public class Cuenta implements Serializable {
	
	// Primary key
		@Id
		private int numeroCuenta;
		private int tarjeta;
		
		@OneToMany(fetch=FetchType.EAGER,mappedBy="cuenta")
		private Set<Monedero> monederos = new HashSet<>();


		@OneToMany(fetch=FetchType.EAGER,mappedBy="cuenta")
		private Set<GastoIngreso> hitorialGastosIngresos = new HashSet<>();
		@OneToMany(fetch=FetchType.EAGER,mappedBy="cuenta")
		private Set<Cambio> historialCambios = new HashSet<>();
		
		 
	    @OneToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "cliente_id")
	    private Cliente cliente;

		
		public Cuenta() {
			
		}

		// Getters y Setters
		public int getNumeroCuenta() {
			return this.numeroCuenta;
		}
		
		public void setNumeroCuenta(int numeroCuenta) {
			this.numeroCuenta = numeroCuenta;
		}
		
		public void setTarjeta(int tarjeta) {
			this.tarjeta = tarjeta;
		}
		
		
		public Set<Monedero> getMonederos() {
			return monederos;
		}

		public void setMonederos(Set<Monedero> monederos) {
			this.monederos = monederos;
		}

		public Set<GastoIngreso> getHitorialGastosIngresos() {
			return hitorialGastosIngresos;
		}

		public void setHitorialGastosIngresos(Set<GastoIngreso> hitorialGastosIngresos) {
			this.hitorialGastosIngresos = hitorialGastosIngresos;
		}

		public Set<Cambio> getHistorialCambios() {
			return historialCambios;
		}

		public void setHistorialCambios(Set<Cambio> historialCambios) {
			this.historialCambios = historialCambios;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		
		
		// Funciones de Cuenta

}
