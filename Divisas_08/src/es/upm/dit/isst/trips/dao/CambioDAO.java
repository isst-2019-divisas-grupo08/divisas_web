package es.upm.dit.isst.trips.dao;

import es.upm.dit.isst.trips.model.Cambio;

public interface CambioDAO {
	
	public void createCambio(Cambio cambio);

	public Cambio readCambio(int idCambio);

	public void updateCambio(Cambio cambio);

	public void deleteCambio(Cambio cambio);
	
}
