package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
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
	private Monedero monederoDestino;
	private double cantidadDivisa;
	
    @ManyToOne
    @JoinColumn(name="cuenta_id", nullable=false)
    private Cuenta cuenta;
	
	// CONSTRUCTOR
	public Cambio (
			double saldo,
			Monedero monederoOrigen,
			PRIORIDADES prioridad)
	{	
		super(saldo);
		
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

	public static double getInteresNormal() {
		return interesNormal;
	}

	public static void setInteresNormal(double interesNormal) {
		Cambio.interesNormal = interesNormal;
	}

	public static double getInteresAlto() {
		return interesAlto;
	}

	public static void setInteresAlto(double interesAlto) {
		Cambio.interesAlto = interesAlto;
	}

	public static double getInteresMuyAlto() {
		return interesMuyAlto;
	}

	public static void setInteresMuyAlto(double interesMuyAlto) {
		Cambio.interesMuyAlto = interesMuyAlto;
	}

	public int getIdCambio() {
		return idCambio;
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

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public Monedero getMonederoDestino() {
		return monederoDestino;
	}

	public void setMonederoDestino(Monedero monederoDestino) {
		this.monederoDestino = monederoDestino;
	}

	public double getCantidadDivisa() {
		return cantidadDivisa;
	}

	public void setCantidadDivisa(double cantidadDivisa) {
		this.cantidadDivisa = cantidadDivisa;
	}
	
	
}