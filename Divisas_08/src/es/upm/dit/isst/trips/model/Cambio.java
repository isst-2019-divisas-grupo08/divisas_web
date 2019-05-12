package es.upm.dit.isst.trips.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
public class Cambio implements Serializable  {
	
	public static enum PRIORIDADES {
		NORMAL, ALTA, MUY_ALTA
	}
	
	public static double INTERESNORMAL = 0.01;
	public static double INTERESALTO = 0.02;
	public static double INTERESMUYALTO = 0.03;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCambio;
	private PRIORIDADES prioridad;
	private double interes;
	private double ratioCambio;
	private double origenDivisa;
	private double destDivisa;
	private SYMBOL origenDivisaSym;
	private SYMBOL destDivisaSym;
	private boolean done;
	private Date fechaSolicitud;
	
    
	// CONSTRUCTOR
    public Cambio() {
    	
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

	public double getRatioCambio() {
		return ratioCambio;
	}

	public void setRatioCambio(double ratioCambio) {
		this.ratioCambio = ratioCambio;
	}

	public double getOrigenDivisa() {
		return origenDivisa;
	}

	public void setOrigenDivisa(double origenDivisa) {
		this.origenDivisa = origenDivisa;
	}

	public double getDestDivisa() {
		return destDivisa;
	}

	public void setDestDivisa(double destDivisa) {
		this.destDivisa = destDivisa;
	}

	public SYMBOL getDestDivisaSym() {
		return destDivisaSym;
	}


	public void setDestDivisaSym(SYMBOL destDivisaSym) {
		this.destDivisaSym = destDivisaSym;
	}


	public SYMBOL getOrigenDivisaSym() {
		return origenDivisaSym;
	}


	public void setOrigenDivisaSym(SYMBOL origenDivisaSym) {
		this.origenDivisaSym = origenDivisaSym;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}


	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public boolean checkIfFinished(Date now) {
		switch(prioridad) {
		case ALTA:
			if(now.getTime()- fechaSolicitud.getTime() >= 30*1000)
				done = true;
		case MUY_ALTA:
			if(now.getTime()- fechaSolicitud.getTime() >= 10*1000)
				done = true;
		case NORMAL:
			if(now.getTime()- fechaSolicitud.getTime() >= 180*1000)
				done = true;
		}
		return done;
	}
	

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

}