package es.upm.dit.isst.trips.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
public class Cuenta implements Serializable {

	// Primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numeroCuenta;
	private int tarjeta;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
	@JoinColumn(name = "cuenta_id")
	private Set <Monedero> monederos = new HashSet<Monedero>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
	@JoinColumn(name = "cuenta_id")
	private Set<GastoIngreso> hitorialGastosIngresos = new HashSet<>();
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
	@JoinColumn(name = "cuenta_id")
	private Set<Cambio> historialCambios = new HashSet<>();

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Cuenta() {

	}

	// Getters y Setters
	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setTarjeta(int tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Set<Monedero> getMonederos() {
		return monederos;
	}

	public void setMonederos(Set<Monedero> monederos) {
		this.monederos = monederos;
	}

	public void addMonederos(Monedero monedero) {
		this.monederos.add(monedero);
	}
	
	public Monedero getMonederoByCurrency(int currencyId) {
		for(Monedero monedero : monederos) {
			if(monedero.getDivisa() == Monedero.getDivisaFromInt(currencyId))
				return monedero;
		}
		return null;
	}
	
	public Monedero getMonederoByCurrency(SYMBOL sym) {
		for(Monedero monedero : monederos) {
			if(monedero.getSymbol() == sym)
				return monedero;
		}
		return null;
	}

	public Set<GastoIngreso> getHitorialGastosIngresos() {
		return hitorialGastosIngresos;
	}

	public void setHitorialGastosIngresos(Set<GastoIngreso> hitorialGastosIngresos) {
		this.hitorialGastosIngresos = hitorialGastosIngresos;
	}

	public void addHitorialGastosIngresos(GastoIngreso gastoIngreso) {
		this.hitorialGastosIngresos.add(gastoIngreso);
	}

	public Set<Cambio> getHistorialCambios() {
		return historialCambios;
	}

	public void setHistorialCambios(Set<Cambio> historialCambios) {
		this.historialCambios = historialCambios;
	}

	public void addHistorialCambios(Cambio cambio) {
		this.historialCambios.add(cambio);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	// Funciones de Cuenta
	public Set<Cambio> getCambiosPendientes(){
		Set<Cambio> cambiosPendientes = new HashSet<Cambio>();
		for(Cambio cambio : historialCambios) {
			if(!cambio.isDone()) {
				cambiosPendientes.add(cambio);
			}
		}
		return cambiosPendientes;
	}
}
