package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class GastoIngreso extends Operacion implements Serializable {
		
		// Primary key
		@Id
		private int nOperacion;
		private String confPago;
		
	    @ManyToOne
	    @JoinColumn(name="cuenta_id", nullable=false)
	    private Cuenta cuenta;
		
	    
		// Constructor	
	    
	    
	    
	    public GastoIngreso() {
	    	super();
	    }
	    
		public GastoIngreso(double saldo) {
			super(saldo);
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
