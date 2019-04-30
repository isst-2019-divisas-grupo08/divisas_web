package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.Id;

public class Monedero implements Serializable {
	
	public static enum SYMBOLS {
			€, $, A$, C$, Fr, £, ¥, 		
	}
	
	public static enum DIVISAS {
		EURO, DOLAR_AMERICANO, DOLAR_AUSTRALIANO, DOLAR_CANADIENSE, FRANCO_SUIZO, LIBRA, YEN, 		
}
	
	// Primary key
	@Id
	private int id;
	
	private SYMBOLS symbol;
	private DIVISAS divisa;
	private int cantidad;
	
	
	// CONSTRUCTOR	
	public Monedero(int id, DIVISAS divisa) {
		
		this.id = id;
		this.divisa = divisa;
		this.cantidad = 0;
		
	}
	
	// Getters y Setters
	public int getId() {
		return this.id;
	}
						
	public void setId(int id) {
		this.id = id;
	}
	
	public DIVISAS getDivisa() {
		return this.divisa;
	}
						
	public void setDivisa(DIVISAS divisa) {
		this.divisa = divisa;
	}
	
	public SYMBOLS getSimbolo() {
		return this.symbol;
	}
						
	public void setSimbolo(SYMBOLS symbol) {
		this.symbol = symbol;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
						
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
