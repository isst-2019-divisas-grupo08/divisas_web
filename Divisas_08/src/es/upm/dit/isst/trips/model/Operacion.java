package es.upm.dit.isst.trips.model;

import java.util.Collection;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@MappedSuperclass
public class Operacion implements Serializable {
	
	public static enum estadoOperacion {
		Denegada, Procesando, Realizada, Cancelada, VACIO,
		
	}
	public enum Tipo{
		INGRESAR, SACAR, GASTAR, CAMBIO_DIVISAS, CAMBIO_DIVISAS_SACAR,
	}
	// Primary key
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		protected int idOperacion;
		
	    protected double saldo;
	    protected double cantidadDivisa;
		protected Monedero monederoOrigen;	
		protected estadoOperacion estado;
		protected Date fechaOperacion;
		protected Tipo tipoDivisa;
		
		
		public Operacion() {
			this.estado = estadoOperacion.VACIO;	
		}
		
		public Operacion(double saldo) {
			this.saldo = saldo;
			this.estado = estadoOperacion.VACIO;	
		}


		public int getIdOperacion() {
			return idOperacion;
		}


		public void setIdOperacion(int idOperacion) {
			this.idOperacion = idOperacion;
		}


		public double getSaldo() {
			return saldo;
		}


		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}


		public double getCantidadDivisa() {
			return cantidadDivisa;
		}


		public void setCantidadDivisa(double cantidadDivisa) {
			this.cantidadDivisa = cantidadDivisa;
		}


		public Monedero getMonederoOrigen() {
			return monederoOrigen;
		}


		public void setMonederoOrigen(Monedero monederoOrigen) {
			this.monederoOrigen = monederoOrigen;
		}


		public estadoOperacion getEstado() {
			return estado;
		}


		public void setEstado(estadoOperacion estado) {
			this.estado = estado;
		}


		public Date getFechaOperacion() {
			return fechaOperacion;
		}


		public void setFechaOperacion(Date fechaOperacion) {
			this.fechaOperacion = fechaOperacion;
		}
		

		public Tipo getTipo() {
			return tipoDivisa;
		}


		public void setTipo(Tipo tipo) {
			this.tipoDivisa = tipo;
		}
			

}
