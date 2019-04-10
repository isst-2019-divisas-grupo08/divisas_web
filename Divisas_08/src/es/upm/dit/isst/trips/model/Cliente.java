package es.upm.dit.isst.trips.model;

import java.io.Serializable;

import javax.persistence.Id;


public class Cliente implements Serializable {
	
	// Primary key
	@Id
	private int id;
	
	private String email, contraseña, nombre, apellido, DNI, pais, sexo, tratamiento, nacimiento, direccion;
	private int telefono;
	private Cuenta cuenta;

	// Constructor ¿necesario?
	public Cliente() {
		
	}
	
	
	// Getters y Setters
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getTratamiento() {
		return tratamiento;
	}
	
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	public String getNacimiento() {
		return nacimiento;
	}
	
	public void setNacimiento(String nacimiento) {
		this.email = nacimiento;
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
	
	public Cuenta getCuenta() {
		return cuenta;
	}
	
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	

}
