package es.upm.dit.isst.trips.dao;

import es.upm.dit.isst.trips.model.Monedero;

public interface MonederoDAO {
	
	public void createMonedero(Monedero monedero);

	public int readMonedero(int idCambio, double interes);

	public void updateMonedero(Monedero monedero);

	public void deleteMonedero(Monedero monedero);
	

}
