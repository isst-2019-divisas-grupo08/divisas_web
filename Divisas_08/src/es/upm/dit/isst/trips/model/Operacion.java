package es.upm.dit.isst.trips.model;

import java.util.Collection;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class Operacion implements Serializable {

	// Primary key
		@Id
		private int idOperacion;
			
		protected boolean operacionRealizada;
		private double cantidad;
		private Date fechaOperacion;
		private Monedero monedero;
		
		
		public Operacion(int idOperacion, double cantidad, Monedero monedero) {
			this.idOperacion = idOperacion;
			this.operacionRealizada = false;
			this.cantidad = cantidad;
			this.monedero = monedero;
		}
			
		public int getIdOperacion() {
			return this.idOperacion;
		}
		
		public void setIdOperacion(int idOperacion) {
			this.idOperacion = idOperacion;
		}
		
		public boolean getOperacionRealizada() {
			return this.operacionRealizada;
		}
		
		public void setOperacionRealizada(boolean operacionRealizada) {
			this.operacionRealizada = operacionRealizada;
		}
		
		public double getCantidad() {
			return this.cantidad;
		}
		
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		
		public Date getFechaOperacion() {
			return this.fechaOperacion;
		}
		
		public void setFechaOperacion(Date fechaOperacion) {
			this.fechaOperacion = fechaOperacion;
		}
		
		public Monedero getMonedero() {
			return this.monedero;
		}
		
		public void setMonedero(Monedero monedero) {
			this.monedero = monedero;
		}
		
}
