package es.upm.dit.isst.trips.model;

import java.util.Collection;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
public class Operacion implements Serializable {
	
	/*public static enum estadoOperacion {
		Denegada, Procesando, Realizada, Cancelada, VACIO,
		
	}
	public enum Tipo{
		INGRESAR, SACAR, GASTAR, CAMBIO_DIVISAS, CAMBIO_DIVISAS_SACAR,
	} */
	
	// Primary key
		@Id
		private int idOperacion;
		
		public double cantidad1;
		
		@OneToOne(fetch=FetchType.EAGER)
		protected Monedero monedero1;
		
		private String estado;
		private Date fechaOperacion;
		
		/*@OneToMany(fetch=FetchType.EAGER) 
		private Cliente cliente; */
				
		
		public Operacion() {
			
		}


		public int getIdOperacion() {
			return idOperacion;
		}


		public void setIdOperacion(int idOperacion) {
			this.idOperacion = idOperacion;
		}


		/*public double getSaldo() {
			return saldo;
		}


		public void setSaldo(double saldo) {
			this.saldo = saldo;
		} */


		public double getCantidad1() {
			return cantidad1;
		}


		public void setCantidad1(double cantidad1) {
			this.cantidad1 = cantidad1;
		}


		public Monedero getMonedero1() {
			return monedero1;
		}


		public void setMonedero1(Monedero monedero1) {
			this.monedero1 = monedero1;
		}


		public String getEstado() {
			return estado;
		}


		public void setEstado(String estado) {
			this.estado = estado;
		}


		public Date getFechaOperacion() {
			return fechaOperacion;
		}


		public void setFechaOperacion(Date fechaOperacion) {
			this.fechaOperacion = fechaOperacion;
		}
		

		
			

}
