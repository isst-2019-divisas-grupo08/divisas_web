package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Cambio implements Serializable  {
	
	/*public static enum PRIORIDADES {
		NORMAL, ALTA, MUY_ALTA
	}
	
	public static double interesNormal = 0.01;
	public static double interesAlto = 0.02;
	public static double interesMuyAlto = 0.03; */
	
	@Id
	private int idCambio;
	
	private String prioridad;
	private double interes;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Monedero monedero2;
	
	private double cantidad1;
	private double cantidad2;
	
	private String divisa1;
	private String divisa2;
	
	
	// CONSTRUCTOR
	public Cambio(Operacion operacion) {
		
		this.cantidad1 = operacion.cantidad1;
		this.divisa1 = operacion.monedero1.getDivisa();
		this.divisa2 = monedero2.getDivisa();
		
	}


	public int getIdCambio() {
		return idCambio;
	}

	public void setIdCambio(int idCambio) {
		this.idCambio = idCambio;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public Monedero getMonedero2() {
		return monedero2;
	}

	public void setMonedero2(Monedero monedero2) {
		this.monedero2 = monedero2;
	}

	public double getCantidad1() {
		return cantidad1;
	}

	public void setCantidad1(double cantidad1) {
		this.cantidad1 = cantidad1;
	}
	
	public double getCantidad2() {
		return cantidad2;
	}

	public void setCantidad2(double cantidad2) {
		this.cantidad2 = cantidad2;
	}
	
	public String getDivisa1() {
		return divisa1;
	}

	public void setDivisa1(String divisa1) {
		this.divisa1 = divisa1;
	}
	
	public String getDivisa2() {
		return divisa2;
	}

	public void setDivisa2(String divisa2) {
		this.divisa2 = divisa2;
	}
	
	
}