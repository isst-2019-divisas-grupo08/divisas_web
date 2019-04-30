package es.upm.dit.isst.trips.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;

public class Cliente implements Serializable {
	
	public static enum SEXOS {
		HOMBRE, MUJER, OTRO
	}
	
	public static enum TRATAMIENTOS {
		Don, Doña, Sr, Sra
	}
	
	// Primary key
	@Id
	private int id;
	
	private String email, password, nombre, apellido, DNI, pais, tratamiento, direccion;
	private SEXOS sexo;
	private Date nacimiento;
	private int telefono;
	private Cuenta cuenta;

	// Constructor
	public Cliente(
			int id,
			String email,
			String password,
			String nombre,
			String apellido,
			String DNI, 
			String pais,
			String tratamiento,
			SEXOS sexo,
			Date nacimiento)
	{		
		this.id = id;
		this.email = email;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.pais = pais;
		this.tratamiento = tratamiento;
		this.sexo = sexo;
		this.nacimiento = nacimiento;
	}
	
	// Getters y Setters
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public String getPais() {
		return this.pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public SEXOS getSexo() {
		return this.sexo;
	}
	
	public void setSexo(SEXOS sexo) {
		this.sexo = sexo;
	}
	
	public String getTratamiento() {
		return this.tratamiento;
	}
	
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	public Date getNacimiento() {
		return this.nacimiento;
	}
	
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public Cuenta getCuenta() {
		return this.cuenta;
	}
	
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	

}
