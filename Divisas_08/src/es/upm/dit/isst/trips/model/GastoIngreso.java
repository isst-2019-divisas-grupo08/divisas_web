package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.Id;

	public class GastoIngreso extends Operacion implements Serializable {
		
		// Primary key
		@Id
		private int nOperacion;
			
		private String confPago;
		
		
		// Constructor	
		public GastoIngreso() {
			
		}
		
		// Getters y Setters
		public int getNumeroOperacion() {
			return nOperacion;
		}
				
		public void setNumeroOperacion(int nOperacion) {
			this.nOperacion = nOperacion;
		}
		
		public String getConfPago() {
			return confPago;
		}
				
		public void setNumeroConfPago(String confPago) {
			this.confPago = confPago;
		}
		
		
}
