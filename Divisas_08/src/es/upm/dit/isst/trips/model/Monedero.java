package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.*;
import java.util.*;

@Entity
public class Monedero implements Serializable {
	
	public static enum SYMBOLS {
			EUR, USD, AUD, CAD, CHF, GBP, JPY,
			
	}
	
	public static enum DIVISAS {
		EURO, DOLAR_AMERICANO, DOLAR_AUSTRALIANO, DOLAR_CANADIENSE, FRANCO_SUIZO, LIBRA, YEN, 		
}
	
	// Primary key
	@Id
	private int id;
	
	private SYMBOLS symbol;
	private DIVISAS divisa;
	@OneToOne(fetch=FetchType.EAGER) 
	private Map<SYMBOLS, Double> cantidad = new HashMap<SYMBOLS, Double>();
	
	
	
	// CONSTRUCTOR	
	public Monedero(DIVISAS divisa) {
		
		
		this.divisa = divisa;
		this.cantidad.put(SYMBOLS.EUR, 0.0);
		this.cantidad.put(SYMBOLS.GBP, 0.0);
		this.cantidad.put(SYMBOLS.USD, 0.0);
		this.cantidad.put(SYMBOLS.JPY, 0.0);
		this.cantidad.put(SYMBOLS.AUD, 0.0);
		this.cantidad.put(SYMBOLS.CHF, 0.0);
		this.cantidad.put(SYMBOLS.CAD, 0.0);
		
		
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

	public SYMBOLS getSymbol() {
		return symbol;
	}

	public void setSymbol(SYMBOLS symbol) {
		this.symbol = symbol;
	}

	public Map<SYMBOLS, Double> getCantidad() {
		return cantidad;
	}

	public void setCantidad(Map<SYMBOLS, Double> cantidad) {
		this.cantidad = cantidad;
	}
	
	public void addCantidad(SYMBOLS divisa, Double saldo) {
		Double oldSaldo = this.cantidad.get(divisa);
		cantidad.put(divisa, (oldSaldo+saldo));
		
	}
	
	public void lessCantidad(SYMBOLS divisa, Double saldo) {
		Double oldSaldo = this.cantidad.get(divisa);
		cantidad.put(divisa, (oldSaldo-saldo));
		
	}

}
