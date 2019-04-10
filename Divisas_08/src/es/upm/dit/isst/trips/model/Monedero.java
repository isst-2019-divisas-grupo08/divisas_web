package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.Id;

public class Monedero implements Serializable {
	
	// Primary key
	@Id
	private int id;
		
	private String divisa, simbolo;
	private int cantidad;
	
	
	// CONSTRUCTOR	
	public Monedero() {
		
	}
	
	// Getters y Setters
	public int getId() {
		return id;
	}
						
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDivisa() {
		return divisa;
	}
						
	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
	
	public String getSimbolo() {
		return simbolo;
	}
						
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	public int getCantidad() {
		return cantidad;
	}
						
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
