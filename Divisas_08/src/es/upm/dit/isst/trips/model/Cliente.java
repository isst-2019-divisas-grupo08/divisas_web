package es.upm.dit.isst.trips.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.*;

@Entity
public class Cliente implements Serializable {
	@Id
	private int clienteId;
	private String email;
	private String password;
	private String nombre;
	private String apellido;
	private String DNI;
	private String pais;
	private String tratamiento; 
	private String direccion;
	private int telefono;
	private String sexo;
	private Date nacimiento;

	@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name = "Cliente_Cuentas", 
            joinColumns = { @JoinColumn(name = "cliente_id") }, 
            inverseJoinColumns = { @JoinColumn(name="cuenta_id", nullable=false) }
    )
	private Set<Cuenta> cuentas = new HashSet<>();
	
	public Cliente() {
		super();
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}


	public long getClientId() {
		return clienteId;
	}


	public void setClientId(int clientId) {
		this.clienteId = clientId;
	}


	public Set<Cuenta> getCuentas() {
		return cuentas;
	}


	public void setCuentas(Set<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}


	
}
