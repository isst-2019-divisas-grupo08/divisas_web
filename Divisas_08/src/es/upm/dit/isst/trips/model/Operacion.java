package es.upm.dit.isst.trips.model;

import java.util.Collection;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class Operacion implements Serializable {

	// Primary key
		@Id
		private int id;
			
		private boolean estado;
		
		private Date fecha;
		
		private Monedero monedero1;
		private double cantidad1, cantidad2;
			
		
		
		
		public Operacion() {
			
		}
			
		// Getters y Setters
		
}
