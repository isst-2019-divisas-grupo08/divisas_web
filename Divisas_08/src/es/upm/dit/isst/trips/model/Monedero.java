package es.upm.dit.isst.trips.model;

import java.io.Serializable;

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

	// Primary keySet 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private SYMBOLS symbol;
	private DIVISAS divisa;
	private double saldo;

	
	public Monedero() {
		
	}
	// CONSTRUCTOR
	public Monedero(int divisaId){
		this.divisa = getDivisaFromInt(divisaId);
		this.symbol = getSymbolFromInt(divisaId);
		this.saldo = 0;
	}

	private SYMBOLS getSymbolFromInt(int divisaId) {
		switch (divisaId) {
		case 1:
			return SYMBOLS.EUR;
		case 2:
			return SYMBOLS.GBP;
		case 3:
			return SYMBOLS.USD;
		case 4:
			return SYMBOLS.JPY;
		case 5:
			return SYMBOLS.AUD;
		case 6:
			return SYMBOLS.CAD;
		case 7:
			return SYMBOLS.CHF;
		}
		return null;
	}

	private DIVISAS getDivisaFromInt(int divisaId) {
		switch (divisaId) {
		case 1:
			return DIVISAS.EURO;
		case 2:
			return DIVISAS.LIBRA;
		case 3:
			return DIVISAS.DOLAR_AMERICANO;
		case 4:
			return DIVISAS.YEN;
		case 5:
			return DIVISAS.DOLAR_AUSTRALIANO;
		case 6:
			return DIVISAS.DOLAR_CANADIENSE;
		case 7:
			return DIVISAS.FRANCO_SUIZO;
		}
		return null;
	}

	public static boolean checkValidCurrencyId(int id) {
		if (id >= 1 && id <= 7) {
			return true;
		}
		return false;
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

}
