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
	private double saldo;
	
    @ManyToOne
    @JoinColumn(name="cuenta_id", nullable=false)
    private Cuenta cuenta;
	
	
	// CONSTRUCTOR	
	public Monedero(DIVISAS divisa) {
		this.divisa = divisa;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
}
