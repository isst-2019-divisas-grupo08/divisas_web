package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.Id;

public class Cambio extends Operacion implements Serializable  {
	
	public static enum PRIORIDADES {
		NORMAL, ALTA, MUY_ALTA
	}
	
	public static double interesNormal = 0.01;
	public static double interesAlto = 0.02;
	public static double interesMuyAlto = 0.03;
	
	@Id
	private int idCambio;
	
	private PRIORIDADES prioridad;
	private double interes;
	private int idMonederoDestino;
	
	// CONSTRUCTOR
	public Cambio (
			int idOperacion,
			double cantidad,
			int monederoOrigen,
			int idCambio,
			PRIORIDADES prioridad)
	{	
		super(idOperacion, cantidad, monederoOrigen);
		
		this.idCambio = idCambio;
		this.prioridad = prioridad;
		
		switch(prioridad) {
		case NORMAL:
			this.interes = interesNormal;
			break;
		case ALTA:
			this.interes = interesAlto;
			break;
		case MUY_ALTA:
			this.interes = interesMuyAlto;
			break;
		}
	}
	
	
	// Getters y Setters
	public int getIdCambio() {
		return this.idCambio;
	}
					
	public void setIdCambio(int idCambio) {
		this.idCambio = idCambio;
	}
	
	public PRIORIDADES getPrioridad() {
		return prioridad;
	}
					
	public void setPrioridad(PRIORIDADES prioridad) {
		this.prioridad = prioridad;
	}
	
	public double getInteres() {
		return interes;
	}
					
	public void setInteres(Double interes) {
		this.interes = interes;
	}
	
	public int getIdMonederoDestino() {
		return idMonederoDestino;
	}
					
	public void setMonedero2(int idMonederoDestino) {
		this.idMonederoDestino = idMonederoDestino;
	}
	

}
