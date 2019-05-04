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
	public Cliente()
//	(
//			int id,
//			String email,
//			String password,
//			String nombre,
//			String apellido,
//			String DNI, 
//			String pais,
//			String tratamiento,
//			SEXOS sexo,
//			Date nacimiento)
	{		
//		this.id = id;
//		this.email = email;
//		this.password = password;
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.DNI = DNI;
//		this.pais = pais;
//		this.tratamiento = tratamiento;
//		this.sexo = sexo;
//		this.nacimiento = nacimiento;
	}
	
	// Getters y Setters
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
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public SEXOS getSexo() {
		return sexo;
	}
	
	public void setSexo(SEXOS sexo) {
		this.sexo = sexo;
	}
	
	public String getTratamiento() {
		return tratamiento;
	}
	
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	public Date getNacimiento() {
		return nacimiento;
	}
	
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
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
