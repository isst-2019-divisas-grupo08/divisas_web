package es.upm.dit.isst.trips.dao;

import es.upm.dit.isst.trips.model.Cuenta;

public interface CuentaDAO {
	
	public void createCuenta(Cuenta cuenta);

	public Cuenta readCuenta(int numeroCuenta);

	public void updateCuenta(Cuenta cuenta);

	public void deleteCuenta(Cuenta cuenta);


}
