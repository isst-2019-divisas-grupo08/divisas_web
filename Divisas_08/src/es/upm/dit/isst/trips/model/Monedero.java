package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.*;
import java.util.*;

@Entity
public class Monedero implements Serializable {
	
	/*public static enum SYMBOLS {
			EUR, USD, AUD, CAD, CHF, GBP, JPY,
			
	}
	
	public static enum DIVISAS {
		EURO, DOLAR_AMERICANO, DOLAR_AUSTRALIANO, DOLAR_CANADIENSE, FRANCO_SUIZO, LIBRA, YEN, 		
} */
	
	// Primary key
	@Id
	private int id;
	
	private String simbolo;
	private String divisa;
	
	@OneToOne(fetch=FetchType.EAGER) 
	public Map<String, Double> saldo = new HashMap<String, Double>();
	
	
	
	// CONSTRUCTOR	
	public Monedero() {
		
		
		/*this.divisa = divisa;
		this.cantidad.put(SYMBOLS.EUR, 0.0);
		this.cantidad.put(SYMBOLS.GBP, 0.0);
		this.cantidad.put(SYMBOLS.USD, 0.0);
		this.cantidad.put(SYMBOLS.JPY, 0.0);
		this.cantidad.put(SYMBOLS.AUD, 0.0);
		this.cantidad.put(SYMBOLS.CHF, 0.0);
		this.cantidad.put(SYMBOLS.CAD, 0.0);*/
		
		
	}
	
	// Getters y Setters
	public int getId() {
		return this.id;
	}
						
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDivisa() {
		return this.divisa;
	}
						
	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
	
	public String getSimbolo() {
		return this.simbolo;
	}
						
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public Map<String, Double> getSaldo() {
		return saldo;
	}

	public void setSaldo(Map<String, Double> saldo) {
		this.saldo = saldo;
	}
	
	/*public void addSaldo(String divisa, Double saldo) {
		Double oldSaldo = this.cantidad.get(divisa);
		cantidad.put(divisa, (oldSaldo+saldo));
		
	}
	
	public void lessCantidad(String divisa, Double saldo) {
		Double oldSaldo = this.cantidad.get(divisa);
		cantidad.put(divisa, (oldSaldo-saldo));
		
	}*/

}
