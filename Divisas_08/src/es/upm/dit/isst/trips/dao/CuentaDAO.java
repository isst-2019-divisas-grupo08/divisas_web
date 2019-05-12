package es.upm.dit.isst.trips.dao;

import java.util.Collection;


import es.upm.dit.isst.trips.model.Cuenta;

public interface CuentaDAO {
	
	public void createCuenta(Cuenta cuenta);

	public Cuenta readCuenta(int numeroCuenta);
	
	public Cuenta readCuentaFromUserId(int userId);

	public void updateCuenta(Cuenta cuenta);

	public void deleteCuenta(Cuenta cuenta);

	public Collection<Cuenta> readAll();
}
