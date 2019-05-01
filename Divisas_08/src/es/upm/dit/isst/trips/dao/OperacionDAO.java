package es.upm.dit.isst.trips.dao;

import es.upm.dit.isst.trips.model.Operacion;

public interface OperacionDAO {
	
	public void createOperacion(Operacion operacion);

	public int readOperacion(int idCambio, double interes);

	public void updateOperacion(Operacion operacion);

	public void deleteOperacion(Operacion operacion);

}
