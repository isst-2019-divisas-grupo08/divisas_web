package es.upm.dit.isst.trips.model;

import java.util.Collection;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class Operacion implements Serializable {

	// Primary key
		@Id
		protected int idOperacion;
		
		protected double cantidad;
		protected int idMonederoOrigen;	
		private boolean operacionRealizada;
		private Date fechaOperacion;
		
		
		public Operacion() {
			this.operacionRealizada = false;
			
		}
		
		public Operacion(int idOperacion, double cantidad, int monederoOrigen) {
			this.idOperacion = idOperacion;
			this.operacionRealizada = false;
			this.cantidad = cantidad;
			this.idMonederoOrigen = monederoOrigen;
		}
		
			
		public int getIdOperacion() {
			return idOperacion;
		}
		
		public void setIdOperacion(int idOperacion) {
			this.idOperacion = idOperacion;
		}
		
		public boolean getOperacionRealizada() {
			return operacionRealizada;
		}
		
		public void setOperacionRealizada(boolean operacionRealizada) {
			this.operacionRealizada = operacionRealizada;
		}
		
		public double getCantidad() {
			return cantidad;
		}
		
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		
		public Date getFechaOperacion() {
			return fechaOperacion;
		}
		
		public void setFechaOperacion(Date fechaOperacion) {
			this.fechaOperacion = fechaOperacion;
		}
		
		public int getIdMonederoOrigen() {
			return idMonederoOrigen;
		}
		
		public void setIdMonederoOrigen(int idMonederoOrigen) {
			this.idMonederoOrigen = idMonederoOrigen;
		}
		
}
