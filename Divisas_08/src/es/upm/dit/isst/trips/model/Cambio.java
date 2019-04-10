package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.Id;

public class Cambio extends Operacion implements Serializable  {
	
	@Id
	private int idCambio;
	
	private int prioridad;
	private double interes;
	private Monedero monedero2;
	
	// CONSTRUCTOR
	public Cambio () {
		
	}
	
	// Getters y Setters
	public int getIdCambio() {
		return idCambio;
	}
					
	public void setIdCambio(int idCambio) {
		this.idCambio = idCambio;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
					
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public double getInteres() {
		return interes;
	}
					
	public void setInteres(Double interes) {
		this.interes = interes;
	}
	
	public Monedero getMonedero2() {
		return monedero2;
	}
					
	public void setMonedero2(Monedero monedero2) {
		this.monedero2 = monedero2;
	}
	

}
