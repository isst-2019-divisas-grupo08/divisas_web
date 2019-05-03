package es.upm.dit.isst.trips.dao;


import es.upm.dit.isst.trips.model.Monedero;
import java.util.Collection;

public interface MonederoDAO {
	
	public void createMonedero(Monedero monedero);

	public Monedero readMonedero(int idMonedero);

	public void updateMonedero(Monedero monedero);

	public void deleteMonedero(Monedero monedero);
	
	public Collection<Monedero> readAll();
}
